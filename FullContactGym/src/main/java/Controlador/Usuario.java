/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Persona;

/**
 *
 * @author spala
 */

public class Usuario extends Persona {
    // Constructor
    public Usuario(int id, String clave, String nombre, String correo, String tipoMembresia, String fechaInicio, String fechaFinal, double montoPagar, String estado) {
        super(id, clave, nombre, correo, tipoMembresia, fechaInicio, fechaFinal, montoPagar, estado);
    }
}
