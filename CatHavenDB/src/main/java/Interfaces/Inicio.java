package Interfaces;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Inicio extends javax.swing.JFrame {


    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p_adoptante = new javax.swing.JButton();
        p_administrativo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        p_adoptante.setBackground(new java.awt.Color(204, 255, 255));
        p_adoptante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        p_adoptante.setForeground(new java.awt.Color(51, 51, 51));
        p_adoptante.setText("Adoptante");
        p_adoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_adoptanteActionPerformed(evt);
            }
        });
        jPanel1.add(p_adoptante);
        p_adoptante.setBounds(110, 710, 220, 90);

        p_administrativo.setBackground(new java.awt.Color(204, 255, 255));
        p_administrativo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        p_administrativo.setForeground(new java.awt.Color(51, 51, 51));
        p_administrativo.setText("Administrativo");
        p_administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_administrativoActionPerformed(evt);
            }
        });
        jPanel1.add(p_administrativo);
        p_administrativo.setBounds(380, 710, 220, 90);

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel1.setText("CatHavenDB");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 70, 400, 130);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(120, 200, 470, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_adoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_adoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_adoptanteActionPerformed

    private void p_administrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_administrativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_administrativoActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton p_administrativo;
    private javax.swing.JButton p_adoptante;
    // End of variables declaration//GEN-END:variables
}
