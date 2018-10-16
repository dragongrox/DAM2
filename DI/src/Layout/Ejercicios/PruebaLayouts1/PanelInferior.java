package Layout.Ejercicios.PruebaLayouts1;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JButton btnAzul, btnNegro, btnVerde;

    public PanelInferior(Ventana v) {
        iniciaComponentes(v);
    }

    public void iniciaComponentes(Ventana v) {
        btnAzul = new JButton("Azul");
        btnNegro = new JButton("Negro");
        btnVerde = new JButton("Verde");

        setLayout(new BorderLayout());

        add(btnAzul, BorderLayout.LINE_START);
        add(btnNegro, BorderLayout.CENTER);
        add(btnVerde, BorderLayout.LINE_END);

    }

    public JButton getBtnAzul() {
        return btnAzul;
    }

    public JButton getBtnNegro() {
        return btnNegro;
    }

    public JButton getBtnVerde() {
        return btnVerde;
    }


}

