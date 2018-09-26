package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class PanelCentral extends JPanel {
    JTextField textField1, textField2;
    JButton buttonSuma;

    public JButton getButtonSuma() {
        return buttonSuma;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public PanelCentral() {
        textField1 = new JTextField("");
        textField2 = new JTextField("");
        textField1.setPreferredSize(new Dimension(100, 60));
        textField2.setPreferredSize(new Dimension(100, 60));
        buttonSuma = new JButton("+");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(textField1);
        this.add(buttonSuma);
        this.add(textField2);
    }
}
