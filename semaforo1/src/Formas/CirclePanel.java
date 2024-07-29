package Formas;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class CirclePanel extends JPanel{
    public CirclePanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        
        // Dibuja la elipse que ocupa todo el ancho y alto del panel
        Ellipse2D ellipse = new Ellipse2D.Double(0, 0, getWidth(), getHeight());

        g2d.fill(ellipse);
        g2d.dispose();
        
        super.paintComponent(graphics);
    }

    public Color getColorActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
