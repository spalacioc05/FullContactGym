/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author spala
 */

public class GestionarUsuario extends GestionarPersona {

    public static Usuario buscarPorIDUsuario(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    return new Usuario(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[12],
                                       data[7], data[8], data[9], Double.parseDouble(data[10]), data[11]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void registrarUsuario(Usuario usuario) {
        if (isIDRegistered(usuario.getId())) {
            JOptionPane.showMessageDialog(null, "El ID ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(usuario.toCSV());
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean actualizarUsuario(Usuario usuario) {
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(usuario.getId())) {
                    data[1] = usuario.getClave();
                    data[2] = usuario.getRol();
                    data[3] = usuario.getNombre();
                    data[4] = usuario.getCorreo();
                    data[5] = usuario.getFechaNacimiento();
                    data[6] = usuario.getGenero();
                    data[7] = usuario.getTipoMembresia();
                    data[8] = usuario.getFechaInicio();
                    data[9] = usuario.getFechaVencimiento();
                    data[10] = String.valueOf(usuario.getMontoPagar());
                    data[11] = usuario.getEstadoPago();
                    data[12] = usuario.getEstado();
                    line = String.join(",", data);
                    found = true;
                }
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
                bw.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return found;
    }

    public static boolean isIDRegistered(String id) {
        return buscarPorIDUsuario(id) != null;
    }
}