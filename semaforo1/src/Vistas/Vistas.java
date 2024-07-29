package Vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Vistas extends javax.swing.JFrame {
    
    private Timer moveTimer; // Declarar el Timer aquí
    private int moveSpeed = 2; // Declarar la velocidad aquí
    
    public Vistas() {
        initComponents();
        startCarMovement();
        setupKeyListener();
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
        carro1Panel = new javax.swing.JPanel();
        carro1Panel1 = new javax.swing.JPanel();
        carro5 = new javax.swing.JLabel();
        carro2Panel = new javax.swing.JPanel();
        carro2 = new javax.swing.JLabel();
        carro3Panel = new javax.swing.JPanel();
        carro3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CalleArriba1 = new javax.swing.JLabel();
        CalleArriba2 = new javax.swing.JLabel();
        calleAbajo1 = new javax.swing.JLabel();
        calleAbajo2 = new javax.swing.JLabel();
        playerPrincipal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        derechaPanel = new javax.swing.JPanel();
        info = new Formas.PanelRound();
        radioVerde = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();
        javax.swing.JRadioButton radioRoj = new javax.swing.JRadioButton();
        radioAmarillo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        getContentPane().add(izquierdaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 700));

        centroPanel.setBackground(new java.awt.Color(255, 255, 255));
        centroPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juego.setBackground(new java.awt.Color(51, 255, 0));
        juego.setOpaque(true);
        juego.setRoundBottomLeft(40);
        juego.setRoundBottomRight(40);
        juego.setRoundTopLeft(40);
        juego.setRoundTopRight(40);
        juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/rojo.png"))); // NOI18N
        carro5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                carro5ComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout carro1Panel1Layout = new javax.swing.GroupLayout(carro1Panel1);
        carro1Panel1.setLayout(carro1Panel1Layout);
        carro1Panel1Layout.setHorizontalGroup(
            carro1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(carro1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carro1Panel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carro5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        carro1Panel1Layout.setVerticalGroup(
            carro1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(carro1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carro1Panel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carro5)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout carro1PanelLayout = new javax.swing.GroupLayout(carro1Panel);
        carro1Panel.setLayout(carro1PanelLayout);
        carro1PanelLayout.setHorizontalGroup(
            carro1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(carro1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carro1PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(carro1Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        carro1PanelLayout.setVerticalGroup(
            carro1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(carro1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carro1PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(carro1Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        juego.add(carro1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 110, 60));

        carro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/verde.png"))); // NOI18N

        javax.swing.GroupLayout carro2PanelLayout = new javax.swing.GroupLayout(carro2Panel);
        carro2Panel.setLayout(carro2PanelLayout);
        carro2PanelLayout.setHorizontalGroup(
            carro2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carro2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carro2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carro2PanelLayout.setVerticalGroup(
            carro2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carro2PanelLayout.createSequentialGroup()
                .addComponent(carro2)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        juego.add(carro2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 60));

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/amarillo.png"))); // NOI18N
        carro3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                carro3MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout carro3PanelLayout = new javax.swing.GroupLayout(carro3Panel);
        carro3Panel.setLayout(carro3PanelLayout);
        carro3PanelLayout.setHorizontalGroup(
            carro3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carro3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carro3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carro3PanelLayout.setVerticalGroup(
            carro3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carro3PanelLayout.createSequentialGroup()
                .addComponent(carro3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        juego.add(carro3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 450, 120, 50));

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

        CalleArriba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(CalleArriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 144, -1, -1));

        CalleArriba2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(CalleArriba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 144, -1, -1));

        calleAbajo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(calleAbajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 366, -1, -1));

        calleAbajo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calleImg.png"))); // NOI18N
        juego.add(calleAbajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 366, -1, -1));

        playerPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pollitoChiquito.png"))); // NOI18N
        juego.add(playerPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, 50));

        centroPanel.add(juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 660, 580));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel9.setForeground(java.awt.Color.orange);
        jLabel9.setText("APRENDIENDO CON SEMAFOROS");
        centroPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 590, 50));

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

        jLabel11.setText("Luz verde! ¡Adelante!");

        carro4.setForeground(java.awt.Color.white);
        carro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carros/Policia.png"))); // NOI18N
        carro4.setAlignmentX(0.5F);

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(radioVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(carro4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioVerde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carro4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        derechaPanel.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 280, 600));

        radioRoj.setBackground(java.awt.Color.red);
        radioRoj.setText("Rojo");
        radioRoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarColorRojo(evt);
            }
        });
        derechaPanel.add(radioRoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, -1));

        radioAmarillo.setBackground(java.awt.Color.yellow);
        radioAmarillo.setText("Amarillo");
        radioAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioAmarilloMouseClicked(evt);
            }
        });
        derechaPanel.add(radioAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, -1));

        jLabel8.setText("¡Luz roja! ¡Alto!");
        derechaPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel10.setText("¡Luz amarilla!Prepárate para detenerte");
        derechaPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        getContentPane().add(derechaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 300, 620));

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

    private void carro3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carro3MouseDragged

    }//GEN-LAST:event_carro3MouseDragged

    private void radioVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioVerdeMouseClicked
        circleRoj.setBackground(Color.gray);
        circleAmarillo.setBackground(Color.gray);
        circleVerde.setBackground(Color.green);
    }//GEN-LAST:event_radioVerdeMouseClicked

    private void carro5ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_carro5ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_carro5ComponentMoved
    
    private void startCarMovement() {
        moveTimer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveCar(carro1Panel);
                moveCar(carro2Panel);
                moveCar(carro3Panel);
            }
        });
        moveTimer.start();
    }
    
    private void moveCar(JPanel carPanel) {
    
        int x = carPanel.getLocation().x;
        int width = carPanel.getWidth();
        int panelWidth = juego.getWidth();

        if (x + width >= panelWidth || x <= 0) {
            moveSpeed = -moveSpeed;
        }

        carPanel.setLocation(x + moveSpeed, carPanel.getLocation().y);

        if (Hitbox.isColliding(carPanel, playerPrincipal)) {
            JOptionPane.showMessageDialog(this, "Game Over");
            dispose();
        }
    }

    private void moveCars(boolean canMove) {
        if (canMove) {
            moveTimer.start();
        } else {
            moveTimer.stop();
        }
    }

    private void setupKeyListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                int x = playerPrincipal.getX();
                int y = playerPrincipal.getY();
                int step = 10; // La distancia que se moverá el jugador con cada tecla

                switch (key) {
                    case KeyEvent.VK_UP:
                        if (y - step >= 0) {
                            playerPrincipal.setLocation(x, y - step);
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (y + step + playerPrincipal.getHeight() <= juego.getHeight()) {
                            playerPrincipal.setLocation(x, y + step);
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if (x - step >= 0) {
                            playerPrincipal.setLocation(x - step, y);
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (x + step + playerPrincipal.getWidth() <= juego.getWidth()) {
                            playerPrincipal.setLocation(x + step, y);
                        }
                        break;
                }
            }
        });
        setFocusable(true);
        requestFocusInWindow();
    }
    
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
    private javax.swing.JPanel carro1Panel;
    private javax.swing.JPanel carro1Panel1;
    private javax.swing.JLabel carro2;
    private javax.swing.JPanel carro2Panel;
    private javax.swing.JLabel carro3;
    private javax.swing.JPanel carro3Panel;
    private javax.swing.JLabel carro4;
    private javax.swing.JLabel carro5;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Formas.PanelRound juego;
    private javax.swing.JLabel playerPrincipal;
    private javax.swing.JRadioButton radioAmarillo;
    private javax.swing.JRadioButton radioVerde;
    private Formas.PanelRound semaforo;
    // End of variables declaration//GEN-END:variables

}
        
   


