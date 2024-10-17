/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author spala
 */
public class MembresiaBronce implements Membresia{
    private String nombre;
    private double precio;
    private int duracion;
    private String descripcion;

    public MembresiaBronce() {
        this.nombre = "Bronce";
        this.precio = 30000.00;
        this.duracion = 1;
        this.descripcion = "Acceso al gym\nAcceso a duchas";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
 
    
}
