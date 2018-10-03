import javax.swing.*;

public class PanelCentral extends JPanel {
    JLabel labelSaludo;
    JButton buttonSaludo;

    public PanelCentral() {
        labelSaludo = new JLabel("Bienvenido, pulsa aqui para saludar");
        buttonSaludo = new JButton("Saludar");
        add(labelSaludo);
        add(buttonSaludo);
        buttonSaludo.addActionListener(e -> Saludar());
    }

    private void Saludar() {
        JOptionPane.showMessageDialog(null, "Hola");
    }
}
