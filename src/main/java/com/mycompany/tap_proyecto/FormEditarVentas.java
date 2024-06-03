/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.mycompany.tap_proyecto.Clases.Venta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author chuy-
 */
public class FormEditarVentas extends javax.swing.JFrame {
    ArrayList<Venta>ventas = new ArrayList();
    String archivoVentas;
    DefaultListModel modelo =new DefaultListModel();
    public FormEditarVentas() {
        initComponents();
        setLocationRelativeTo(null);
        jList1.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonSeleccionarArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonEliminarVenta = new javax.swing.JButton();
        buttonGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ventas");

        buttonSeleccionarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeleccionarArchivo.setText("Seleccionar archivos de ventas");
        buttonSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarArchivoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        buttonEliminarVenta.setText("Eliminar venta");
        buttonEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarVentaActionPerformed(evt);
            }
        });

        buttonGuardarCambios.setText("Guardar cambios");
        buttonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(buttonSeleccionarArchivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEliminarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGuardarCambios)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonSeleccionarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminarVenta)
                    .addComponent(buttonGuardarCambios))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionarArchivoActionPerformed
        JFileChooser chooser=new JFileChooser();
        FileFilter filtro=new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                String nombre=pathname.getName();
                return nombre.contains("ventas_")&&nombre.contains(".json");
            } 

            @Override
            public String getDescription() {
                return "Archivos de ventas"; 
            }
        };
        chooser.setFileFilter(filtro);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setCurrentDirectory(new File("Example ventas file"));
        int aceptar = chooser.showOpenDialog(null);
        if(aceptar==JFileChooser.APPROVE_OPTION){
            archivoVentas=chooser.getSelectedFile().getAbsolutePath();
        }
        ventas.clear();
        modelo.clear();
        cargarVentas();
    }//GEN-LAST:event_buttonSeleccionarArchivoActionPerformed

    private void buttonEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarVentaActionPerformed
        ventas.remove(jList1.getSelectedIndex());
        modelo.remove(jList1.getSelectedIndex());   
    }//GEN-LAST:event_buttonEliminarVentaActionPerformed

    private void buttonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarCambiosActionPerformed
        File file=new File(archivoVentas);
        file.delete();
        Gson gson = new Gson();
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(archivoVentas, false)
            );
            String json = gson.toJson(ventas);
            bw.write(json);
            bw.close();
            
            JOptionPane.showMessageDialog(null, "Se guardaron los cambios");
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonGuardarCambiosActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminarVenta;
    private javax.swing.JButton buttonGuardarCambios;
    private javax.swing.JButton buttonSeleccionarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarVentas() {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(archivoVentas)
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
                
                Venta t = gson.fromJson(
                    jsonArray.get(i).toString(), 
                    Venta.class
                );
                
                System.out.println("Tema leido: " + t.getArticulo());
                
                ventas.add(t);
                modelo.addElement(t.getArticulo()+" , "+t.getCantidad()+" , $"+t.getTotal());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
