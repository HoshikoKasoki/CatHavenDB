package Interfaces;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Gatos_en_adopcion extends javax.swing.JFrame {

    public Gatos_en_adopcion() {
        initComponents();
        this.setLocationRelativeTo(this);
        colocar_imagen(gato1,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato2,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato3,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato4,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato5,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato6,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato7,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato8,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato9,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato10,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato11,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(gato12,"src/main/java/imagenes/gato placeholder.jpg");
        colocar_imagen(logo,"src/main/java/imagenes/logo_gatito.png" );
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Gato7 = new javax.swing.JButton();
        Gato8 = new javax.swing.JButton();
        Gato1 = new javax.swing.JButton();
        Gato2 = new javax.swing.JButton();
        Gato9 = new javax.swing.JButton();
        Gato3 = new javax.swing.JButton();
        Gato10 = new javax.swing.JButton();
        Gato4 = new javax.swing.JButton();
        Gato11 = new javax.swing.JButton();
        Gato5 = new javax.swing.JButton();
        Gato12 = new javax.swing.JButton();
        Gato6 = new javax.swing.JButton();
        gato1 = new javax.swing.JLabel();
        gato2 = new javax.swing.JLabel();
        gato3 = new javax.swing.JLabel();
        gato4 = new javax.swing.JLabel();
        gato5 = new javax.swing.JLabel();
        gato6 = new javax.swing.JLabel();
        gato7 = new javax.swing.JLabel();
        gato8 = new javax.swing.JLabel();
        gato9 = new javax.swing.JLabel();
        gato10 = new javax.swing.JLabel();
        gato11 = new javax.swing.JLabel();
        gato12 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(172, 172, 255));
        jPanel1.setLayout(null);

        Gato7.setBackground(new java.awt.Color(255, 255, 204));
        Gato7.setText("Gato7");
        jPanel1.add(Gato7);
        Gato7.setBounds(380, 640, 72, 23);

        Gato8.setBackground(new java.awt.Color(255, 255, 204));
        Gato8.setText("Gato8");
        jPanel1.add(Gato8);
        Gato8.setBounds(520, 640, 72, 23);

        Gato1.setBackground(new java.awt.Color(255, 255, 204));
        Gato1.setText("Gato1");
        jPanel1.add(Gato1);
        Gato1.setBounds(100, 460, 72, 23);

        Gato2.setBackground(new java.awt.Color(255, 255, 204));
        Gato2.setText("Gato2");
        jPanel1.add(Gato2);
        Gato2.setBounds(240, 460, 72, 23);

        Gato9.setBackground(new java.awt.Color(255, 255, 204));
        Gato9.setText("Gato9");
        jPanel1.add(Gato9);
        Gato9.setBounds(100, 820, 72, 23);

        Gato3.setBackground(new java.awt.Color(255, 255, 204));
        Gato3.setText("Gato3");
        jPanel1.add(Gato3);
        Gato3.setBounds(380, 460, 72, 23);

        Gato10.setBackground(new java.awt.Color(255, 255, 204));
        Gato10.setText("Gato10");
        jPanel1.add(Gato10);
        Gato10.setBounds(240, 820, 80, 23);

        Gato4.setBackground(new java.awt.Color(255, 255, 204));
        Gato4.setText("Gato4");
        jPanel1.add(Gato4);
        Gato4.setBounds(520, 460, 72, 23);

        Gato11.setBackground(new java.awt.Color(255, 255, 204));
        Gato11.setText("Gato11");
        jPanel1.add(Gato11);
        Gato11.setBounds(380, 820, 80, 23);

        Gato5.setBackground(new java.awt.Color(255, 255, 204));
        Gato5.setText("Gato5");
        Gato5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gato5ActionPerformed(evt);
            }
        });
        jPanel1.add(Gato5);
        Gato5.setBounds(100, 640, 72, 23);

        Gato12.setBackground(new java.awt.Color(255, 255, 204));
        Gato12.setText("Gato12");
        jPanel1.add(Gato12);
        Gato12.setBounds(520, 820, 80, 23);

        Gato6.setBackground(new java.awt.Color(255, 255, 204));
        Gato6.setText("Gato6");
        jPanel1.add(Gato6);
        Gato6.setBounds(240, 640, 72, 23);

        gato1.setText("Insert cat image");
        jPanel1.add(gato1);
        gato1.setBounds(80, 340, 110, 110);

        gato2.setText("Insert cat image");
        jPanel1.add(gato2);
        gato2.setBounds(220, 340, 110, 110);

        gato3.setText("Insert cat image");
        jPanel1.add(gato3);
        gato3.setBounds(360, 340, 110, 110);

        gato4.setText("Insert cat image");
        jPanel1.add(gato4);
        gato4.setBounds(500, 340, 110, 110);

        gato5.setText("Insert cat image");
        jPanel1.add(gato5);
        gato5.setBounds(80, 520, 110, 110);

        gato6.setText("Insert cat image");
        jPanel1.add(gato6);
        gato6.setBounds(220, 520, 110, 110);

        gato7.setText("Insert cat image");
        jPanel1.add(gato7);
        gato7.setBounds(360, 520, 110, 110);

        gato8.setText("Insert cat image");
        jPanel1.add(gato8);
        gato8.setBounds(500, 520, 110, 110);

        gato9.setText("Insert cat image");
        jPanel1.add(gato9);
        gato9.setBounds(80, 700, 110, 110);

        gato10.setText("Insert cat image");
        jPanel1.add(gato10);
        gato10.setBounds(220, 700, 110, 110);

        gato11.setText("Insert cat image");
        jPanel1.add(gato11);
        gato11.setBounds(360, 700, 110, 110);

        gato12.setText("Insert cat image");
        jPanel1.add(gato12);
        gato12.setBounds(500, 700, 110, 110);

        logo.setText("logo");
        jPanel1.add(logo);
        logo.setBounds(200, 80, 290, 290);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gatos en Adopción");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 40, 500, 70);

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

    private void Gato5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gato5ActionPerformed

    }//GEN-LAST:event_Gato5ActionPerformed

    private void colocar_imagen(JLabel nombre_label, String ruta){
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_label.getWidth(), nombre_label.getHeight(), Image.SCALE_DEFAULT));
        nombre_label.setIcon(icono);
        this.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gato1;
    private javax.swing.JButton Gato10;
    private javax.swing.JButton Gato11;
    private javax.swing.JButton Gato12;
    private javax.swing.JButton Gato2;
    private javax.swing.JButton Gato3;
    private javax.swing.JButton Gato4;
    private javax.swing.JButton Gato5;
    private javax.swing.JButton Gato6;
    private javax.swing.JButton Gato7;
    private javax.swing.JButton Gato8;
    private javax.swing.JButton Gato9;
    private javax.swing.JLabel gato1;
    private javax.swing.JLabel gato10;
    private javax.swing.JLabel gato11;
    private javax.swing.JLabel gato12;
    private javax.swing.JLabel gato2;
    private javax.swing.JLabel gato3;
    private javax.swing.JLabel gato4;
    private javax.swing.JLabel gato5;
    private javax.swing.JLabel gato6;
    private javax.swing.JLabel gato7;
    private javax.swing.JLabel gato8;
    private javax.swing.JLabel gato9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
