package practicasPropuestas;

import javax.swing.*;
import java.awt.*;

/**
 * Crea una ventana, en la cual aparece el texto "Cabecera" en la parte superior centrada y el texto "Pie" en la parte inferior derecha
 */

public class TerceraPracticaPropuesta {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 300, 500, 300);
        frame.add(new panel());

    }
}

class panel extends JPanel {
    public panel() {
        setSize(500, 300);
        JTextField cabecera = new JTextField("Cabecera");
        add(cabecera, BorderLayout.NORTH);
        JTextField pie = new JTextField("Pie");
        add(pie, BorderLayout.SOUTH);
    }
}
