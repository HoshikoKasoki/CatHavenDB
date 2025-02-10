package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class info_gato extends javax.swing.JFrame {

    public info_gato() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
        colocar_imagen(gato,"src/main/java/imagenes/gato placeholder.jpg");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Regist = new javax.swing.JButton();
        Volv = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
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
        logo = new javax.swing.JLabel();
        gato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        Regist.setBackground(new java.awt.Color(204, 255, 255));
        Regist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Regist.setForeground(new java.awt.Color(51, 51, 51));
        Regist.setText("Enviar solicitud de adopción");
        Regist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistMouseClicked(evt);
            }
        });
        jPanel1.add(Regist);
        Regist.setBounds(350, 830, 310, 40);

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
        Volv.setBounds(40, 830, 110, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Perfil Gato en Adopción");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 700, 40);

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nombre.setText("Nombre Gato");
        jPanel1.add(Nombre);
        Nombre.setBounds(250, 90, 150, 40);

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setText("Edad Gato");
        jPanel1.add(Apellido);
        Apellido.setBounds(110, 270, 150, 40);

        CC1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC1.setText("Sexo");
        jPanel1.add(CC1);
        CC1.setBounds(110, 330, 120, 40);

        celular1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular1.setText("Raza");
        jPanel1.add(celular1);
        celular1.setBounds(110, 390, 140, 40);

        Direccion5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion5.setText("Estado de salud");
        jPanel1.add(Direccion5);
        Direccion5.setBounds(110, 510, 150, 40);
        jPanel1.add(eNombre);
        eNombre.setBounds(250, 740, 350, 40);
        jPanel1.add(eApellido);
        eApellido.setBounds(250, 270, 350, 40);
        jPanel1.add(eCC1);
        eCC1.setBounds(250, 330, 350, 40);
        jPanel1.add(eCelular1);
        eCelular1.setBounds(250, 390, 350, 40);

        Direccion6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion6.setText("Color");
        jPanel1.add(Direccion6);
        Direccion6.setBounds(110, 450, 150, 40);
        jPanel1.add(eDireccion4);
        eDireccion4.setBounds(250, 450, 350, 40);

        Direccion8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion8.setText("Historial médico");
        jPanel1.add(Direccion8);
        Direccion8.setBounds(110, 570, 150, 40);

        Direccion9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion9.setText("Fecha ingreso");
        jPanel1.add(Direccion9);
        Direccion9.setBounds(110, 740, 150, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 570, 350, 86);

        Direccion10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Direccion10.setText("Esterilización");
        jPanel1.add(Direccion10);
        Direccion10.setBounds(110, 680, 150, 40);

        eNombre1.setBackground(new java.awt.Color(220, 220, 255));
        jPanel1.add(eNombre1);
        eNombre1.setBounds(250, 150, 350, 40);
        jPanel1.add(eNombre2);
        eNombre2.setBounds(250, 510, 350, 40);
        jPanel1.add(eNombre3);
        eNombre3.setBounds(250, 680, 350, 40);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(570, 30, 130, 130);

        gato.setText("Insert cat image");
        jPanel1.add(gato);
        gato.setBounds(70, 90, 150, 150);

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

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel CC1;
    private javax.swing.JLabel Direccion10;
    private javax.swing.JLabel Direccion5;
    private javax.swing.JLabel Direccion6;
    private javax.swing.JLabel Direccion8;
    private javax.swing.JLabel Direccion9;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Regist;
    private javax.swing.JButton Volv;
    private javax.swing.JLabel celular1;
    private javax.swing.JTextField eApellido;
    private javax.swing.JTextField eCC1;
    private javax.swing.JTextField eCelular1;
    private javax.swing.JTextField eDireccion4;
    private javax.swing.JTextField eNombre;
    private javax.swing.JTextField eNombre1;
    private javax.swing.JTextField eNombre2;
    private javax.swing.JTextField eNombre3;
    private javax.swing.JLabel gato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
