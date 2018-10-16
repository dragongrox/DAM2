package Layout.Ejercicios.PruebaLayouts1;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Principal {

    public static void mostrar() {
        Ventana v = new Ventana();
        v.setTitle("Prueba Layouts");
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
