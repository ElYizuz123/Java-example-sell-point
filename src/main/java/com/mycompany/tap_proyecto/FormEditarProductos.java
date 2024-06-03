
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.mycompany.tap_proyecto.Clases.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author chuy-
 */
public class FormEditarProductos extends javax.swing.JFrame {

    ArrayList<Producto> productos=new ArrayList();
    File archivoProductos=new File("Example productos file");
    DefaultListModel modelo=new DefaultListModel();
    public FormEditarProductos() {
        initComponents();
        setLocationRelativeTo(null);
        jList1.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldPrecio = new javax.swing.JTextField();
        textFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        buttonCambiarProducto = new javax.swing.JButton();
        buttonGuardarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Productos");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Eliminar producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nuevo nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nuevo precio");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nueva cantidad");

        buttonCambiarProducto.setText("Cambiar producto");
        buttonCambiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCambiarProductoActionPerformed(evt);
            }
        });

        buttonGuardarProductos.setText("Guardar cambios");
        buttonGuardarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonCambiarProducto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinner1)
                                        .addGap(123, 123, 123)))))
                        .addContainerGap(14, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGuardarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCambiarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGuardarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(archivoProductos.exists()){
            cargarProductos();
        }
        else{
            JOptionPane.showMessageDialog(null, "Se necesita tener al menos un producto");
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        productos.remove(jList1.getSelectedIndex());
        modelo.remove(jList1.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        textFieldNombre.setText(productos.get(jList1.getSelectedIndex()).getNombre());
        jSpinner1.setValue(productos.get(jList1.getSelectedIndex()).getCantidad());
        textFieldPrecio.setText(String.valueOf(productos.get(jList1.getSelectedIndex()).getPrecio()));
    }//GEN-LAST:event_jList1ValueChanged

    private void buttonCambiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCambiarProductoActionPerformed
        if(!jList1.isSelectionEmpty()&&jList1.getSelectedIndices().length==1){
            productos.get(jList1.getSelectedIndex()).setNombre(textFieldNombre.getText());
            productos.get(jList1.getSelectedIndex()).setCantidad(Integer.parseInt(jSpinner1.getValue().toString()));
            productos.get(jList1.getSelectedIndex()).setPrecio(Double.parseDouble(textFieldPrecio.getText()));
            modelo.setElementAt(productos.get(jList1.getSelectedIndex()).getId()+": "+productos.get(jList1.getSelectedIndex()).getNombre()+" , "+
                    productos.get(jList1.getSelectedIndex()).getCantidad()+" , $"+productos.get(jList1.getSelectedIndex()).getPrecio(), jList1.getSelectedIndex());
            
        }
    }//GEN-LAST:event_buttonCambiarProductoActionPerformed

    private void buttonGuardarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarProductosActionPerformed
        try {
           archivoProductos.delete();
           for(Producto p:productos){
               FileWriter fw=new FileWriter(archivoProductos,true);
               Gson gson=new Gson();
               String json=gson.toJson(p);
               fw.write(json);
               fw.write(System.getProperty("line.separator"));
               fw.close();
           }
            JOptionPane.showMessageDialog(null, "Cambios guardados");
            dispose();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_buttonGuardarProductosActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormEditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarProductos().setVisible(true);
            }
        });
    }
    private void cargarProductos(){
        try {
                BufferedReader br=new BufferedReader(new FileReader(archivoProductos));
                String lectura=null;
                while((lectura=br.readLine())!=null){
                    JSONObject jSONObject= (JSONObject)JSONValue.parse(lectura);
                    Gson gson=new Gson();
                    Producto p=gson.fromJson(jSONObject.toJSONString(), Producto.class);
                    System.out.println("Producto leido"+p.getId());
                    productos.add(p); 
                    modelo.addElement(p.getId()+": "+p.getNombre()+" , "+p.getCantidad()+" , $"+p.getPrecio());
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCambiarProducto;
    private javax.swing.JButton buttonGuardarProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
