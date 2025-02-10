package Interfaces;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class regis_administrador extends javax.swing.JFrame {

    public regis_administrador() {
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
        eNombre = new javax.swing.JTextField();
        eApellido = new javax.swing.JTextField();
        eCC = new javax.swing.JTextField();
        eCelular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        Regist = new javax.swing.JButton();
        Volv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 172, 213));
        jPanel1.setForeground(new java.awt.Color(255, 153, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(null);

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nombre.setText("Nombre de usuario");
        jPanel1.add(Nombre);
        Nombre.setBounds(110, 340, 150, 40);

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Apellido.setText("Contraseña");
        jPanel1.add(Apellido);
        Apellido.setBounds(110, 450, 150, 40);

        CC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CC.setText("Nombre completo");
        jPanel1.add(CC);
        CC.setBounds(110, 560, 120, 40);

        celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        celular.setText("C.C");
        jPanel1.add(celular);
        celular.setBounds(110, 670, 140, 40);
        jPanel1.add(eNombre);
        eNombre.setBounds(250, 340, 350, 40);
        jPanel1.add(eApellido);
        eApellido.setBounds(250, 450, 350, 40);
        jPanel1.add(eCC);
        eCC.setBounds(250, 560, 350, 40);
        jPanel1.add(eCelular);
        eCelular.setBounds(250, 670, 350, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registre los siguientes datos personales:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 40, 500, 70);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 228, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setText("Perfil Administradores");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 0, 210, 31);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(210, 80, 280, 280);

        Regist.setBackground(new java.awt.Color(255, 228, 255));
        Regist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Regist.setForeground(new java.awt.Color(51, 51, 51));
        Regist.setText("Registrar");
        Regist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistMouseClicked(evt);
            }
        });
        jPanel1.add(Regist);
        Regist.setBounds(430, 790, 170, 50);

        Volv.setBackground(new java.awt.Color(255, 228, 255));
        Volv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volv.setForeground(new java.awt.Color(51, 51, 51));
        Volv.setText("Volver");
        Volv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolvMouseClicked(evt);
            }
        });
        jPanel1.add(Volv);
        Volv.setBounds(100, 790, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel CC;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Regist;
    private javax.swing.JButton Volv;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField eApellido;
    private javax.swing.JTextField eCC;
    private javax.swing.JTextField eCelular;
    private javax.swing.JTextField eNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
