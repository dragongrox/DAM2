import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Principal {

    public static void mostrar() {
        Ventana cronometro = new Ventana();
        cronometro.setTitle("Cronometro");
        cronometro.setBounds(250, 250, 500, 500);
        cronometro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cronometro.setVisible(true);
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
