package ejercicioCalculadora;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });
    }

    private static void mostrar() {
        VentanaCalculadora ventanaCalculadora = new VentanaCalculadora();
        ventanaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaCalculadora.setTitle("Calculadora");
        ventanaCalculadora.setVisible(true);
    }
}
