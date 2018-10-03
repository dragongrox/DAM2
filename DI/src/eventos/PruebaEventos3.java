package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos3 {
    public static void main(String[] args) {
        Frame3 frame = new Frame3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Frame3 extends JFrame {
    Panel3 panel;

    public Frame3() {
        setTitle("El oyente es: una clase anonima que implementa la interfaz de escucha");
        setBounds(200, 200, 400, 400);
        panel = new Panel3();
        add(panel);
    }
}

//º1 El oyente implementa la interfaz Actionlistener
class Panel3 extends JPanel {
    JButton buttonAzul, buttonAmarillo, buttonRojo;

    public Panel3() {
        buttonAzul = new JButton("Azul");
        buttonAmarillo = new JButton("Amarillo");
        buttonRojo = new JButton("Rojo");
        add(buttonAzul);
        add(buttonAmarillo);
        add(buttonRojo);
        buttonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE);
            }
        });
        buttonAmarillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.YELLOW);
            }
        });
        buttonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        });
    }
}
