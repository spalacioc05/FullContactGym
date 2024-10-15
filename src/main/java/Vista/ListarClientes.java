/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Modelo.Listar;
import javax.swing.JOptionPane;

import Controlador.GestionarNavegacion;
import Controlador.SesionGlobal;
/**
 *
 * @author HP
 */
public class ListarClientes extends javax.swing.JFrame {

    /**
     * Creates new form ListaClientes
     */
    public ListarClientes() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonListarClientes = new javax.swing.JButton();
        jButtonClientesBronce = new javax.swing.JButton();
        jButtonClientesPlata = new javax.swing.JButton();
        jButtonClientesOro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 241, 187));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listar clientes");

        jButtonListarClientes.setBackground(new java.awt.Color(51, 51, 51));
        jButtonListarClientes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonListarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarClientes.setText("Todos los Clienetes");
        jButtonListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarClientesActionPerformed(evt);
            }
        });

        jButtonClientesBronce.setText("Clientes Bronce");
        jButtonClientesBronce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesBronceActionPerformed(evt);
            }
        });

        jButtonClientesPlata.setText("Clientes Plata");
        jButtonClientesPlata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesPlataActionPerformed(evt);
            }
        });

        jButtonClientesOro.setText("Clientes Oro");
        jButtonClientesOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesOroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonClientesPlata)
                        .addGap(85, 85, 85)
                        .addComponent(jButtonClientesOro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButtonListarClientes)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonClientesBronce)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarClientes)
                    .addComponent(jButtonClientesBronce))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClientesPlata)
                    .addComponent(jButtonClientesOro))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarClientesActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestionarNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else if (SesionGlobal.getRolUsuario().equals("administrador")) {
            Listar listar = new Listar();
            listar.generarPDFUsuarios("archivosPDF/ListaTodosLosClientes.pdf");
            JOptionPane.showMessageDialog(this, "PDF generado con la lista de todos los clientes.");
        } else {
            JOptionPane.showMessageDialog(this, "No tienes permisos para realizar esta acción.");
        }
    }//GEN-LAST:event_jButtonListarClientesActionPerformed

    private void jButtonClientesBronceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesBronceActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestionarNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else if (SesionGlobal.getRolUsuario().equals("administrador")) {
            Listar listar = new Listar();
            listar.generarPDFUsuariosPorMembresia("archivosPDF/ListaClientesBronce.pdf", "Bronce");
            JOptionPane.showMessageDialog(this, "PDF generado con la lista de clientes Bronce.");
        } else {
            JOptionPane.showMessageDialog(this, "No tienes permisos para realizar esta acción.");
        }
    }//GEN-LAST:event_jButtonClientesBronceActionPerformed

    private void jButtonClientesPlataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesPlataActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestionarNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else if (SesionGlobal.getRolUsuario().equals("administrador")) {
            Listar listar = new Listar();
            listar.generarPDFUsuariosPorMembresia("archivosPDF/ListaClientesPlata.pdf", "Plata");
            JOptionPane.showMessageDialog(this, "PDF generado con la lista de clientes Plata.");
        } else {
            JOptionPane.showMessageDialog(this, "No tienes permisos para realizar esta acción.");
        }
    }//GEN-LAST:event_jButtonClientesPlataActionPerformed

    private void jButtonClientesOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesOroActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestionarNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else if (SesionGlobal.getRolUsuario().equals("administrador")) {
            Listar listar = new Listar();
            listar.generarPDFUsuariosPorMembresia("archivosPDF/ListaClientesOro.pdf", "Oro");
            JOptionPane.showMessageDialog(this, "PDF generado con la lista de clientes Oro.");
        } else {
            JOptionPane.showMessageDialog(this, "No tienes permisos para realizar esta acción.");
        }
    }//GEN-LAST:event_jButtonClientesOroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientesBronce;
    private javax.swing.JButton jButtonClientesOro;
    private javax.swing.JButton jButtonClientesPlata;
    private javax.swing.JButton jButtonListarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
