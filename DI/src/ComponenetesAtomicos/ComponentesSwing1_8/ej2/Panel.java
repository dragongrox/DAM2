package ComponenetesAtomicos.ComponentesSwing1_8.ej2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JLabel label;
    JRadioButton radioButtonPequeno, radioButtonMediano, radioButtonGrande, radioButtonMuyGrande;

    public Panel() {
        label = new JLabel("En un lugar de la mancha el cual no...");
        radioButtonMediano = new JRadioButton("Mediano");
        radioButtonPequeno = new JRadioButton("Pequeño");
        radioButtonGrande = new JRadioButton("Grande");
        radioButtonMuyGrande = new JRadioButton("Muy Grande");
        ButtonGroup radioButtonMenuItem = new ButtonGroup();
        radioButtonMenuItem.add(radioButtonPequeno);
        radioButtonMenuItem.add(radioButtonMediano);
        radioButtonMenuItem.add(radioButtonGrande);
        radioButtonMenuItem.add(radioButtonMuyGrande);


        this.setLayout(null);
        add(label, BorderLayout.PAGE_START);
        add(radioButtonPequeno);
        add(radioButtonMediano);
        add(radioButtonGrande);
        add(radioButtonMuyGrande);

        label.setSize(600, 40);
        radioButtonPequeno.setSize(100, 20);
        radioButtonMediano.setSize(100, 20);
        radioButtonGrande.setSize(100, 20);
        radioButtonMuyGrande.setSize(100, 20);

        label.setLocation(0, 150);
        radioButtonPequeno.setLocation(100, 330);
        radioButtonMediano.setLocation(200, 330);
        radioButtonGrande.setLocation(300, 330);
        radioButtonMuyGrande.setLocation(400, 330);

        radioButtonPequeno.addActionListener(e -> Accion());
        radioButtonMediano.addActionListener(e -> Accion());
        radioButtonGrande.addActionListener(e -> Accion());
        radioButtonMuyGrande.addActionListener(e -> Accion());

    }

    private void Accion() {

        if (radioButtonPequeno.isSelected()) {
            label.setFont(new Font("Arial", Font.PLAIN, 7));

        } else if (radioButtonMediano.isSelected()) {
            label.setFont(new Font("Arial", Font.PLAIN, 12));

        } else if (radioButtonGrande.isSelected()) {
            label.setFont(new Font("Arial", Font.PLAIN, 20));

        } else if (radioButtonMuyGrande.isSelected()) {
            label.setFont(new Font("Arial", Font.PLAIN, 40));

        }


    }


}
