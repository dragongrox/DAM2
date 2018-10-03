import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class main {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });
    }

    private static void mostrar() {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculadora");
        frame.setVisible(true);
        frame.pack();
    }
}
