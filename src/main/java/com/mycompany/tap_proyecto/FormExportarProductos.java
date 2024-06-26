/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tap_proyecto;

import com.google.gson.Gson;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.tap_proyecto.Clases.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author chuy-
 */
public class FormExportarProductos extends javax.swing.JFrame {
    ArrayList<Producto> productos=new ArrayList();
    String rutaArchivo;
    String archivoProductos="Example productos file";
    public FormExportarProductos() {
        initComponents();
        textFieldNombre.setText("");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSeleccionarRuta = new javax.swing.JButton();
        comboBoxFormato = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        buttonGenerarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exportar productos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonSeleccionarRuta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeleccionarRuta.setText("Seleccionar ruta");
        buttonSeleccionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionarRutaActionPerformed(evt);
            }
        });

        comboBoxFormato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBoxFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "Excel" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formato");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del archivo");

        buttonGenerarArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGenerarArchivo.setText("Generar archivo");
        buttonGenerarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarArchivoActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGenerarArchivo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGenerarArchivo)
                    .addComponent(buttonSeleccionarRuta))
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
                    PdfPTable table =new PdfPTable(4);
                    table.addCell("ID");
                    table.addCell("Nombre");
                    table.addCell("Precio");
                    table.addCell("Cantidad");
                    
                    for(Producto p:productos){
                        table.addCell(p.getId());
                        table.addCell(p.getNombre());
                        table.addCell("$"+String.valueOf(p.getPrecio()));
                        table.addCell(String.valueOf(p.getCantidad()));
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
                    Sheet sheet=workbook.createSheet("Productos");
                    Row headerRow=sheet.createRow(0);
                    headerRow.createCell(0).setCellValue("ID");
                    headerRow.createCell(1).setCellValue("Nombre");
                    headerRow.createCell(2).setCellValue("Precio");
                    headerRow.createCell(3).setCellValue("Cantidad");

                    int rowNum=1;

                    for(Producto p:productos){
                        Row row=sheet.createRow(rowNum++);
                        row.createCell(0).setCellValue(p.getId());
                        row.createCell(1).setCellValue(p.getNombre());
                        row.createCell(2).setCellValue(p.getPrecio());
                        row.createCell(3).setCellValue(p.getCantidad());
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
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Es necesario insertar un nombre");
        }
    }//GEN-LAST:event_buttonGenerarArchivoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
                BufferedReader br=new BufferedReader(new FileReader(archivoProductos));
                String lectura=null;
                while((lectura=br.readLine())!=null){
                    JSONObject jSONObject= (JSONObject)JSONValue.parse(lectura);
                    Gson gson=new Gson();
                    Producto p=gson.fromJson(jSONObject.toJSONString(), Producto.class);
                    System.out.println("Producto leido"+p.getId());
                    productos.add(p); 
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormExportarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormExportarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormExportarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormExportarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormExportarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerarArchivo;
    private javax.swing.JButton buttonSeleccionarRuta;
    private javax.swing.JComboBox<String> comboBoxFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
