/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.tap_proyecto.Clases.Producto;
import com.mycompany.tap_proyecto.Clases.Venta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.Element;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author chuy-
 */
public class FormExportarVentas extends javax.swing.JFrame {
    ArrayList<Venta>ventas=new ArrayList();
    String archivoVentas, rutaArchivo;
    public FormExportarVentas() {
        initComponents();
        setLocationRelativeTo(null);
        textFieldNombre.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxFormato = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        buttonSeleccionarRuta = new javax.swing.JButton();
        buttonGenerarArchivo = new javax.swing.JButton();
        buttonSeleccionarRuta1 = new javax.swing.JButton();
        buttonGenerarArchivo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exportar ventas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formato");

        comboBoxFormato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBoxFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "Excel" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del archivo");

        buttonSeleccionarRuta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeleccionarRuta.setText("Seleccionar ruta");
        buttonSeleccionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarRutaActionPerformed(evt);
            }
        });

        buttonGenerarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGenerarArchivo.setText("Generar archivo de venta");
        buttonGenerarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarArchivoActionPerformed(evt);
            }
        });

        buttonSeleccionarRuta1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeleccionarRuta1.setText("Seleccionar archivo de ventas");
        buttonSeleccionarRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarRuta1ActionPerformed(evt);
            }
        });

        buttonGenerarArchivo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGenerarArchivo1.setText("Generar archivo de ventas totales");
        buttonGenerarArchivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarArchivo1ActionPerformed(evt);
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
                        .addComponent(buttonSeleccionarRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(buttonGenerarArchivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSeleccionarRuta1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonGenerarArchivo1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSeleccionarRuta1)
                .addGap(18, 18, 18)
                .addComponent(buttonSeleccionarRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGenerarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGenerarArchivo1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeleccionarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionarRutaActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int aceptar=chooser.showOpenDialog(null);
        if(aceptar==JFileChooser.APPROVE_OPTION){
            rutaArchivo=chooser.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_buttonSeleccionarRutaActionPerformed

    private void buttonGenerarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarArchivoActionPerformed
        if(!textFieldNombre.getText().equals("")){
            if(comboBoxFormato.getSelectedIndex()==0){
                try{
                    Document document=new Document();
                    PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo+"\\"+textFieldNombre.getText().trim()+".pdf"));
                    document.open();
                    PdfPTable table =new PdfPTable(3);
                    table.addCell("Articulo");
                    table.addCell("Cantidad");
                    table.addCell("Total");
                    
                    for(Venta p:ventas){
                        table.addCell(p.getArticulo());
                        table.addCell(String.valueOf(p.getCantidad()));
                        table.addCell("$"+String.valueOf(p.getTotal()));
                    }
                    
                    document.add(table);
                    document.close();
                    JOptionPane.showMessageDialog(null, "Exportado con exito");
                    dispose();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else{
                try {
                    Workbook workbook= new XSSFWorkbook();
                    Sheet sheet=workbook.createSheet("Ventas");
                    Row headerRow=sheet.createRow(0);
                    headerRow.createCell(0).setCellValue("Articulo");
                    headerRow.createCell(1).setCellValue("Cantidad");
                    headerRow.createCell(2).setCellValue("Total");
                    
                    int rowNum=1;

                    for(Venta p:ventas){
                        Row row=sheet.createRow(rowNum++);
                        row.createCell(0).setCellValue(p.getArticulo());
                        row.createCell(1).setCellValue(p.getCantidad());
                        row.createCell(2).setCellValue(p.getTotal());
                        
                    }
                    sheet.autoSizeColumn(0);
                    sheet.autoSizeColumn(1);
                    sheet.autoSizeColumn(2);
                    sheet.autoSizeColumn(3);

                    FileOutputStream fo= new FileOutputStream(rutaArchivo+"\\"+textFieldNombre.getText().trim()+".xlsx");
                    workbook.write(fo);
                    fo.close();
                    workbook.close();
                    JOptionPane.showMessageDialog(null, "Exportado con exito");
                    dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
            
    }//GEN-LAST:event_buttonGenerarArchivoActionPerformed
        else{
            JOptionPane.showMessageDialog(null, "Insertar un nombre válido");
        }
    }
    
    private void buttonSeleccionarRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionarRuta1ActionPerformed
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
        chooser.setCurrentDirectory(new File("\\"));
        int aceptar = chooser.showOpenDialog(null);
        if(aceptar==JFileChooser.APPROVE_OPTION){
            archivoVentas=chooser.getSelectedFile().getAbsolutePath();
        }
        ventas.clear();
        cargarVentas();
    }//GEN-LAST:event_buttonSeleccionarRuta1ActionPerformed

    private void buttonGenerarArchivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarArchivo1ActionPerformed
        ventas.clear();
        File file= new File("\\");
        for(int i=0; i<file.listFiles().length; i++){
            if(file.listFiles()[i].getName().contains("ventas_")&&file.listFiles()[i].getName().contains(".json")){
                archivoVentas=file.listFiles()[i].getAbsolutePath();
                cargarVentas();
            } 
        }
        buttonGenerarArchivo.doClick();
    }//GEN-LAST:event_buttonGenerarArchivo1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormExportarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormExportarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormExportarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormExportarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormExportarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerarArchivo;
    private javax.swing.JButton buttonGenerarArchivo1;
    private javax.swing.JButton buttonSeleccionarRuta;
    private javax.swing.JButton buttonSeleccionarRuta1;
    private javax.swing.JComboBox<String> comboBoxFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarVentas() {
        try{
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
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
