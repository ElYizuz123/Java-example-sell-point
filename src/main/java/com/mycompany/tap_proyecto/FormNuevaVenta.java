
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.mycompany.tap_proyecto.Clases.Producto;
import com.mycompany.tap_proyecto.Clases.Venta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;


public class FormNuevaVenta extends javax.swing.JFrame  {
    ArrayList<Venta> ventas=new ArrayList();
    ArrayList<Producto> productos=new ArrayList();
    String direccionVentas="Example ventas file";
    File archivoProductos=new File("Example productos file");
    DefaultListModel modelo=new DefaultListModel();
    int numVen=0;
    public FormNuevaVenta() {
        initComponents();
        setLocationRelativeTo(null);
        jList1.setModel(modelo);
        System.out.println(nombreArchivoVentas());
        jComboBox1.setSelectedIndex(-1);
    }

    private String nombreArchivoVentas(){
        Calendar cal=Calendar.getInstance();
        return "ventas_"+cal.get(Calendar.YEAR)+"-"+String.valueOf(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH)+".json";
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        buttonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonEliminar = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        buttonGuardarVenta = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Producto");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setText("Cantidad");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setText("Total: $");

        buttonGuardarVenta.setForeground(new java.awt.Color(0, 153, 204));
        buttonGuardarVenta.setText("Guardar venta");
        buttonGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarVentaActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonGuardarVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(buttonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminar)
                    .addComponent(label)
                    .addComponent(labelTotal))
                .addGap(18, 18, 18)
                .addComponent(buttonGuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(archivoProductos.exists()){
            cargarProductos();
            cargarVentas();
        }
        else{
            JOptionPane.showMessageDialog(null, "Se necesita registrar al menos un producto");
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
        if(jComboBox1.getSelectedIndex()>-1){
            Venta v=new Venta(jComboBox1.getSelectedItem().toString(),Integer.parseInt(jSpinner1.getValue().toString()),
                productos.get(jComboBox1.getSelectedIndex()).getPrecio()*Integer.parseInt(jSpinner1.getValue().toString()));
            ventas.add(v);
            modelo.addElement(v.getArticulo()+" , "+v.getCantidad()+" , $"+v.getTotal());
            productos.get(jComboBox1.getSelectedIndex()).setCantidad(productos.get(jComboBox1.getSelectedIndex()).getCantidad()-v.getCantidad());
            jComboBox1.setSelectedIndex(-1);
            jSpinner1.setValue(0);
            labelTotal.setText(String.valueOf(Double.parseDouble(labelTotal.getText())+v.getTotal()));
        }
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedIndex()>-1){
            if(productos.get(jComboBox1.getSelectedIndex()).getCantidad()==0){
                jComboBox1.setSelectedIndex(-1);
                JOptionPane.showMessageDialog(null, "Producto agotado");
                jSpinner1.setValue(0);
            }    
            else jSpinner1.setValue(1);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if(jComboBox1.getSelectedIndex()>-1){
            if(Integer.parseInt(jSpinner1.getValue().toString())<1)jSpinner1.setValue(1);
            if(Integer.parseInt(jSpinner1.getValue().toString())>productos.get(jComboBox1.getSelectedIndex()).getCantidad())
                jSpinner1.setValue(productos.get(jComboBox1.getSelectedIndex()).getCantidad());
        }
        else
           if(Integer.parseInt(jSpinner1.getValue().toString())<0)jSpinner1.setValue(0); 
    }//GEN-LAST:event_jSpinner1StateChanged

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        for(Producto p:productos){
            if(p.getNombre().equals(ventas.get(jList1.getSelectedIndex()).getArticulo()))
                p.setCantidad(p.getCantidad()+ventas.get(jList1.getSelectedIndex()).getCantidad());
        }
        labelTotal.setText(String.valueOf(Double.parseDouble(labelTotal.getText())-ventas.get(jList1.getSelectedIndex()).getTotal()));
        ventas.remove(jList1.getSelectedIndex());
        modelo.remove(jList1.getSelectedIndex());
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarVentaActionPerformed
        guardarProductos();
        guardarVentas();
        dispose();
    }//GEN-LAST:event_buttonGuardarVentaActionPerformed

    
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
                    jComboBox1.addItem(p.getNombre());
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    private void cargarVentas() {
        File file=new File(direccionVentas+nombreArchivoVentas());
        if(file.exists()){
            try {
            BufferedReader br = new BufferedReader(
                new FileReader(file)
            );
            String contenido = "";
            String lectura = null;
            while( (lectura = br.readLine()) != null ) {
                contenido += lectura;
            }
            br.close();
            
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(contenido);
            for (int i = 0; i < jsonArray.size(); i++) {
                System.out.println("" + jsonArray.get(i));
                
                Gson gson = new Gson();
                
                Venta v = gson.fromJson(
                    jsonArray.get(i).toString(), 
                    Venta.class
                );
                
                System.out.println("Tema leido: " + v.getArticulo());
                
                ventas.add(v);
            }
            numVen=ventas.size()-1;
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
    }
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
            java.util.logging.Logger.getLogger(FormNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNuevaVenta().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardarVenta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelTotal;
    // End of variables declaration//GEN-END:variables

    private void guardarVentas() {
        Gson gson = new Gson();
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(direccionVentas+nombreArchivoVentas(), false)
            );
            String json = gson.toJson(ventas);
            bw.write(json);
            bw.close();
            
            JOptionPane.showMessageDialog(null, "Se guardaron las ventas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void guardarProductos() {
        archivoProductos.delete();
        try {
            for(Producto p:productos){
                FileWriter fw= new FileWriter(archivoProductos,true);
                Gson gson=new Gson();
                String json=gson.toJson(p);
                fw.write(json);
                fw.write(System.getProperty("line.separator"));
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
