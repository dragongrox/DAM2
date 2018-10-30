package ComponenetesAtomicos.ComponentesSwing1_8.ej3;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JLabel label;
    JComboBox comboBox;

    public Panel() {
        label = new JLabel("En un lugar de la mancha...");
        comboBox = new JComboBox();
        comboBox.addItem("Serif");
        comboBox.addItem("SansSerif");
        comboBox.addItem("Monospaced");
        comboBox.addItem("Dialog");


        this.setLayout(null);
        add(label, BorderLayout.PAGE_START);
        add(comboBox);


        label.setSize(600, 40);
        comboBox.setSize(100, 20);


        label.setLocation(0, 150);
        comboBox.setLocation(200, 0);


    }
}
