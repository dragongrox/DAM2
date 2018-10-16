package Layout.Ejercicios.PruebaLayouts1;

import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    private static final long serialVersionUID = 1L;

    JButton btnAmarillo, btnRojo;

    public PanelSuperior(Ventana v) {
        iniciaComponentes(v);
    }

    public void iniciaComponentes(Ventana v) {
        btnAmarillo = new JButton("Amarillo");
        btnRojo = new JButton("Rojo");

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

        add(btnAmarillo);
        add(btnRojo);

    }

    public JButton getBtnAmarillo() {
        return btnAmarillo;
    }

    public JButton getBtnRojo() {
        return btnRojo;
    }


}
