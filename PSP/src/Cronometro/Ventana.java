package Cronometro;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    PanelContador panelContador1;

    public Ventana() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        panelContador1 = new PanelContador();

        Container lienzo = this.getContentPane();
        GridLayout bl = new GridLayout();
        lienzo.setLayout(bl);
        lienzo.add(panelContador1);
        lienzo.add(Box.createRigidArea(new Dimension(0, 50)));
        pack();


    }

}
