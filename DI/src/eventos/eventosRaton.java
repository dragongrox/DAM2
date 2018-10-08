package eventos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class eventosRaton {

    public static void main(String[] args) {
        VentanaEventosFoco miVentana = new VentanaEventosFoco();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }

}

class VentanaEventosRaton extends JFrame implements MouseListener {
    private static final long serialVersionUID = 1L;

    public VentanaEventosRaton() {
        setTitle("Eventos Teclado");
        setBounds(200, 200, 400, 400);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hemos hecho clic");
        System.out.println("Cordenada x: " + e.getX() + " y: " + e.getY());
        System.out.println("Numero de clics: " + e.getClickCount());
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
