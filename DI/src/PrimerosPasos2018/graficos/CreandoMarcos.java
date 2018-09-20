package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {

    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
        marco1.setSize(400, 200);                              //Tamaño de la ventana
        marco1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     //Accion realizada al cerrar la ventana
        marco1.setBounds(50, 200, 500, 100);
        marco1.setTitle("Mi primera Ventana");
        marco1.setExtendedState(Frame.MAXIMIZED_BOTH);                      //Ventana maximizada por defecto
        marco1.setResizable(false);                                         //Deshabilitar maximizar ventana
    }
}

class MiMarco extends JFrame {
    //creamos el constructor
    public MiMarco() {
        setLocation(50, 300);
    }
}