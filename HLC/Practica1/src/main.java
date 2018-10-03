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
        FramePractica framePractica = new FramePractica();
        framePractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePractica.setTitle("Calculadora");
        framePractica.setVisible(true);
        framePractica.pack();
    }
}
