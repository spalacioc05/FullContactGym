/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Actualizar;
import Vista.Registro;
import javax.swing.JOptionPane;

/**
 *
 * @author spala
 */
public class WindowManager {
    public static void redirectToWindow(String targetWindow, String idUniversal, String rolUniversal) {
        switch (targetWindow) {
            case "Actualizar":
                Actualizar actualizarFrame = new Actualizar();
                actualizarFrame.setAutenficar(idUniversal, rolUniversal);
                actualizarFrame.setVisible(true);
                break;
            case "Registro":
                Registro registrarFrame = new Registro();
                registrarFrame.setAutenficar(idUniversal, rolUniversal);
                registrarFrame.setVisible(true);
                break;
            // Agrega más casos según sea necesario
            default:
                JOptionPane.showMessageDialog(null, "Ventana desconocida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
