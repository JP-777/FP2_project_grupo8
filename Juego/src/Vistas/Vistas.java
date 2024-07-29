/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;
public class Vistas extends javax.swing.JFrame {

    public Vistas() {
        initComponents();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        izquierdaPanel = new javax.swing.JPanel();
        semaforo = new Formas.PanelRound();
        circleVerde = new Formas.CirclePanel();
        circleRoj = new Formas.CirclePanel();
        circleAmarillo = new Formas.CirclePanel();
        centroPanel = new javax.swing.JPanel();
        juego = new Formas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        CalleArriba1 = new javax.swing.JLabel();
        CalleArriba2 = new javax.swing.JLabel();
        calleAbajo1 = new javax.swing.JLabel();
        calleAbajo2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        derechaPanel = new javax.swing.JPanel();
        info = new Formas.PanelRound();
        radioVerde = new javax.swing.JRadioButton();
        radioAmarillo = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioRoj = new javax.swing.JRadioButton();

        jCheckBox2.setText("jCheckBox2");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izquierdaPanel.setBackground(new java.awt.Color(255, 255, 255));
        izquierdaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        semaforo.setBackground(new java.awt.Color(204, 204, 204));
        semaforo.setOpaque(true);
        semaforo.setRoundBottomLeft(40);
        semaforo.setRoundBottomRight(40);
        semaforo.setRoundTopLeft(40);
        semaforo.setRoundTopRight(40);
        semaforo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        circleVerde.setBackground(java.awt.Color.gray);
        circleVerde.setForeground(new java.awt.Color(0, 255, 204));
        circleVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleVerdeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout circleVerdeLayout = new javax.swing.GroupLayout(circleVerde);
        circleVerde.setLayout(circleVerdeLayout);
        circleVerdeLayout.setHorizontalGroup(
            circleVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        circleVerdeLayout.setVerticalGroup(
            circleVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        semaforo.add(circleVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 200, 200));

        circleRoj.setBackground(java.awt.Color.gray);
        circleRoj.setForeground(new java.awt.Color(0, 255, 204));
        circleRoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleRojMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout circleRojLayout = new javax.swing.GroupLayout(circleRoj);
        circleRoj.setLayout(circleRojLayout);
        circleRojLayout.setHorizontalGroup(
            circleRojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        circleRojLayout.setVerticalGroup(
            circleRojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        semaforo.add(circleRoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 200));

        circleAmarillo.setBackground(java.awt.Color.gray);
        circleAmarillo.setForeground(new java.awt.Color(0, 255, 204));
        circleAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleAmarilloMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout circleAmarilloLayout = new javax.swing.GroupLayout(circleAmarillo);
        circleAmarillo.setLayout(circleAmarilloLayout);
        circleAmarilloLayout.setHorizontalGroup(
            circleAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        circleAmarilloLayout.setVerticalGroup(
            circleAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        semaforo.add(circleAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 200));

        izquierdaPanel.add(semaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 660));

        getContentPane().add(izquierdaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        centroPanel.setBackground(new java.awt.Color(255, 255, 255));
        centroPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juego.setBackground(new java.awt.Color(51, 255, 0));
        juego.setOpaque(true);
        juego.setRoundBottomLeft(40);
        juego.setRoundBottomRight(40);
        juego.setRoundTopLeft(40);
        juego.setRoundTopRight(40);
        juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pollitoChiquito.png"))); // NOI18N
        juego.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 100, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 100, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 100, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/albolChiquito.png"))); // NOI18N
        juego.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 110));

        carro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/rojo.png"))); // NOI18N
        carro1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                carro1ComponentMoved(evt);
            }
        });
        juego.add(carro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        carro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/verde.png"))); // NOI18N
        juego.add(carro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/amarillo.png"))); // NOI18N
        carro3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                carro3MouseDragged(evt);
            }
        });
        juego.add(carro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        CalleArriba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(CalleArriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 144, -1, -1));

        CalleArriba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(CalleArriba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 144, -1, -1));

        calleAbajo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(calleAbajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 366, -1, -1));

        calleAbajo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(calleAbajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 366, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pollitoChiquito.png"))); // NOI18N
        juego.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, 50));

        centroPanel.add(juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 660, 580));

        jLabel9.setText("APRENDIENDO CON SEMAFOROS");
        centroPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 230, 50));

        getContentPane().add(centroPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 700, 700));

        derechaPanel.setBackground(new java.awt.Color(255, 255, 255));
        derechaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info.setBackground(java.awt.Color.white);
        info.setForeground(java.awt.Color.white);
        info.setOpaque(true);
        info.setRoundBottomLeft(40);
        info.setRoundBottomRight(40);
        info.setRoundTopLeft(40);
        info.setRoundTopRight(40);

        radioVerde.setBackground(java.awt.Color.green);
        radioVerde.setText("Verde");
        radioVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioVerdeMouseClicked(evt);
            }
        });

        radioAmarillo.setBackground(java.awt.Color.yellow);
        radioAmarillo.setText("Amarillo");
        radioAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioAmarilloMouseClicked(evt);
            }
        });

        radioRoj.setBackground(java.awt.Color.red);
        radioRoj.setText("Rojo");
        radioRoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarColorRojo(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioRoj, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioRoj)
                .addGap(117, 117, 117)
                .addComponent(radioAmarillo)
                .addGap(155, 155, 155)
                .addComponent(radioVerde)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        derechaPanel.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 600));

        getContentPane().add(derechaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 300, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarColorRojo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColorRojo
 circleRoj.setBackground(Color.red);
 circleAmarillo.setBackground(Color.gray);
 circleVerde.setBackground(Color.gray);      
    }//GEN-LAST:event_cambiarColorRojo

    private void circleRojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleRojMouseClicked
