/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author spala
 */

 public interface Membresia {
    String getNombre();
    double getPrecio();
    int getDuracion(); // Duración en meses
    String getDescripcion();

    static String getNombreEmpresa() {
        return "FullContact Gym";
    }

    static String getDireccion() {
        return "Calle Principal 123\nMedellín, Colombia";
    }

    static String getTelefono() {
        return "(123) 456-7890";
    }

    static String getCorreo() {
        return "contacto@fullcontactgym.com";
    }
}
