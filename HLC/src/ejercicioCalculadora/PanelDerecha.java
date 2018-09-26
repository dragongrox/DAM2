package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class PanelDerecha extends JPanel {
    JButton buttonCalcular;

    public JButton getButtonCalcular() {
        return buttonCalcular;
    }

    public PanelDerecha() {
        buttonCalcular = new JButton("Calcular");
        buttonCalcular.setPreferredSize(new Dimension(150, 60));
        buttonCalcular.setFont(new Font("Tahoma", 0, 20));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(buttonCalcular);
    }
}
