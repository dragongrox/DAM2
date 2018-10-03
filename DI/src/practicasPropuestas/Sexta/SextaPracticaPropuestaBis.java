package practicasPropuestas.Sexta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Realiza una modificación de la aplicación anterior
 * de tal forma que los textos de “Hola” y “Adiós” se
 * muestren en la propia ventana
 */
public class SextaPracticaPropuestaBis {
    public static void main(String[] args) {
        FrameBis frame = new FrameBis();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class FrameBis extends JFrame {
    PanelBis panel;

    public FrameBis() {
        setTitle("Ejecicio 6");
        setBounds(200, 200, 400, 400);
        panel = new PanelBis();
        add(panel);
    }
}

class PanelBis extends JPanel {
    JButton buttonSaludo, buttonDespedida;
    JLabel label;

    public PanelBis() {
        buttonSaludo = new JButton("Saludo");
        buttonDespedida = new JButton("Despedida");
        label = new JLabel("");
        add(buttonSaludo);
        add(buttonDespedida);
        add(label, FlowLayout.CENTER);
        buttonSaludo.addActionListener(new Listener());
        buttonDespedida.addActionListener(new Listener());
    }

    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonSaludo) {
                label.setText("Hola");
            } else if (e.getSource() == buttonDespedida) {
                label.setText("Adios");
            }
        }
    }
}