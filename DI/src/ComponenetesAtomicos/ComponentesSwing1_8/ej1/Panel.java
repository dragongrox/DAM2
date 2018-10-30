package ComponenetesAtomicos.ComponentesSwing1_8.ej1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JLabel label;
    JCheckBox checkBoxNegrita, checkBoxCursiva;

    public Panel() {
        label = new JLabel("En un lugar de la manche el cual no...");
        checkBoxCursiva = new JCheckBox("Accion");
        checkBoxNegrita = new JCheckBox("Negrita");

        this.setLayout(null);
        add(label, BorderLayout.PAGE_START);
        add(checkBoxNegrita);
        add(checkBoxCursiva);

        label.setSize(400, 40);
        checkBoxNegrita.setSize(100, 20);
        checkBoxCursiva.setSize(100, 20);

        label.setLocation(150, 0);
        checkBoxNegrita.setLocation(200, 330);
        checkBoxCursiva.setLocation(300, 330);

        checkBoxNegrita.addActionListener(e -> Accion());
        checkBoxCursiva.addActionListener(e -> Accion());

    }

    private void Accion() {
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        if (checkBoxCursiva.isSelected() && checkBoxNegrita.isSelected()) {
            label.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 14));
        } else if (checkBoxCursiva.isSelected() && !checkBoxNegrita.isSelected()) {
            label.setFont(new Font("Arial", Font.ITALIC, 14));
        } else if (!checkBoxCursiva.isSelected() && checkBoxNegrita.isSelected()) {
            label.setFont(new Font("Arial", Font.BOLD, 14));
        }
    }


}
