package eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class eventosTeclado {

    public static void main(String[] args) {
        VentanaEventosTeclado miVentana = new VentanaEventosTeclado();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }

}

class VentanaEventosTeclado extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;

    public VentanaEventosTeclado() {
        setTitle("Eventos Teclado");
        setBounds(200, 200, 400, 400);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int codigo = e.getKeyCode();
        char letra = e.getKeyChar();
        System.out.println("Codigo " + codigo + ", letra " + letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
