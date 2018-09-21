package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class PanelTitulo extends JPanel {
    private JLabel lbTitulo;

    public PanelTitulo() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        lbTitulo = new JLabel("### EJEMPLOS CON PANELES ###");
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        this.setLayout(flowLayout);
        this.add(lbTitulo);
    }


}
