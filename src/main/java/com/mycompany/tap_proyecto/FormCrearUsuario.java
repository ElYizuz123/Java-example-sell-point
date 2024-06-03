
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.mycompany.tap_proyecto.Clases.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class FormCrearUsuario extends javax.swing.JFrame {
    String archivoUsuarios="Users example path";
    
    public FormCrearUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNombreUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldContra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        textFieldConfContra = new javax.swing.JPasswordField();
        buttonVerContra = new javax.swing.JToggleButton();
        buttonVerConfContra = new javax.swing.JToggleButton();
        labelNoNombre = new javax.swing.JLabel();
        labelNoContra = new javax.swing.JLabel();
        labelContraInc = new javax.swing.JLabel();
        buttonCrearUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE DE USUARIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CONFIRMAR CONTRASEÑA");

        textFieldConfContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldConfContraKeyPressed(evt);
            }
        });

        buttonVerContra.setIcon(new javax.swing.ImageIcon("C:\\Users\\chuy-\\OneDrive\\Escritorio\\Universidad\\4 Semestre\\Unidad 1\\TAP_PROYECTO\\src\\main\\java\\Imagenes\\dejarDeVerContra.png")); // NOI18N
        buttonVerContra.setBorder(null);
        buttonVerContra.setContentAreaFilled(false);
        buttonVerContra.setFocusPainted(false);
        buttonVerContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerContraActionPerformed(evt);
            }
        });

        buttonVerConfContra.setIcon(new javax.swing.ImageIcon("C:\\Users\\chuy-\\OneDrive\\Escritorio\\Universidad\\4 Semestre\\Unidad 1\\TAP_PROYECTO\\src\\main\\java\\Imagenes\\dejarDeVerContra.png")); // NOI18N
        buttonVerConfContra.setBorder(null);
        buttonVerConfContra.setContentAreaFilled(false);
        buttonVerConfContra.setFocusPainted(false);
        buttonVerConfContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerConfContraActionPerformed(evt);
            }
        });

        labelNoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNoNombre.setForeground(new java.awt.Color(255, 51, 51));
        labelNoNombre.setText("*");

        labelNoContra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNoContra.setForeground(new java.awt.Color(255, 51, 51));
        labelNoContra.setText("*");

        labelContraInc.setForeground(new java.awt.Color(255, 51, 51));
        labelContraInc.setText("La contraseña no coincide");

        buttonCrearUsuario.setBackground(new java.awt.Color(153, 255, 153));
        buttonCrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        buttonCrearUsuario.setText("Crear usuario");
        buttonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelContraInc)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldNombreUser)
                        .addComponent(textFieldContra)
                        .addComponent(textFieldConfContra, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelNoNombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelNoContra))
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVerContra)
                    .addComponent(buttonVerConfContra))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelNoNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelNoContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVerContra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldConfContra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVerConfContra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContraInc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearUsuarioActionPerformed
        if(!textFieldNombreUser.getText().equals("")&&!textFieldContra.getText().equals("")){
            labelNoNombre.setVisible(false);
            labelNoContra.setVisible(false);
            if(textFieldContra.getText().equals(textFieldConfContra.getText())){
                crearUsuario();
                labelContraInc.setVisible(false);
                JOptionPane.showMessageDialog(null, "Usuario creado");
                dispose();
            }
            else labelContraInc.setVisible(true);
        }
        else{
            if(textFieldNombreUser.getText().equals(""))labelNoNombre.setVisible(true);
            else labelNoNombre.setVisible(false);
            if(textFieldContra.getText().equals("")) labelNoContra.setVisible(true);
            else labelNoContra.setVisible(false);
        }
    }//GEN-LAST:event_buttonCrearUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelNoContra.setVisible(false);
        labelNoNombre.setVisible(false);
        labelContraInc.setVisible(false);
        textFieldNombreUser.setText("");
        textFieldContra.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void buttonVerContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerContraActionPerformed
        if(buttonVerContra.isSelected()){
            buttonVerContra.setIcon(new javax.swing.ImageIcon("Imagenes path show pass"));
            textFieldContra.setEchoChar((char)0);
        }
        else{
            buttonVerContra.setIcon(new javax.swing.ImageIcon("Imagenes path dont show pass"));
            textFieldContra.setEchoChar('*');
        }
    }//GEN-LAST:event_buttonVerContraActionPerformed

    private void buttonVerConfContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerConfContraActionPerformed
        if(buttonVerConfContra.isSelected()){
            buttonVerConfContra.setIcon(new javax.swing.ImageIcon("Imagenes path show pass"));
            textFieldConfContra.setEchoChar((char)0);
        }
        else{
            buttonVerConfContra.setIcon(new javax.swing.ImageIcon("Imagenes path dont show pass"));
            textFieldConfContra.setEchoChar('*');
        }
    }//GEN-LAST:event_buttonVerConfContraActionPerformed

    private void textFieldConfContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldConfContraKeyPressed
        if(evt.getKeyChar()==evt.VK_ENTER){
            buttonCrearUsuario.doClick();
        }
    }//GEN-LAST:event_textFieldConfContraKeyPressed

    
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
            java.util.logging.Logger.getLogger(FormCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCrearUsuario;
    private javax.swing.JToggleButton buttonVerConfContra;
    private javax.swing.JToggleButton buttonVerContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelContraInc;
    private javax.swing.JLabel labelNoContra;
    private javax.swing.JLabel labelNoNombre;
    private javax.swing.JPasswordField textFieldConfContra;
    private javax.swing.JPasswordField textFieldContra;
    private javax.swing.JTextField textFieldNombreUser;
    // End of variables declaration//GEN-END:variables

    private void crearUsuario() {
        try {
            FileWriter fw= new FileWriter(archivoUsuarios,true);
            Gson gson=new Gson();
            Usuario u=new Usuario(textFieldNombreUser.getText(),textFieldContra.getText());
            String json=gson.toJson(u);
            fw.write(json);
            fw.write(System.getProperty("line.separator"));
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
