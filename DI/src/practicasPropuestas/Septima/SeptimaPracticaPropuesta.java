package practicasPropuestas.Septima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 * Crea dos ventanas, las cuales les vaya cambiando el color de fondo según la ventana esté activada o
 * desactivada.
 */
public class SeptimaPracticaPropuesta {
    public static void main(String[] args) {
        Frame frame1 = new Frame(200, 200);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame frame2 = new Frame(600, 200);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Frame extends JFrame implements WindowListener {
    Panel panel;

    public Frame(int x, int y) {
        setTitle("Frame Respondiendo cambio de estado");
        setBounds(x, y, 400, 400);
        panel = new Panel();
        add(panel);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println(1);
        panel.cambiarColor(Color.WHITE);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println(2);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println(3);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println(4);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println(5);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println(6);
        panel.cambiarColor(Color.WHITE);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println(7);
        panel.cambiarColor(Color.DARK_GRAY);
    }
}

class Panel extends JPanel {
    Color color;

    public Panel() {
        this.color = color;
    }

    public void cambiarColor(Color color) {
        setBackground(color);
    }
}
