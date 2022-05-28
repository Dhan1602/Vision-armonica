/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas_principales;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ESTUDIANTE
 */
public class fin extends javax.swing.JFrame {
HSSFRow fila,fila2;
HSSFCell celda;
    String rellenado[][];
    int ctotal, stop = 0, existe = 0;
    double Diseño1 = 0, Sistemas1 = 0, Admin1 = 0;
    String total1 ="", nombre1 ="", curso1="";
        public fin(){
       initComponents();
       nombre pechoepaloma = new nombre();
       nombre1 = pechoepaloma.nombre;
       curso1 = pechoepaloma.curso;
       total1 = pechoepaloma.total;
       Diseño1 = pechoepaloma.Diseño;
       Sistemas1 = pechoepaloma.Sistemas;
       Admin1 = pechoepaloma.Admin;
       
        if(Math.abs(Sistemas1-1)>Sistemas1){
        Sistemas1=0;
        }
        if(Math.abs(Diseño1-1)>Diseño1){
        Diseño1=0;
        }
        if(Math.abs(Admin1-1)>Admin1){
        Admin1=0;
        }
    System.out.println(Sistemas1+","+Diseño1+","+Admin1);
       
       
       opciones.setOpaque (true);
       opciones.setBorderPainted (false);  
       opciones.setBorder (null);  
       opciones.setFocusPainted (false);
       opciones.setContentAreaFilled (false);
       nombre g=new nombre();
       
       DefaultCategoryDataset datos = new DefaultCategoryDataset();
       datos.setValue(Sistemas1, "Sistemas", "Estudiante");
       datos.setValue(Diseño1, "Diseño", "Estudiante");
       datos.setValue(Admin1, "Administración", "Estudiante");
       
       JFreeChart grafico = ChartFactory.createBarChart3D(
       "Estadística",
       "Resultados",
       "Puntos",
       datos,
       PlotOrientation.HORIZONTAL, true, true, false
       );
       
       ChartPanel panel = new ChartPanel(grafico);
       panel.setMouseWheelEnabled(true);
       panel.setPreferredSize(new Dimension(440,310));
       graficazo.setLayout(new BorderLayout());
       graficazo.add(panel,BorderLayout.CENTER);
       pack();
       repaint();
       
try{ //Prueba
FileInputStream carga=new FileInputStream(new File("Resultados.xls"));
    HSSFWorkbook libro=new HSSFWorkbook(carga);  
    HSSFSheet hoja = libro.getSheetAt(0);
    fila = hoja.getRow(1);
    double goku=Double.valueOf(String.valueOf(fila.getCell(6)));
existe++;
}catch(Exception a){
stop++;
}


try{ //Ejecucion

    ejecucion:{
    if(stop==1){
break ejecucion;
    
}
//Guardar en matriz
    FileInputStream carga=new FileInputStream(new File("Resultados.xls")); 
    HSSFWorkbook libro=new HSSFWorkbook(carga);  
    HSSFSheet hoja = libro.getSheetAt(0);
    fila = hoja.getRow(1);
    double goku=Double.valueOf(String.valueOf(fila.getCell(6)));
    ctotal=(int)(Math.floor(goku));
         
        rellenado=new String[ctotal+1][6];
            for(int i=0; i<(ctotal+1); i++){
            fila=hoja.getRow(i);
                for(int j=0; j<6; j++){
                rellenado[i][j]=String.valueOf(fila.getCell(j));
                }}

//Sobreescribir
    HSSFWorkbook libro2 = new HSSFWorkbook();    
    HSSFSheet hoja2 = libro2.createSheet("Resultado"); 
    hoja2.protectSheet("orientacion21angeles2021"); 
       

    
        for(int i=0; i<(ctotal+1); i++){
        fila2 = hoja2.createRow(i);
             for(int j=0;j<6;j++){
                 if(i==0){ fila2.createCell(6).setCellValue("N°Registrados");}
                 if(i==1){ fila2.createCell(6).setCellValue(ctotal+1);}
             fila2.createCell(j).setCellValue(rellenado[i][j]);   
             
            }}
        
        
fila2=hoja2.createRow(ctotal+1);
if((ctotal+1)==1){fila2.createCell(6).setCellValue(ctotal+1);}
fila2.createCell(0).setCellValue(nombre1);
fila2.createCell(1).setCellValue(curso1);
fila2.createCell(2).setCellValue(Diseño1);
fila2.createCell(3).setCellValue(Sistemas1);
fila2.createCell(4).setCellValue(Admin1);
fila2.createCell(5).setCellValue(total1);



//Exportar archivo
    FileOutputStream arch = new FileOutputStream("Resultados.xls");
    libro2.write(arch);
    arch.close();
    


    

}}catch (Exception e){
    System.out.println("Aarón la cagaste");}       


try{//Si no existe
    noExiste:{
    if(existe>=1){
        break noExiste;}
    HSSFWorkbook libro3 = new HSSFWorkbook();    
    HSSFSheet hoja2 = libro3.createSheet("Resultado");
    hoja2.protectSheet("orientacion21angeles2021");

    
    fila2=hoja2.createRow(0);
    fila2.createCell(0).setCellValue("Nombre completo");
    fila2.createCell(1).setCellValue("Curso");
    fila2.createCell(2).setCellValue("P Diseño");
    fila2.createCell(3).setCellValue("P sistemas");
    fila2.createCell(4).setCellValue("P administración");
    fila2.createCell(5).setCellValue("Resultado");
    fila2.createCell(6).setCellValue("N°Registrados");
    
    fila2=hoja2.createRow(1);
    fila2.createCell(0).setCellValue(nombre1);
    fila2.createCell(1).setCellValue(curso1);
    fila2.createCell(2).setCellValue(Diseño1);
    fila2.createCell(3).setCellValue(Sistemas1);
    fila2.createCell(4).setCellValue(Admin1);
    fila2.createCell(5).setCellValue(total1);
    fila2.createCell(6).setCellValue(1);

    
    FileOutputStream josue = new FileOutputStream("Resultados.xls");
    libro3.write(josue);
    josue.close();
    } 
}catch(Exception e){
System.out.println("No funcionó");}

       
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Iconos/Logo2.png"));
        return retValue;
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
        jPanel1 = new javax.swing.JPanel();
        graficazo = new javax.swing.JPanel();
        opciones = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout graficazoLayout = new javax.swing.GroupLayout(graficazo);
        graficazo.setLayout(graficazoLayout);
        graficazoLayout.setHorizontalGroup(
            graficazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graficazoLayout.setVerticalGroup(
            graficazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(graficazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 440, 310));

        opciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver opciones.png"))); // NOI18N
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });
        jPanel1.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Home.png"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 40, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 130, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Fin.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
       if(Diseño1>Sistemas1&&Diseño1>Admin1){
       new Design1().setVisible(true);
       this.setVisible(false);
       }
       else if(Sistemas1>Diseño1&&Sistemas1>Admin1){
       new Sistemas1().setVisible(true);
       this.setVisible(false);
       }
       else{
       new Adm1().setVisible(true);
       this.setVisible(false);
       }


        
    }//GEN-LAST:event_opcionesActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JPanel graficazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton opciones;
    // End of variables declaration//GEN-END:variables
}
