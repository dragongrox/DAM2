package Ejemplos;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Principal {
    public static void mostrar() {
        Ventana5 ventana = new Ventana5();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("prueba");
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
