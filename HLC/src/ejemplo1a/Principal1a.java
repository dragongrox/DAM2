package ejemplo1a;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Principal1a {
    public static void mostrar() {
        Ventana1a miVentana = new Ventana1a();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setTitle("Ejemplo Varios Paneles");
        miVentana.setVisible(true);
        miVentana.setResizable(false);
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
