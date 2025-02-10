package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class solicitud_adopcion extends javax.swing.JFrame {

    public solicitud_adopcion() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        CC = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        Direccion1 = new javax.swing.JLabel();
        eCC = new javax.swing.JTextField();
        eCelular = new javax.swing.JTextField();
        eDireccion = new javax.swing.JTextField();
        Direccion2 = new javax.swing.JLabel();
        eDireccion1 = new javax.swing.JTextField();
        Direccion3 = new javax.swing.JLabel();
        eDireccion2 = new javax.swing.JTextField();
        Direccion4 = new javax.swing.JLabel();
        eDireccion3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        eDireccion4 = new javax.swing.JTextField();
        Direccion5 = new javax.swing.JLabel();
        Direccion6 = new javax.swing.JLabel();
        Direccion7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Volv1 = new javax.swing.JButton();
        Volv2 = new javax.swing.JButton();
        Direccion8 = new javax.swing.JLabel();
        eDireccion6 = new javax.swing.JTextField();
        Volv3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Solicitud Adopciones");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 200, 31);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(570, 0, 130, 130);

        CC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC.setText("Nombre Adoptante");
        jPanel1.add(CC);
        CC.setBounds(100, 210, 120, 40);

        celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular.setText("C.C Adoptante");
        jPanel1.add(celular);
        celular.setBounds(100, 260, 140, 40);

        Direccion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion1.setText("Dirección");
        jPanel1.add(Direccion1);
        Direccion1.setBounds(100, 360, 150, 40);
        jPanel1.add(eCC);
        eCC.setBounds(260, 210, 350, 40);
        jPanel1.add(eCelular);
        eCelular.setBounds(260, 260, 350, 40);
        jPanel1.add(eDireccion);
        eDireccion.setBounds(260, 360, 350, 40);

        Direccion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion2.setText("Edad Adoptante");
        jPanel1.add(Direccion2);
        Direccion2.setBounds(100, 310, 150, 40);
        jPanel1.add(eDireccion1);
        eDireccion1.setBounds(260, 310, 350, 40);

        Direccion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion3.setText("Teléfono");
        jPanel1.add(Direccion3);
        Direccion3.setBounds(100, 410, 150, 40);
        jPanel1.add(eDireccion2);
        eDireccion2.setBounds(260, 410, 350, 40);

        Direccion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion4.setText("Correo electrónico");
        jPanel1.add(Direccion4);
        Direccion4.setBounds(100, 460, 150, 40);
        jPanel1.add(eDireccion3);
        eDireccion3.setBounds(260, 510, 350, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("  Solicitud de Adopción");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 50, 340, 70);
        jPanel1.add(eDireccion4);
        eDireccion4.setBounds(260, 460, 350, 40);

        Direccion5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion5.setText("Experiencia con mascotas");
        jPanel1.add(Direccion5);
        Direccion5.setBounds(100, 510, 150, 40);

        Direccion6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion6.setText("Descripción de su hogar");
        jPanel1.add(Direccion6);
        Direccion6.setBounds(100, 560, 150, 40);

        Direccion7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion7.setText("Motivo para adoptar");
        jPanel1.add(Direccion7);
        Direccion7.setBounds(100, 670, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 560, 350, 100);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(260, 670, 350, 100);

        Volv1.setBackground(new java.awt.Color(255, 255, 204));
        Volv1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volv1.setForeground(new java.awt.Color(51, 51, 51));
        Volv1.setText("Volver");
        Volv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volv1MouseClicked(evt);
            }
        });
        jPanel1.add(Volv1);
        Volv1.setBounds(50, 820, 150, 40);

        Volv2.setBackground(new java.awt.Color(255, 153, 153));
        Volv2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volv2.setForeground(new java.awt.Color(51, 51, 51));
        Volv2.setText("Rechazar Solicitud");
        Volv2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volv2MouseClicked(evt);
            }
        });
        Volv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volv2ActionPerformed(evt);
            }
        });
        jPanel1.add(Volv2);
        Volv2.setBounds(450, 820, 200, 40);

        Direccion8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion8.setText("ID del gato");
        jPanel1.add(Direccion8);
        Direccion8.setBounds(100, 140, 150, 40);

        eDireccion6.setBackground(new java.awt.Color(221, 221, 255));
        jPanel1.add(eDireccion6);
        eDireccion6.setBounds(260, 140, 350, 40);

        Volv3.setBackground(new java.awt.Color(180, 235, 126));
        Volv3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volv3.setForeground(new java.awt.Color(51, 51, 51));
        Volv3.setText("Aceptar Solicitud");
        Volv3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volv3MouseClicked(evt);
            }
        });
        jPanel1.add(Volv3);
        Volv3.setBounds(240, 820, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Volv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volv1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Volv1MouseClicked

    private void Volv2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volv2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Volv2MouseClicked

    private void Volv3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volv3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Volv3MouseClicked

    private void Volv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Volv2ActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JLabel Direccion3;
    private javax.swing.JLabel Direccion4;
    private javax.swing.JLabel Direccion5;
    private javax.swing.JLabel Direccion6;
    private javax.swing.JLabel Direccion7;
    private javax.swing.JLabel Direccion8;
    private javax.swing.JButton Volv1;
    private javax.swing.JButton Volv2;
    private javax.swing.JButton Volv3;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField eCC;
    private javax.swing.JTextField eCelular;
    private javax.swing.JTextField eDireccion;
    private javax.swing.JTextField eDireccion1;
    private javax.swing.JTextField eDireccion2;
    private javax.swing.JTextField eDireccion3;
    private javax.swing.JTextField eDireccion4;
    private javax.swing.JTextField eDireccion6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
