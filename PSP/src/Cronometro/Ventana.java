package Cronometro;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    PanelContador panelContador1, panelContador2, panelContador3;

    public Ventana() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        panelContador1 = new PanelContador();
        panelContador2 = new PanelContador();
        panelContador3 = new PanelContador();

        Container lienzo = this.getContentPane();
        GridLayout bl = new GridLayout();
        lienzo.setLayout(bl);
        lienzo.add(panelContador1);
        lienzo.add(panelContador2);
        lienzo.add(panelContador3);
        lienzo.add(Box.createRigidArea(new Dimension(0, 50)));
        pack();


    }

}