circleRoj.setBackground(Color.yellow);
    }//GEN-LAST:event_circleRojMouseClicked

    private void circleAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleAmarilloMouseClicked
 circleAmarillo.setBackground(Color.red);
    }//GEN-LAST:event_circleAmarilloMouseClicked

    private void circleVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleVerdeMouseClicked
 circleVerde.setBackground(Color.green);
    }//GEN-LAST:event_circleVerdeMouseClicked

    private void radioAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioAmarilloMouseClicked
 circleRoj.setBackground(Color.gray);
 circleAmarillo.setBackground(Color.yellow);
 circleVerde.setBackground(Color.gray);
    }//GEN-LAST:event_radioAmarilloMouseClicked

    private void radioVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioVerdeMouseClicked
 circleRoj.setBackground(Color.gray);
 circleAmarillo.setBackground(Color.gray);
 circleVerde.setBackground(Color.green);
    }//GEN-LAST:event_radioVerdeMouseClicked

    private void carro1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_carro1ComponentMoved
      
    }//GEN-LAST:event_carro1ComponentMoved

    private void carro3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carro3MouseDragged
    if (circleVerde.getBackground() == Color.GREEN) {
                    avanzarCarro(carro3);
              
    }//GEN-LAST:event_carro3MouseDragged
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vistas().setVisible(true);
        });
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalleArriba1;
    private javax.swing.JLabel CalleArriba2;
    private javax.swing.JLabel calleAbajo1;
    private javax.swing.JLabel calleAbajo2;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carro3;
    private javax.swing.JPanel centroPanel;
    private Formas.CirclePanel circleAmarillo;
    private Formas.CirclePanel circleRoj;
    private Formas.CirclePanel circleVerde;
    private javax.swing.JPanel derechaPanel;
    private Formas.PanelRound info;
    private javax.swing.JPanel izquierdaPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Formas.PanelRound juego;
    private javax.swing.JRadioButton radioAmarillo;
    private javax.swing.JRadioButton radioVerde;
    private Formas.PanelRound semaforo;
    // End of variables declaration//GEN-END:variables

    private void avanzarCarro(JLabel carro3) {
    Point location = carro3.getLocation();
    
    // Calcula la nueva posición x (avanzar 10 píxeles, por ejemplo)
    int newX = location.x + 10; // Ajusta el valor de avance según sea necesario
    
    // Obtiene el ancho del panel donde está el carro
    int panelWidth = carro3.getParent().getWidth();
    
    // Verifica si el carro se ha salido del panel
    if (newX > panelWidth) {
        newX = -carro3.getWidth();
    }
    
    carro3.setLocation(newX, location.y);
    }
}
        
   


