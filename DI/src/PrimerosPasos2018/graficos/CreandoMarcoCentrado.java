package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        MarcoCentrado marcoCentrado = new MarcoCentrado();
        marcoCentrado.setVisible(true);
        marcoCentrado.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marcoCentrado.setTitle("Marco centrado en nuestra pantalla");
    }
}

class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = new Dimension();
        tamanioPantalla = miPantalla.getScreenSize();
        setSize(tamanioPantalla.width / 2, tamanioPantalla.height / 2);
        setLocation(tamanioPantalla.width / 4, tamanioPantalla.height / 4);
        Image miIcono = miPantalla.getImage("src\\Martz90-Circle-Calculator.ico");
        setIconImage(miIcono);
    }
}