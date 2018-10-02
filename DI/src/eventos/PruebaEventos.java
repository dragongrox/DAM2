package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Frame extends JFrame {
    Panel panel;

    public Frame() {
        setTitle("El oyente es: Un objeto de una clase que lo implemente");
        setBounds(200, 200, 400, 400);
        panel = new Panel();
        add(panel);
    }
}

class Panel extends JPanel {
    JButton buttonAzul, buttonAmarillo, buttonRojo;

    public Panel() {
        buttonAzul = new JButton("Azul");
        buttonAmarillo = new JButton("Amarillo");
        buttonRojo = new JButton("Rojo");
        buttonRojo.setBackground(Color.RED);
        buttonAmarillo.setBackground(Color.YELLOW);
        buttonAzul.setBackground(Color.BLUE);
        add(buttonAzul);
        add(buttonAmarillo);
        add(buttonRojo);
        //2º Instanciamos un objeto de la clase oyente

        //3º ponemos a la escucha el objeto fuente atravez del metodo addActionListener
        buttonAzul.addActionListener(new ColorFondo(buttonAzul.getBackground()));
        buttonRojo.addActionListener(new ColorFondo(buttonRojo.getBackground()));
        buttonAmarillo.addActionListener(new ColorFondo(buttonAmarillo.getBackground()));
    }

    // 1º definimos la clase oyente
    // la definimos como clase interna para poder utilizar el metodo setBackground
    private class ColorFondo implements ActionListener {
        private Color colorFondo;

        public ColorFondo(Color color) {
            colorFondo = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorFondo);
        }
    }
}
