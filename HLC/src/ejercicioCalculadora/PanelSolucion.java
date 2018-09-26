package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class PanelSolucion extends JPanel {
    JTextField textFieldSolucion;
    JButton buttonSalir;
    JLabel labelTexto;

    public PanelSolucion() {
        textFieldSolucion = new JTextField();
        textFieldSolucion.setPreferredSize(new Dimension(200, 60));
        buttonSalir = new JButton("Salir");
        buttonSalir.setPreferredSize(new Dimension(150, 60));
        buttonSalir.setFont(new Font("Tahoma", 0, 20));
        labelTexto = new JLabel("La solucion es:");
        labelTexto.setFont(new Font("Tahoma", 0, 15));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(labelTexto);
        this.add(textFieldSolucion);
        this.add(buttonSalir);
        buttonSalir.addActionListener(e -> Salir());
    }

    private void Salir() {
        System.exit(0);
    }

    public JTextField getTextFieldSolucion() {
        return textFieldSolucion;
    }

    public JButton getButtonSalir() {
        return buttonSalir;
    }
}
