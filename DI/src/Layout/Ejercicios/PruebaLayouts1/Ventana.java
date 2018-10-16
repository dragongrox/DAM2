package Layout.Ejercicios.PruebaLayouts1;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;

    PanelSuperior ps;
    PanelInferior pinf;
    JButton amarillo, rojo, azul, negro, verde;

    public Ventana() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        ps = new PanelSuperior(this);
        pinf = new PanelInferior(this);
        amarillo = ps.getBtnAmarillo();
        rojo = ps.getBtnRojo();
        azul = pinf.getBtnAzul();
        negro = pinf.getBtnNegro();
        verde = pinf.getBtnVerde();

        BorderLayout bl = new BorderLayout();
        setLayout(bl);

        add(ps, BorderLayout.PAGE_START);
        add(pinf, BorderLayout.PAGE_END);

        pack();
    }

    public void cambiarFondo(Color c) {
        setBackground(c);
    }

}
