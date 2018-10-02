package practicasPropuestas.Sexta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una ventana, en la que se muestre un botón con el título “Saludo”
 * y otro con el título “Despedida”, al pulsar el botón “Saludo” aparezca
 * un mensaje(JOptionPane.showMessageDialog) que diga “HOLA” y al pulsar
 * el botón “Despedida” ”aparezca un mensaje(JOptionPane.showMessageDialog)
 * que diga “ADIOS”
 */
public class SextaPracticaPropuesta {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Frame extends JFrame {
    Panel panel;

    public Frame() {
        setTitle("Ejecicio 6");
        setBounds(200, 200, 400, 400);
        panel = new Panel();
        add(panel);
    }
}

class Panel extends JPanel {
    JButton buttonSaludo, buttonDespedida;

    public Panel() {
        buttonSaludo = new JButton("Saludo");
        buttonDespedida = new JButton("Despedida");
        add(buttonSaludo);
        add(buttonDespedida);
    }

    private class ColorFondo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonSaludo) {
                JOptionPane.showMessageDialog(null, "HOLA");
            } else if (e.getSource() == buttonDespedida) {
                JOptionPane.showMessageDialog(null, "ADIOS");
            }
        }
    }
}