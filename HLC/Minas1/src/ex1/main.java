package ex1;

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

    public static void mostrar() {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
