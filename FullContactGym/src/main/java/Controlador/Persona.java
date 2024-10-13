/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author spala
 */


public class Persona {
    private int id;
    private String clave;
    private String nombre;
    private String correo;
    private String tipoMembresia;
    private String fechaInicio;
    private String fechaFinal;
    private double montoPagar;
    private String estado;

    // Constructor
    public Persona(int id, String clave, String nombre, String correo, String tipoMembresia, String fechaInicio, String fechaFinal, double montoPagar, String estado) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoPagar = montoPagar;
        this.estado = estado;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}