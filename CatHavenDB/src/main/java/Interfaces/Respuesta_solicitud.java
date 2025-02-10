package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Respuesta_solicitud extends javax.swing.JFrame {

    public Respuesta_solicitud() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volv = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

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
        Volv.setBounds(60, 790, 170, 50);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(190, 140, 320, 320);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Respuesta Solicitud de Adopción:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 60, 570, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("¡Nuestro personal lo contactará pronto!");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 110, 460, 70);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Su solicitud de adopción ha sido aprobada.");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 40, 500, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 490, 570, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolvMouseClicked

    }//GEN-LAST:event_VolvMouseClicked

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
