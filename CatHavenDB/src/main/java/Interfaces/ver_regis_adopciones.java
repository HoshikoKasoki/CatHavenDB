package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ver_regis_adopciones extends javax.swing.JFrame {

    public ver_regis_adopciones() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Volv = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        CC1 = new javax.swing.JLabel();
        celular1 = new javax.swing.JLabel();
        Direccion5 = new javax.swing.JLabel();
        eNombre = new javax.swing.JTextField();
        eApellido = new javax.swing.JTextField();
        eCC1 = new javax.swing.JTextField();
        eCelular1 = new javax.swing.JTextField();
        Direccion6 = new javax.swing.JLabel();
        eDireccion4 = new javax.swing.JTextField();
        Direccion8 = new javax.swing.JLabel();
        Direccion9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Direccion10 = new javax.swing.JLabel();
        eNombre1 = new javax.swing.JTextField();
        eNombre2 = new javax.swing.JTextField();
        eNombre3 = new javax.swing.JTextField();
        CC2 = new javax.swing.JLabel();
        celular2 = new javax.swing.JLabel();
        eCC2 = new javax.swing.JTextField();
        eCelular2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eNombre4 = new javax.swing.JTextField();
        Direccion11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
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
        Volv.setBounds(50, 820, 150, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Perfil Adopciones");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 170, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Datos del gato adoptado:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(590, 190, 480, 70);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(1020, 0, 130, 130);

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Direccion.setText("ID del gato");
        jPanel1.add(Direccion);
        Direccion.setBounds(410, 110, 150, 40);

        jComboBox1.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(510, 110, 160, 40);

        CC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC.setText("Nombre Adoptante");
        jPanel1.add(CC);
        CC.setBounds(50, 270, 120, 40);

        celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular.setText("C.C Adoptante");
        jPanel1.add(celular);
        celular.setBounds(50, 320, 140, 40);

        Direccion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion1.setText("Dirección");
        jPanel1.add(Direccion1);
        Direccion1.setBounds(50, 420, 150, 40);
        jPanel1.add(eCC);
        eCC.setBounds(190, 270, 350, 40);
        jPanel1.add(eCelular);
        eCelular.setBounds(190, 320, 350, 40);
        jPanel1.add(eDireccion);
        eDireccion.setBounds(190, 420, 350, 40);

        Direccion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion2.setText("Edad Adoptante");
        jPanel1.add(Direccion2);
        Direccion2.setBounds(50, 370, 150, 40);
        jPanel1.add(eDireccion1);
        eDireccion1.setBounds(190, 370, 350, 40);

        Direccion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion3.setText("Teléfono");
        jPanel1.add(Direccion3);
        Direccion3.setBounds(50, 470, 150, 40);
        jPanel1.add(eDireccion2);
        eDireccion2.setBounds(190, 470, 350, 40);

        Direccion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion4.setText("Correo electrónico");
        jPanel1.add(Direccion4);
        Direccion4.setBounds(50, 520, 150, 40);
        jPanel1.add(eDireccion3);
        eDireccion3.setBounds(190, 520, 350, 40);

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nombre.setText("Nombre Gato");
        jPanel1.add(Nombre);
        Nombre.setBounds(610, 260, 150, 40);

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setText("Edad Gato");
        jPanel1.add(Apellido);
        Apellido.setBounds(610, 320, 150, 40);

        CC1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC1.setText("Sexo");
        jPanel1.add(CC1);
        CC1.setBounds(610, 380, 120, 40);

        celular1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular1.setText("Raza");
        jPanel1.add(celular1);
        celular1.setBounds(610, 440, 140, 40);

        Direccion5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion5.setText("Estado de salud");
        jPanel1.add(Direccion5);
        Direccion5.setBounds(610, 560, 150, 40);
        jPanel1.add(eNombre);
        eNombre.setBounds(750, 790, 350, 40);
        jPanel1.add(eApellido);
        eApellido.setBounds(750, 320, 350, 40);
        jPanel1.add(eCC1);
        eCC1.setBounds(750, 380, 350, 40);
        jPanel1.add(eCelular1);
        eCelular1.setBounds(750, 440, 350, 40);

        Direccion6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion6.setText("Color");
        jPanel1.add(Direccion6);
        Direccion6.setBounds(610, 500, 150, 40);
        jPanel1.add(eDireccion4);
        eDireccion4.setBounds(750, 500, 350, 40);

        Direccion8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion8.setText("Historial médico");
        jPanel1.add(Direccion8);
        Direccion8.setBounds(610, 620, 150, 40);

        Direccion9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion9.setText("Fecha ingreso");
        jPanel1.add(Direccion9);
        Direccion9.setBounds(610, 790, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(750, 620, 350, 86);

        Direccion10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion10.setText("Esterilización");
        jPanel1.add(Direccion10);
        Direccion10.setBounds(610, 730, 150, 40);
        jPanel1.add(eNombre1);
        eNombre1.setBounds(750, 260, 350, 40);
        jPanel1.add(eNombre2);
        eNombre2.setBounds(750, 560, 350, 40);
        jPanel1.add(eNombre3);
        eNombre3.setBounds(750, 730, 350, 40);

        CC2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC2.setText("Nombre Administrador");
        jPanel1.add(CC2);
        CC2.setBounds(50, 680, 130, 40);

        celular2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular2.setText("C.C Administrador");
        jPanel1.add(celular2);
        celular2.setBounds(50, 730, 140, 40);
        jPanel1.add(eCC2);
        eCC2.setBounds(190, 680, 350, 40);
        jPanel1.add(eCelular2);
        eCelular2.setBounds(190, 730, 350, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Registros de Adopciones");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 30, 430, 70);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Datos del administrador:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 600, 480, 70);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Datos de la persona adoptante:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 480, 70);
        jPanel1.add(eNombre4);
        eNombre4.setBounds(750, 840, 350, 40);

        Direccion11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion11.setText("Fecha de adopción");
        jPanel1.add(Direccion11);
        Direccion11.setBounds(610, 840, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolvMouseClicked

    }//GEN-LAST:event_VolvMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel CC;
    private javax.swing.JLabel CC1;
    private javax.swing.JLabel CC2;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Direccion10;
    private javax.swing.JLabel Direccion11;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JLabel Direccion3;
    private javax.swing.JLabel Direccion4;
    private javax.swing.JLabel Direccion5;
    private javax.swing.JLabel Direccion6;
    private javax.swing.JLabel Direccion8;
    private javax.swing.JLabel Direccion9;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Volv;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel celular1;
    private javax.swing.JLabel celular2;
    private javax.swing.JTextField eApellido;
    private javax.swing.JTextField eCC;
    private javax.swing.JTextField eCC1;
    private javax.swing.JTextField eCC2;
    private javax.swing.JTextField eCelular;
    private javax.swing.JTextField eCelular1;
    private javax.swing.JTextField eCelular2;
    private javax.swing.JTextField eDireccion;
    private javax.swing.JTextField eDireccion1;
    private javax.swing.JTextField eDireccion2;
    private javax.swing.JTextField eDireccion3;
    private javax.swing.JTextField eDireccion4;
    private javax.swing.JTextField eNombre;
    private javax.swing.JTextField eNombre1;
    private javax.swing.JTextField eNombre2;
    private javax.swing.JTextField eNombre3;
    private javax.swing.JTextField eNombre4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
