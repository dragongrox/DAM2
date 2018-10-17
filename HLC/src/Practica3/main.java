package Practica3;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class main {
    public static void mostrar() {
        Frame v = new Frame();
        v.setTitle("Prueba Paneles");
        v.setBounds(250, 250, 600, 600);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });

    }
}
