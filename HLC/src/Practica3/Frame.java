package Practica3;

import javax.swing.*;

public class Frame extends JFrame {
    PanelPrincipal panelPrincipal;

    public Frame() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        panelPrincipal = new PanelPrincipal();
        add(panelPrincipal);
    }

}
