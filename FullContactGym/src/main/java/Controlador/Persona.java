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


public class Persona {
    private String id;
    private String clave;
    private String rol;
    private String nombre;
    private String correo;
    private String fechaNacimiento;
    private String genero;
    private String estado;

    public Persona(String id, String clave, String rol, String nombre, String correo, String fechaNacimiento, String genero, String estado) {
        this.id = id;
        this.clave = clave;
        this.rol = rol;
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estado = estado;
    }

    // Getters and Setters
    public String getId() { 
        return id; 
    }
    public void setId(String id) { 
        this.id = id; 
    }

    public String getClave() { 
        return clave; 
    }
    public void setClave(String clave) { 
        this.clave = clave; 
    }

    public String getRol() { 
        return rol; 
    }
    public void setRol(String rol) { 
        this.rol = rol; 
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getCorreo() { 
        return correo; 
    }
    public void setCorreo(String correo) { 
        this.correo = correo; 
    }

    public String getFechaNacimiento() { 
        return fechaNacimiento; 
    }
    public void setFechaNacimiento(String fechaNacimiento) { 
        this.fechaNacimiento = fechaNacimiento; 
    }

    public String getGenero() { 
        return genero; 
    }
    public void setGenero(String genero) { 
        this.genero = genero; 
    }

    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public static String[] autenticar(String inputID, String inputClave) {
        boolean loginSuccess = false;
        String role = "";
        Persona persona = new Persona("", "", "", "", "", "", "", "");
        persona.setId(inputID);
        persona.setClave(inputClave);

        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0];
                String clave = fields[1];
                String rol = fields[2];

                if (id.equals(persona.getId()) && clave.equals(persona.getClave())) {
                    loginSuccess = true;
                    role = rol;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[]{String.valueOf(loginSuccess), role};
    }

    public static Persona buscarPorID(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    return new Persona(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[12]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean actualizarPersona(Persona persona) {
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(persona.getId())) {
                    data[3] = persona.getNombre();
                    data[4] = persona.getCorreo();
                    data[5] = persona.getFechaNacimiento();
                    data[6] = persona.getGenero();
                    data[12] = persona.getEstado();
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
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/basededatos.csv"))) {
                bw.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return found;
    }

    public static boolean borrarPorID(String id) {
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (!data[0].equals(id)) {
                    sb.append(line).append("\n");
                } else {
                    found = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/basededatos.csv"))) {
                bw.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return found;
    }
}