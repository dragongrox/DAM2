package eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventosVentana3 {
    public static void main(String[] args) {
        FrameEventos3 frame = new FrameEventos3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FrameEventos3 extends JFrame {

    public FrameEventos3() {
        setTitle("Frame Respondiendo conclase adaptadora");
        setBounds(200, 200, 400, 400);
        addWindowListener(new Oyente());
    }


}

class Oyente extends WindowAdapter {
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Frame cerranda");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Frame minimizada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Frame activada");
    }
}