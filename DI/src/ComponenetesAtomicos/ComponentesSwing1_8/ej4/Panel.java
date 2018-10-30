package ComponenetesAtomicos.ComponentesSwing1_8.ej4;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JLabel label;
    JSlider slider;

    public Panel() {
        label = new JLabel("En un lugar de la mancha...");
        slider = new JSlider(JSlider.HORIZONTAL, 0, 48, 28);
        slider.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setValue(0);

        this.setLayout(null);
        add(label, BorderLayout.PAGE_START);
        add(slider);


        label.setSize(600, 40);
        slider.setSize(100, 100);


        label.setLocation(0, 150);
        slider.setLocation(200, 30);
    }
}
