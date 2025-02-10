package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class regis_gato extends javax.swing.JFrame {

    public regis_gato() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        CC = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        eNombre = new javax.swing.JTextField();
        eApellido = new javax.swing.JTextField();
        Regist = new javax.swing.JButton();
        Volv = new javax.swing.JButton();
        Direccion1 = new javax.swing.JLabel();
        Direccion2 = new javax.swing.JLabel();
        Direccion5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Direccion3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Direccion4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        logo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nombre.setText("Nombre");
        jPanel1.add(Nombre);
        Nombre.setBounds(110, 140, 150, 40);

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setText("Edad");
        jPanel1.add(Apellido);
        Apellido.setBounds(110, 200, 150, 40);

        CC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC.setText("Sexo");
        jPanel1.add(CC);
        CC.setBounds(110, 260, 120, 40);

        celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular.setText("Raza");
        jPanel1.add(celular);
        celular.setBounds(110, 320, 140, 40);

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion.setText("Estado de salud");
        jPanel1.add(Direccion);
        Direccion.setBounds(110, 430, 150, 40);
        jPanel1.add(eNombre);
        eNombre.setBounds(250, 140, 350, 40);
        jPanel1.add(eApellido);
        eApellido.setBounds(250, 200, 350, 40);

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
        Regist.setBounds(430, 820, 170, 50);

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
        Volv.setBounds(100, 820, 170, 50);

        Direccion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion1.setText("Color");
        jPanel1.add(Direccion1);
        Direccion1.setBounds(110, 380, 150, 40);

        Direccion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion2.setText("Personalidad del animal");
        jPanel1.add(Direccion2);
        Direccion2.setBounds(110, 620, 150, 40);

        Direccion5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion5.setText("Historial médico");
        jPanel1.add(Direccion5);
        Direccion5.setBounds(110, 480, 150, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saludable", "Problemas menores", "Heridas/Enfermedades" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 440, 160, 22);

        Direccion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion3.setText("Fecha ingreso");
        jPanel1.add(Direccion3);
        Direccion3.setBounds(110, 720, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 480, 350, 86);

        Direccion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion4.setText("Esterilización");
        jPanel1.add(Direccion4);
        Direccion4.setBounds(110, 570, 150, 40);

        jCheckBox1.setText("Si");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(280, 580, 40, 20);

        jCheckBox2.setText("No");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(360, 580, 50, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Perfil Gato en Adopción");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 220, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registro del gato en Adopción:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 40, 450, 70);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(250, 620, 350, 86);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(570, 0, 130, 130);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(250, 730, 100, 22);

        jComboBox5.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(250, 260, 160, 40);

        jComboBox6.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Negro", "Amarillo", "Gris", "Marron", "Melocoton", "Cafe claro" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(250, 380, 160, 40);

        jComboBox7.setBackground(new java.awt.Color(241, 241, 255));
        jComboBox7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siamés", "British Shorthair", "Maine Coon", "Persa", "Ragdoll", "Esfinge", "Abisino", "Americano Rayado", "Burmés", "Exotico", "Birmano", "Fold Escocés", "Bombay", "Siberiano", "Bosque de Noruega", "Azul Ruso", "Munchkin", "Curl Americano", "Bobtail Americano", "Balinés", "Devon Rex", "Oriental", "Chaertreux", "Bobtail Japonés", "Manx", "Angora Turco", "Pelo Blanco Americano", "Ragamuffin", "Mau Egipcio", "Himalayo", "Somalí", "Cornish Rex", "Korat", "Singapura", "Ocicat", "Tonkinés", "Selkirk Rex", "Van Turco", "Británico de pelo largo", "Habana Brown", "LaPerm", "Chausie", "Burmilla", "Snowshoe", "Lykoi", "Javanés", "Toyger", "Colorpoint Shorthair", "Sokoke", "Australian Mist", "Khao Manee" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox7);
        jComboBox7.setBounds(250, 320, 160, 40);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistMouseClicked

    }//GEN-LAST:event_RegistMouseClicked

    private void VolvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolvMouseClicked

    }//GEN-LAST:event_VolvMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel CC;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JLabel Direccion3;
    private javax.swing.JLabel Direccion4;
    private javax.swing.JLabel Direccion5;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Regist;
    private javax.swing.JButton Volv;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField eApellido;
    private javax.swing.JTextField eNombre;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
