package Vistas;

import javax.swing.JComponent;

public class Hitbox {
    public static boolean isColliding(JComponent a, JComponent b) {
        int ax = a.getX();
        int ay = a.getY();
        int aw = a.getWidth();
        int ah = a.getHeight();

        int bx = b.getX();
        int by = b.getY();
        int bw = b.getWidth();
        int bh = b.getHeight();

        return ax < bx + bw && ax + aw > bx && ay < by + bh && ay + ah > by;
    }
}
