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
    
    public String toCSV() {
        return String.join(",", id, clave, rol, nombre, correo, fechaNacimiento, genero, estado);
    }

}