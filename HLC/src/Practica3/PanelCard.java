package Practica3;

import javax.swing.*;

public class PanelCard extends JPanel {
    JButton buttonEjemplo;

    public PanelCard(String nombre) {
        buttonEjemplo = new JButton(nombre);
        add(buttonEjemplo);
    }
}
