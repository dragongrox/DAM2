package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class eventosVentanaMain {

    public static void main(String[] args) {
        VentanaEventos miVentana = new VentanaEventos();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }

}

class VentanaEventos extends JFrame implements WindowListener {
    private static final long serialVersionUID = 1L;

    public VentanaEventos() {
        setTitle("");
        setBounds(200, 200, 400, 400);
        addWindowListener(this);
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        System.out.println("Ventana activada");

    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        System.out.println("Ventana cerrada");

    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        System.out.println("Ventana cerrandose");

    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        System.out.println("Ventana desactivada");

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        System.out.println("Ventana restaurada");

    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        System.out.println("Ventana minimizada");

    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        System.out.println("Ventana abierta");

    }
}
