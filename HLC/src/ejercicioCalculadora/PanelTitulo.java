package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class PanelTitulo extends JPanel {
    JLabel labelTitulo;

    public PanelTitulo() {
        labelTitulo = new JLabel("Calculadora");
        labelTitulo.setFont(new Font("Tahoma", 0, 36));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(labelTitulo);
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }
}
