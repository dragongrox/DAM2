package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Frame2 extends JFrame {
    Panel2 panel;

    public Frame2() {
        setTitle("El oyente es: Un objeto de una clase que lo implemente");
        setBounds(200, 200, 400, 400);
        panel = new Panel2();
        add(panel);
    }
}

//º1 El oyente implementa la interfaz Actionlistener
class Panel2 extends JPanel implements ActionListener {
    JButton buttonAzul, buttonAmarillo, buttonRojo;

    public Panel2() {
        buttonAzul = new JButton("Azul");
        buttonAmarillo = new JButton("Amarillo");
        buttonRojo = new JButton("Rojo");
        buttonRojo.setBackground(Color.RED);
        buttonAmarillo.setBackground(Color.YELLOW);
        buttonAzul.setBackground(Color.BLUE);
        add(buttonAzul);
        add(buttonAmarillo);
        add(buttonRojo);
        buttonAzul.addActionListener(this);
        buttonRojo.addActionListener(this);
        buttonAmarillo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botonPulsado = (JButton) (e.getSource());
        setBackground(botonPulsado.getBackground());
    }
}
