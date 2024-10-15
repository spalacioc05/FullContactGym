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

/**
 *
 * @author spala
 */

public class GestionarAdministrador extends GestionarPersona {
    
    public static Administrador buscarPorIDAdministrador(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    return new Administrador(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean actualizarAdministrador(Administrador administrador) {
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(administrador.getId())) {
                    data[1] = administrador.getClave();
                    data[3] = administrador.getNombre();
                    data[4] = administrador.getCorreo();
                    data[5] = administrador.getFechaNacimiento();
                    data[6] = administrador.getGenero();
                    data[7] = administrador.getEstado();
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
}