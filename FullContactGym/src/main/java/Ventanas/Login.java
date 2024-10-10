/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelClave = new javax.swing.JLabel();
        JButtonIniciarSesion = new javax.swing.JButton();
        JButtonRegistrate = new javax.swing.JLabel();
        jPasswordClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 241, 194));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de sesión");

        jPanel2.setBackground(new java.awt.Color(255, 241, 194));

        jLabelID.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 0, 0));

        jLabelClave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelClave.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClave.setText("Clave");

        JButtonIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        JButtonIniciarSesion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        JButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        JButtonIniciarSesion.setText("Iniciar Sesión");
        JButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonIniciarSesionActionPerformed(evt);
            }
        });

        JButtonRegistrate.setForeground(new java.awt.Color(0, 0, 0));
        JButtonRegistrate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JButtonRegistrate.setText("¿No tienes cuenta? Registrate");
        JButtonRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonRegistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButtonRegistrateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JButtonRegistrateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JButtonRegistrateMousePressed(evt);
            }
        });

        jPasswordClave.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordClave.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jPasswordClave.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelClave)
                            .addComponent(jLabelID)
                            .addComponent(jTextFieldID)
                            .addComponent(jPasswordClave, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(JButtonRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JButtonIniciarSesion)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabelClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(JButtonIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(JButtonRegistrate)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonIniciarSesionActionPerformed
        String inputID = jTextFieldID.getText();
        String inputClave = new String(jPasswordClave.getPassword());
        boolean loginSuccess = false;
        String role = "";

        try (BufferedReader br = new BufferedReader(new FileReader("data/basededatos.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0];
                String clave = fields[1];
                String rol = fields[2];

                if (id.equals(inputID) && clave.equals(inputClave)) {
                    loginSuccess = true;
                    role = rol;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (loginSuccess) {
            if (role.equals("administrador")) {
                JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
            } else if (role.equals("usuario")) {
                JOptionPane.showMessageDialog(this, "Bienvenido Usuario");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID o Clave incorrectos");
        }
        
        Registro registrarFrame = new Registro();
        Actualizar actualizarFrame = new Actualizar();
        Membresia membresiaFrame = new Membresia();
        ListaClientes listaClientesFrame = new ListaClientes();
        ListaFactura listaFacturaFrame = new ListaFactura();
        Ayuda ayudaFrame = new Ayuda();
        Index indexFrame = new Index();
        
        registrarFrame.setAutenficar(inputID, role);
        actualizarFrame.setAutenficar(inputID, role);
        membresiaFrame.setAutenficar(inputID, role);
        listaClientesFrame.setAutenficar(inputID, role);
        listaFacturaFrame.setAutenficar(inputID, role);
        ayudaFrame.setAutenficar(inputID, role);
        indexFrame.setAutenficar(inputID, role);
        
    }//GEN-LAST:event_JButtonIniciarSesionActionPerformed

    private void JButtonRegistrateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonRegistrateMousePressed
        // Crear una instancia de la ventana Registro
        Registro registrarFrame = new Registro();
        registrarFrame.setVisible(true);
        
        // Cerrar o esconder la ventana Login
        this.dispose();
    }//GEN-LAST:event_JButtonRegistrateMousePressed

    private void JButtonRegistrateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonRegistrateMouseEntered
        JButtonRegistrate.setForeground(Color.BLUE);
    }//GEN-LAST:event_JButtonRegistrateMouseEntered

    private void JButtonRegistrateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonRegistrateMouseExited
        JButtonRegistrate.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_JButtonRegistrateMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonIniciarSesion;
    private javax.swing.JLabel JButtonRegistrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordClave;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
