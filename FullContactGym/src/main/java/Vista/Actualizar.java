
package Vista;

import Controlador.GestorDeNavegacion;
import Controlador.Persona;
import Controlador.SesionGlobal;
import Controlador.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Actualizar extends javax.swing.JFrame {

    
    public Actualizar() {
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
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldRol = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxTipoMembresia = new javax.swing.JComboBox<>();
        jLabelTipoMembresia = new javax.swing.JLabel();
        JComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelGenero = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelFechaInicio = new javax.swing.JLabel();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jTextFieldFechaPago = new javax.swing.JTextField();
        jLabelFechaPago = new javax.swing.JLabel();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jTextFieldFechaNacimiento = new javax.swing.JTextField();
        jTextFieldEstadoPago = new javax.swing.JTextField();
        jLabelEstadoPago = new javax.swing.JLabel();
        jTextFieldMontoPagar = new javax.swing.JTextField();
        jLabelMontoPagar = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonDescargarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 241, 187));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Actualizar");

        jPanel2.setBackground(new java.awt.Color(255, 241, 187));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEstado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstado.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldRol.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldRol.setForeground(new java.awt.Color(0, 0, 0));

        jButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setText("ID");

        jLabelRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRol.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRol.setText("Rol");

        jLabelEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstado.setText("Estado");

        jComboBoxTipoMembresia.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipoMembresia.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxTipoMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Bronce", "Plata", "Oro" }));
        jComboBoxTipoMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelTipoMembresia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTipoMembresia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTipoMembresia.setText("Tipo de membresia");

        JComboBoxGenero.setBackground(new java.awt.Color(255, 255, 255));
        JComboBoxGenero.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Género", "Masculino", "Femenino", "Otro" }));
        JComboBoxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGenero.setText("Género");

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre");

        jLabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorreo.setText("Correo");

        jTextFieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorreo.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaInicio.setText("Fecha de inicio");

        jTextFieldFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldFechaPago.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaPago.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFechaPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFechaPago.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaPago.setText("Fecha de pago");

        jLabelFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaNacimiento.setText("Fecha de nacimiento");

        jTextFieldFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEstadoPago.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoPago.setForeground(new java.awt.Color(0, 0, 0));

        jLabelEstadoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEstadoPago.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstadoPago.setText("Estado de pago");

        jTextFieldMontoPagar.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMontoPagar.setForeground(new java.awt.Color(0, 0, 0));

        jLabelMontoPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMontoPagar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMontoPagar.setText("Monto a pagar");

        jButtonBorrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonDescargarPDF.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDescargarPDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDescargarPDF.setForeground(new java.awt.Color(204, 204, 204));
        jButtonDescargarPDF.setText("Descargar en pdf");
        jButtonDescargarPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButtonBuscar))
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstado)
                            .addComponent(jTextFieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFechaNacimiento)
                            .addComponent(jTextFieldEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoPago)
                            .addComponent(jTextFieldMontoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMontoPagar))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFechaInicio))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGenero)
                                    .addComponent(jComboBoxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTipoMembresia))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFechaPago))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonActualizar)
                .addGap(55, 55, 55)
                .addComponent(jButtonBorrar)
                .addGap(51, 51, 51)
                .addComponent(jButtonDescargarPDF)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelRol)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTipoMembresia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFechaInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFechaPago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMontoPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMontoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEstadoPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonDescargarPDF))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestorDeNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else {
            String id = jTextFieldID.getText();
            
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID.");
                return;
            }

            if (SesionGlobal.getRolUsuario().equals("usuario") && !SesionGlobal.getIdUsuario().equals(id)) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su ID.");
                return;
            }

            Usuario usuario = Usuario.buscarPorID(id);
            if (usuario != null) {
                jTextFieldNombre.setText(usuario.getNombre());
                jTextFieldCorreo.setText(usuario.getCorreo());
                jTextFieldFechaNacimiento.setText(usuario.getFechaNacimiento());
                JComboBoxGenero.setSelectedItem(usuario.getGenero());
                jTextFieldEstado.setText(usuario.getEstado());
                jTextFieldRol.setText(usuario.getRol());
                jComboBoxTipoMembresia.setSelectedItem(usuario.getTipoMembresia());
                jTextFieldFechaInicio.setText(usuario.getFechaInicio());
                jTextFieldFechaPago.setText(usuario.getFechaVencimiento());
                jTextFieldMontoPagar.setText(String.valueOf(usuario.getMontoPagar()));
                jTextFieldEstadoPago.setText(usuario.getEstadoPago());
            } else {
                JOptionPane.showMessageDialog(this, "ID no encontrado.");
                clearFields();
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestorDeNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else {
            String id = jTextFieldID.getText().trim();
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID.");
                return;
            }

            if (SesionGlobal.getRolUsuario().equals("usuario") && !SesionGlobal.getIdUsuario().equals(id)) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su ID.");
                return;
            }

            Persona persona = new Persona(
                id,
                "", // Clave no se actualiza aquí
                jTextFieldRol.getText().trim(),
                jTextFieldNombre.getText().trim(),
                jTextFieldCorreo.getText().trim(),
                jTextFieldFechaNacimiento.getText().trim(),
                JComboBoxGenero.getSelectedItem().toString(),
                jTextFieldEstado.getText().trim()
            );

            if (Persona.actualizarPersona(persona)) {
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "ID no encontrado.");
            }
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (!SesionGlobal.isLoggedIn()) {
            GestorDeNavegacion.setVentanaAnterior(this);
            Login loginWindow = new Login();
            loginWindow.setVisible(true);
            this.setVisible(false);
        } else {
            String id = jTextFieldID.getText().trim();
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID.");
                return;
            }

            if (SesionGlobal.getRolUsuario().equals("usuario") && !SesionGlobal.getIdUsuario().equals(id)) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su ID.");
                return;
            }

            if (Persona.borrarPorID(id)) {
                JOptionPane.showMessageDialog(this, "Datos borrados correctamente.");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "ID no encontrado.");
            }
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }
    
    private void clearFields() {
        jTextFieldNombre.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldFechaNacimiento.setText("");
        JComboBoxGenero.setSelectedItem("Género");
        jComboBoxTipoMembresia.setSelectedItem("Tipo");
        jTextFieldFechaInicio.setText("");
        jTextFieldFechaPago.setText("");
        jTextFieldMontoPagar.setText("");
        jTextFieldEstadoPago.setText("");
        jTextFieldEstado.setText("");
        jTextFieldRol.setText("");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBoxGenero;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDescargarPDF;
    private javax.swing.JComboBox<String> jComboBoxTipoMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoPago;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelFechaPago;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMontoPagar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelTipoMembresia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldEstadoPago;
    private javax.swing.JTextField jTextFieldFechaInicio;
    private javax.swing.JTextField jTextFieldFechaNacimiento;
    private javax.swing.JTextField jTextFieldFechaPago;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMontoPagar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRol;
    // End of variables declaration//GEN-END:variables
}
