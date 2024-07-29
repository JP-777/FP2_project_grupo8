import java.awt.Color;
import javax.swing.JPanel;

public class Semaforo extends JPanel {
    private Color colorActual;

    public Semaforo() {
        colorActual = Color.RED; // Inicialmente en rojo
    }

    public Color getColorActual() {
        return colorActual;
    }

    public void setColorActual(Color colorActual) {
        this.colorActual = colorActual;
        repaint(); // Redibuja el panel para reflejar el cambio de color
    }
}
