/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas_principales;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ESTUDIANTE
 */
public class Pregunta21 extends javax.swing.JFrame {
        double Diseño=0.0;
        double Sistemas=0.0;
        double Admin=0.0;
        int conddiseño; //Condición "Esta presionado este botón?"
        int condsis; //Condición "Esta presionado este botón?"
        int condadm; //Condición "Esta presionado este botón?"
        String get; //Convertir double a string 1
        String get2; //Convertir double a string 2
        String get3; //Convertir double a string 3
    /**
     * Creates new form Inicio
     */
    public Pregunta21() {
        initComponents();
       Neext.setVisible(false); //Botón next invisible
       Neext.setOpaque (true); //Diseño botón next
       Neext.setBorderPainted (false); //Diseño botón next
       Neext.setBorder (null); //Diseño botón next
       Neext.setFocusPainted (false); //Diseño botón next
       Neext.setContentAreaFilled (false); //Diseño botón next
       back.setOpaque (true); //Diseño botón back
       back.setBorderPainted (false); //Diseño botón back 
       back.setBorder (null);  //Diseño botón back
       back.setFocusPainted (false); //Diseño botón back
       back.setContentAreaFilled (false); //Diseño botón back      
       enviodiseño.setText("0.0"); //Asignando 0 a diseño de esta ventana
       enviosistemas.setText("0.0"); //Asignando 0 a sistemas de esta ventana
       envioadmin.setText("0.0"); //Asignando 0 a admin de esta ventana
       recidiseño.setText(Pregunta20.enviodiseño.getText());
       recisistemas.setText(Pregunta20.enviosistemas.getText());
       reciadmin.setText(Pregunta20.envioadmin.getText());
       enviodiseño.setVisible(false); //Ocultar valor diseño envio
       enviosistemas.setVisible(false); //Ocultar valor sistemas envio
       envioadmin.setVisible(false); //Ocultar valor admin envio
       recidiseño.setVisible(false); //Ocultar valor diseño recibo
       recisistemas.setVisible(false); //Ocultar valor sistemas recibo
       reciadmin.setVisible(false); //Ocultar valor admin recibo

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
        Pregunta1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        recidiseño = new javax.swing.JTextField();
        recisistemas = new javax.swing.JTextField();
        reciadmin = new javax.swing.JTextField();
        enviodiseño = new javax.swing.JTextField();
        enviosistemas = new javax.swing.JTextField();
        envioadmin = new javax.swing.JTextField();
        nextoff = new javax.swing.JLabel();
        No = new javax.swing.JRadioButton();
        Unpoco = new javax.swing.JRadioButton();
        Si = new javax.swing.JRadioButton();
        Neext = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 60, 60));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Home.png"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 40, -1));

        recidiseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recidiseñoActionPerformed(evt);
            }
        });
        jPanel1.add(recidiseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 50, -1));
        jPanel1.add(recisistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, -1));

        reciadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciadminActionPerformed(evt);
            }
        });
        jPanel1.add(reciadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 50, -1));
        jPanel1.add(enviodiseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, -1));
        jPanel1.add(enviosistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 50, -1));
        jPanel1.add(envioadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, -1));

        nextoff.setBackground(new java.awt.Color(255, 255, 255));
        nextoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nextoff.png"))); // NOI18N
        jPanel1.add(nextoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, -1, -1));

        No.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta1.add(No);
        No.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        No.setText("Solo si debía");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, -1, -1));

        Unpoco.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta1.add(Unpoco);
        Unpoco.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Unpoco.setText("No, nunca");
        Unpoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnpocoActionPerformed(evt);
            }
        });
        jPanel1.add(Unpoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        Si.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta1.add(Si);
        Si.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Si.setText("Si, me encantaba");
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        jPanel1.add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 870, 20));

        Neext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Next_1.png"))); // NOI18N
        Neext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeextActionPerformed(evt);
            }
        });
        jPanel1.add(Neext, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 60, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Textos/Imagen6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 370, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpreguntas/p21.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

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

    private void NeextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeextActionPerformed
        new Pregunta22().setVisible(true); //Abre siguiente ventana
        this.setVisible(false); // Cierra ventana actual
    }//GEN-LAST:event_NeextActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        Neext.setVisible(true); 
        nextoff.setVisible(false); 
                if(condsis==0){ 
           if(conddiseño>0){ 
            Sistemas = Double.valueOf(recisistemas.getText()); 
            String get=String.valueOf(Sistemas); 
            enviosistemas.setText(get);
            Diseño = Double.valueOf(recidiseño.getText())+1; 
            String get2=String.valueOf(Diseño); 
            enviodiseño.setText(get2);
            Admin = Double.valueOf(reciadmin.getText()); 
            String get3=String.valueOf(Admin); 
            envioadmin.setText(get3);
            condsis=1;
            conddiseño=0;
            }
           else{
           if(condadm>0){
            Sistemas = Double.valueOf(recisistemas.getText()); 
            String get=String.valueOf(Sistemas); 
            enviosistemas.setText(get);
            Diseño = Double.valueOf(recidiseño.getText())+1; 
            String get2=String.valueOf(Diseño); 
            enviodiseño.setText(get2);
            Admin = Double.valueOf(reciadmin.getText()); 
            String get3=String.valueOf(Admin); 
            envioadmin.setText(get3);
            condsis=1;
            condadm=0;
             }
           else{
        Sistemas = Double.valueOf(recisistemas.getText()); 
        String get=String.valueOf(Sistemas); 
        enviosistemas.setText(get);
        Diseño = Double.valueOf(recidiseño.getText())+1; 
        String get2=String.valueOf(Diseño); 
        enviodiseño.setText(get2);
        Admin = Double.valueOf(reciadmin.getText()); 
        String get3=String.valueOf(Admin); 
        envioadmin.setText(get3);
        condsis=1;
        }
           }
                                    
        }
        
    }//GEN-LAST:event_SiActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        Neext.setVisible(true);
        nextoff.setVisible(false);
                if(condadm==0){
           if(condsis>0){
            Sistemas = Double.valueOf(recisistemas.getText()); 
            String get=String.valueOf(Sistemas); 
            enviosistemas.setText(get);
            Diseño = Double.valueOf(recidiseño.getText())+0.5; 
            String get2=String.valueOf(Diseño); 
            enviodiseño.setText(get2);
            Admin = Double.valueOf(reciadmin.getText()); 
            String get3=String.valueOf(Admin); 
            envioadmin.setText(get3);
            condadm=1;
            condsis=0;
                        }
           else{
            if(conddiseño>0){
            Sistemas = Double.valueOf(recisistemas.getText()); 
            String get=String.valueOf(Sistemas); 
            enviosistemas.setText(get);
            Diseño = Double.valueOf(recidiseño.getText())+0.5; 
            String get2=String.valueOf(Diseño); 
            enviodiseño.setText(get2);
            Admin = Double.valueOf(reciadmin.getText()); 
            String get3=String.valueOf(Admin); 
            envioadmin.setText(get3);
            condadm=1;
            conddiseño=0;
                        }
               else{
        Sistemas = Double.valueOf(recisistemas.getText()); 
        String get=String.valueOf(Sistemas); 
        enviosistemas.setText(get);
        Diseño = Double.valueOf(recidiseño.getText())+0.5; 
        String get2=String.valueOf(Diseño); 
        enviodiseño.setText(get2);
        Admin = Double.valueOf(reciadmin.getText()); 
        String get3=String.valueOf(Admin); 
        envioadmin.setText(get3);
        conddiseño=1;
                    }
                }
            
            
                           }
    }//GEN-LAST:event_NoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Pregunta20().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void recidiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recidiseñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recidiseñoActionPerformed

    private void UnpocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnpocoActionPerformed
        Neext.setVisible(true);
        nextoff.setVisible(false);
        if(conddiseño==0){
            if(condsis>0){
                Sistemas = Double.valueOf(recisistemas.getText());
                String get=String.valueOf(Sistemas);
                enviosistemas.setText(get);
                Diseño = Double.valueOf(recidiseño.getText())-1;
                String get2=String.valueOf(Diseño);
                enviodiseño.setText(get2);
                Admin = Double.valueOf(reciadmin.getText());
                String get3=String.valueOf(Admin);
                envioadmin.setText(get3);
                conddiseño=1;
                condsis=0;
            }
            else{
                if(condadm>0){
                    Sistemas = Double.valueOf(recisistemas.getText());
                    String get=String.valueOf(Sistemas);
                    enviosistemas.setText(get);
                    Diseño = Double.valueOf(recidiseño.getText())-1;
                    String get2=String.valueOf(Diseño);
                    enviodiseño.setText(get2);
                    Admin = Double.valueOf(reciadmin.getText());
                    String get3=String.valueOf(Admin);
                    envioadmin.setText(get3);
                    conddiseño=1;
                    condadm=0;
                }
                else{
                    Sistemas = Double.valueOf(recisistemas.getText());
                    String get=String.valueOf(Sistemas);
                    enviosistemas.setText(get);
                    Diseño = Double.valueOf(recidiseño.getText())-1;
                    String get2=String.valueOf(Diseño);
                    enviodiseño.setText(get2);
                    Admin = Double.valueOf(reciadmin.getText());
                    String get3=String.valueOf(Admin);
                    envioadmin.setText(get3);
                    conddiseño=1;
                }
            }

        }
    }//GEN-LAST:event_UnpocoActionPerformed

    private void reciadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reciadminActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton Neext;
    public static javax.swing.JRadioButton No;
    private javax.swing.ButtonGroup Pregunta1;
    public static javax.swing.JRadioButton Si;
    public static javax.swing.JRadioButton Unpoco;
    private javax.swing.JButton back;
    public static javax.swing.JTextField envioadmin;
    public static javax.swing.JTextField enviodiseño;
    public static javax.swing.JTextField enviosistemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nextoff;
    public static javax.swing.JTextField reciadmin;
    public static javax.swing.JTextField recidiseño;
    public static javax.swing.JTextField recisistemas;
    // End of variables declaration//GEN-END:variables
}
