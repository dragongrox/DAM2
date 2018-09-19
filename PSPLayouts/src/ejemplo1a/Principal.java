package ejemplo1a;

import javax.swing.*;
import static javax.swing.SwingUtilities.invokeLater;

public class Principal {

    public static void mostrar(){
        Ventana ventana=new Ventana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Layout");
        ventana.setVisible(true);
        ventana.pack();
    }

    public static void main(String[] args) {
        invokeLater(new Runnable(){
            @Override
            public void run(){
                mostrar();
            }
        });
    }
}
