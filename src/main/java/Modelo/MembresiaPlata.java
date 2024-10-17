/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author spala
 */
public class MembresiaPlata implements Membresia{
    private String nombre;
    private double precio;
    private int duracion;
    private String descripcion;

    public MembresiaPlata() {
        this.nombre = "Plata";
        this.precio = 45000.00;
        this.duracion = 1;
        this.descripcion = "Acceso al gym\nAcceso a duchas\nAcceso al nutricionista\nAcceso a spa";
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
