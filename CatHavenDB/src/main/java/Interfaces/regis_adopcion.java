package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class regis_adopcion extends javax.swing.JFrame {

    public regis_adopcion() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Direccion = new javax.swing.JLabel();
        Regist = new javax.swing.JButton();
        Volv = new javax.swing.JButton();
        Direccion3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Direccion6 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Direccion.setText("ID del gato");
        jPanel1.add(Direccion);
        Direccion.setBounds(150, 410, 150, 40);

        Regist.setBackground(new java.awt.Color(255, 255, 204));
        Regist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Regist.setForeground(new java.awt.Color(51, 51, 51));
        Regist.setText("Registrar");
        Regist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistMouseClicked(evt);
            }
        });
        jPanel1.add(Regist);
        Regist.setBounds(430, 800, 170, 50);

        Volv.setBackground(new java.awt.Color(255, 255, 204));
        Volv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volv.setForeground(new java.awt.Color(51, 51, 51));
        Volv.setText("Volver");
        Volv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolvMouseClicked(evt);
            }
        });
        jPanel1.add(Volv);
        Volv.setBounds(100, 800, 170, 50);

        Direccion3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Direccion3.setText("Fecha de adopción");
        jPanel1.add(Direccion3);
        Direccion3.setBounds(150, 690, 170, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Datos Adopción");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 160, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registro del gato en Adopción:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 60, 450, 70);

        Direccion6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Direccion6.setText("ID del adoptante");
        jPanel1.add(Direccion6);
        Direccion6.setBounds(150, 550, 150, 40);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(200, 110, 300, 300);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(380, 690, 160, 30);

        jComboBox3.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(380, 550, 160, 30);

        jComboBox4.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(380, 410, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistMouseClicked

    }//GEN-LAST:event_RegistMouseClicked

    private void VolvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolvMouseClicked

    }//GEN-LAST:event_VolvMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion3;
    private javax.swing.JLabel Direccion6;
    private javax.swing.JButton Regist;
    private javax.swing.JButton Volv;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
