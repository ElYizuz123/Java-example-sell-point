/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.mycompany.tap_proyecto.Clases.Producto;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author chuy-
 */
public class FormNuevoProducto extends javax.swing.JFrame {

    String archivoProductos="Example productos file";
    ArrayList<Producto> productos=new ArrayList();
    DefaultListModel modelo= new DefaultListModel();
    public FormNuevoProducto() {
        initComponents();
        setLocationRelativeTo(null);
        jList1.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNombreDelProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        textBoxPrecio = new javax.swing.JTextField();
        buttonAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonEliminarProd = new javax.swing.JButton();
        buttonGuardarLosProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre del producto");

        textFieldNombreDelProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNombreDelProductoFocusLost(evt);
            }
        });

        jLabel2.setText("Cantidad disponible");

        jLabel3.setText("Precio");

        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("Productos");

        jScrollPane1.setViewportView(jList1);

        buttonEliminarProd.setForeground(new java.awt.Color(204, 0, 51));
        buttonEliminarProd.setText("Eliminar producto seleccionado");
        buttonEliminarProd.setToolTipText("");
        buttonEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarProdActionPerformed(evt);
            }
        });

        buttonGuardarLosProd.setForeground(new java.awt.Color(51, 255, 51));
        buttonGuardarLosProd.setText("Guardar todos los productos");
        buttonGuardarLosProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarLosProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(textFieldNombreDelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(textBoxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGuardarLosProd, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombreDelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBoxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAgregar)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminarProd)
                    .addComponent(buttonGuardarLosProd))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGuardarLosProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarLosProdActionPerformed
        try {
            for(Producto p:productos){
                FileWriter fw= new FileWriter(archivoProductos,true);
                Gson gson=new Gson();
                String json=gson.toJson(p);
                fw.write(json);
                fw.write(System.getProperty("line.separator"));
                fw.close();
            }
            dispose();
            JOptionPane.showMessageDialog(null, "Productos guardados");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonGuardarLosProdActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
        Random ran=new Random();
        Producto producto=new Producto(textFieldNombreDelProducto.getText().substring(0, 2)+ran.nextInt(1, 9999),textFieldNombreDelProducto.getText(),Double.parseDouble(textBoxPrecio.getText()),
                Integer.parseInt(jSpinner1.getValue().toString()));
        String prod=producto.getId()+" , "+producto.getNombre()+" , $"+producto.getPrecio()+" , "+producto.getCantidad()+" piezas";
        modelo.addElement(prod);
        productos.add(producto);
        textFieldNombreDelProducto.setText("");
        textBoxPrecio.setText("");
        jSpinner1.setValue(0);
        textFieldNombreDelProducto.grabFocus();
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void textFieldNombreDelProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreDelProductoFocusLost
        textFieldNombreDelProducto.setText(textFieldNombreDelProducto.getText().toUpperCase());
    }//GEN-LAST:event_textFieldNombreDelProductoFocusLost

    private void buttonEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarProdActionPerformed
        productos.remove(jList1.getSelectedIndex());
        modelo.remove(jList1.getSelectedIndex());
    }//GEN-LAST:event_buttonEliminarProdActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonEliminarProd;
    private javax.swing.JButton buttonGuardarLosProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField textBoxPrecio;
    private javax.swing.JTextField textFieldNombreDelProducto;
    // End of variables declaration//GEN-END:variables
}
