/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


/**
 *
 * @author spala
 */



public class SesionGlobal {
    private static boolean estaAutenticado = false;
    private static String idUsuario;
    private static String rolUsuario;

    public static boolean isLoggedIn() {
        return estaAutenticado;
    }

    public static void login(String id, String role) {
        estaAutenticado = true;
        idUsuario = id;
        rolUsuario = role;
    }

    public static void logout() {
        estaAutenticado = false;
        idUsuario = null;
        rolUsuario = null;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static String getRolUsuario() {
        return rolUsuario;
    }
}
