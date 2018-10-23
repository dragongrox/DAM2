package Taller1SpringLayout;

import javax.swing.*;

public class PanelPrincipal extends JPanel {
    JLabel label;
    JTextField textField;

    public PanelPrincipal() {
        label = new JLabel("Ejemplo: ");
        textField = new JTextField("Mas Ejemplos", 15);
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        add(label);
        add(textField);
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.EAST, textField, 15, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, this);

    }

}

