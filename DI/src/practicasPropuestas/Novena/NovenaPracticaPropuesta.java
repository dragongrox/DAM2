package practicasPropuestas.Novena;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Comprobar si el usuario esta arrastrando el raton o simplemente lo está moviendo. La información
 * aparezca por consola.
 */
public class NovenaPracticaPropuesta {
    public static void main(String[] args) {
        VentanaEventosRaton miVentana = new VentanaEventosRaton();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }
}

class VentanaEventosRaton extends JFrame implements MouseListener {
    private static final long serialVersionUID = 1L;

    public VentanaEventosRaton() {
        setTitle("Novena");
        setBounds(200, 200, 400, 400);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Arrastrando");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Moviendo");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
