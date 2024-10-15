/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

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

    @Override
    public String toCSV() {
        return getId() + "," + getClave() + "," + getRol() + "," + getNombre() + "," + getCorreo() + "," + getFechaNacimiento() + "," + getGenero() + "," + tipoMembresia + "," + fechaInicio + "," + fechaVencimiento + "," + montoPagar + "," + estadoPago + "," + getEstado();
    }
}