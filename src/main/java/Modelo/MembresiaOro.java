/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author spala
 */
public class MembresiaOro implements Membresia{
    private String nombre;
    private double precio;
    private int duracion;
    private String descripcion;

    public MembresiaOro() {
        this.nombre = "Oro";
        this.precio = 60000.00;
        this.duracion = 1;
        this.descripcion = "-Acceso al gym\n-Acceso a duchas\n-Acceso al nutricionista\n-Acceso a spa\n-Acceso a sauna\n-Entrenadores personalizados\n-Rutinas recomendadas";
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
