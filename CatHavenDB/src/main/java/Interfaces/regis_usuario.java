package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class regis_usuario extends javax.swing.JFrame {

    public regis_usuario() {
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
        eCC = new javax.swing.JTextField();
        eCelular = new javax.swing.JTextField();
        eDireccion = new javax.swing.JTextField();
        Regist = new javax.swing.JButton();
        Volv = new javax.swing.JButton();
        Direccion1 = new javax.swing.JLabel();
        Direccion2 = new javax.swing.JLabel();
        eDireccion2 = new javax.swing.JTextField();
        Direccion3 = new javax.swing.JLabel();
        eDireccion3 = new javax.swing.JTextField();
        Direccion4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        Direccion5 = new javax.swing.JLabel();
        Direccion6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nombre.setText("Nombre de usuario");
        jPanel1.add(Nombre);
        Nombre.setBounds(110, 120, 150, 40);

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setText("Contraseña");
        jPanel1.add(Apellido);
        Apellido.setBounds(110, 170, 150, 40);

        CC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC.setText("Nombre completo");
        jPanel1.add(CC);
        CC.setBounds(110, 220, 120, 40);

        celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular.setText("C.C");
        jPanel1.add(celular);
        celular.setBounds(110, 270, 140, 40);

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion.setText("Dirección");
        jPanel1.add(Direccion);
        Direccion.setBounds(110, 370, 150, 40);
        jPanel1.add(eNombre);
        eNombre.setBounds(250, 120, 350, 40);
        jPanel1.add(eApellido);
        eApellido.setBounds(250, 170, 350, 40);
        jPanel1.add(eCC);
        eCC.setBounds(250, 220, 350, 40);
        jPanel1.add(eCelular);
        eCelular.setBounds(250, 270, 350, 40);
        jPanel1.add(eDireccion);
        eDireccion.setBounds(250, 370, 350, 40);

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
        Direccion1.setText("Edad");
        jPanel1.add(Direccion1);
        Direccion1.setBounds(110, 320, 150, 40);

        Direccion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion2.setText("Teléfono");
        jPanel1.add(Direccion2);
        Direccion2.setBounds(110, 420, 150, 40);
        jPanel1.add(eDireccion2);
        eDireccion2.setBounds(250, 420, 350, 40);

        Direccion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion3.setText("Correo electrónico");
        jPanel1.add(Direccion3);
        Direccion3.setBounds(110, 470, 150, 40);
        jPanel1.add(eDireccion3);
        eDireccion3.setBounds(250, 470, 350, 40);

        Direccion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion4.setText("Experiencia con mascotas");
        jPanel1.add(Direccion4);
        Direccion4.setBounds(110, 520, 150, 40);

        jCheckBox1.setText("Si");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(280, 530, 40, 20);

        jCheckBox2.setText("No");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(360, 530, 50, 20);

        Direccion5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion5.setText("Descripción de su hogar");
        jPanel1.add(Direccion5);
        Direccion5.setBounds(110, 570, 150, 40);

        Direccion6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion6.setText("Motivo para adoptar");
        jPanel1.add(Direccion6);
        Direccion6.setBounds(110, 680, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 570, 350, 100);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(250, 690, 350, 100);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registre los siguientes datos personales:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 40, 500, 70);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Perfil Persona Adoptante");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 230, 31);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(570, 0, 130, 130);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(250, 320, 160, 40);

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

    private void RegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistMouseClicked

    }//GEN-LAST:event_RegistMouseClicked

    private void VolvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolvMouseClicked

    }//GEN-LAST:event_VolvMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
    private javax.swing.JLabel Direccion6;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Regist;
    private javax.swing.JButton Volv;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField eApellido;
    private javax.swing.JTextField eCC;
    private javax.swing.JTextField eCelular;
    private javax.swing.JTextField eDireccion;
    private javax.swing.JTextField eDireccion2;
    private javax.swing.JTextField eDireccion3;
    private javax.swing.JTextField eNombre;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
