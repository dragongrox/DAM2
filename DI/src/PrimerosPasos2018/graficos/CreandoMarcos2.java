package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos2 {
    public static void main(String[] args) {
        MiMarco2 miMarco2 = new MiMarco2();
    }
}

class MiMarco2 extends JFrame {
    //creamos el constructor
    public MiMarco2() {
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50, 200, 500, 100);
        setTitle("Mi primera Frame");
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setResizable(false);
    }
}