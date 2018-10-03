package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambioDeestadoVentana {
    public static void main(String[] args) {
        FrameEstado frame = new FrameEstado();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FrameEstado extends JFrame {

    public FrameEstado() {
        setTitle("Ventana Respondiendo cambio de estado");
        setBounds(200, 200, 400, 400);
        addWindowStateListener(new OyenteEstado());
    }


}

class OyenteEstado implements WindowStateListener {
    @Override
    public void windowStateChanged(WindowEvent arg0) {
        System.out.println("La ventana ha acambiado de estado");
        int valor = arg0.getOldState();
        System.out.println("El estado era: " + valor);
    }
}