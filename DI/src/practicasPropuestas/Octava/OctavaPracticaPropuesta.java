package practicasPropuestas.Octava;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Dentro del paquete de practicasPropuestas.Octava.java
 * Comprobar si el usuario ha
 * hecho un click con el boton izquierdo
 * ó con el derecho. La información aparezca por consola.
 */

public class OctavaPracticaPropuesta {
    public static void main(String[] args) {
        VentanaEventosRaton miVentana = new VentanaEventosRaton();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }
}

class VentanaEventosRaton extends JFrame implements MouseListener {
    private static final long serialVersionUID = 1L;

    public VentanaEventosRaton() {
        setTitle("Octava");
        setBounds(200, 200, 400, 400);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            System.out.println("Boton Izquierdo");
        }
        if (e.getButton() == 3) {
            System.out.println("Boton Derecho");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
