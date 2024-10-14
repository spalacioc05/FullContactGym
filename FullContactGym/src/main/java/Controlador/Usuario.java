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

public class Usuario extends Persona {
    private String tipoMembresia;
    private String fechaInicio;
    private String fechaVencimiento;
    private double montoPagar;
    private String estadoPago;

    public Usuario(String id, String clave, String rol, String nombre, String correo, String fechaNacimiento, String genero, String estado,
                   String tipoMembresia, String fechaInicio, String fechaVencimiento, double montoPagar, String estadoPago) {
        super(id, clave, rol, nombre, correo, fechaNacimiento, genero, estado);
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.montoPagar = montoPagar;
        this.estadoPago = estadoPago;
    }

    // Getters and Setters
    public String getTipoMembresia() { 
        return tipoMembresia; 
    }
    public void setTipoMembresia(String tipoMembresia) { 
        this.tipoMembresia = tipoMembresia; 
    }

    public String getFechaInicio() { 
        return fechaInicio; 
    }
    public void setFechaInicio(String fechaInicio) { 
        this.fechaInicio = fechaInicio; 
    }

    public String getFechaVencimiento() { 
        return fechaVencimiento; 
    }
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; 
    }

    public double getMontoPagar() { 
        return montoPagar; 
    }
    public void setMontoPagar(double montoPagar) { 
        this.montoPagar = montoPagar; 
    }

    public String getEstadoPago() { 
        return estadoPago; 
    }
    public void setEstadoPago(String estadoPago) { 
        this.estadoPago = estadoPago; 
    }

    public void registrarUsuario(String filePath, String data) {
        if (isIDRegistered(filePath, this.getId())) {
            JOptionPane.showMessageDialog(null, "El ID ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean isIDRegistered(String filePath, String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields[0].equals(id)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static Usuario buscarPorID(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
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

    
}