package Layout.Ejercicios.CalculadoraSergeyShevchenko;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Empieza por crear la interfaz con su distribución correspondiente de botones y depués le das la
 * funcionalidad que debe tener una calculadora simple
 */
public class main {
    public static void mostrar() {
        Frame v = new Frame();
        v.setTitle("Prueba Calculadora");
        v.setBounds(250, 250, 500, 300);
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
