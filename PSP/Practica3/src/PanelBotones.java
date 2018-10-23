import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {

    JButton buttonComenzar, buttonSalir;

    public PanelBotones() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        buttonComenzar = new JButton("Comenzar");
        buttonSalir = new JButton("Salir");

        buttonComenzar.setPreferredSize(new Dimension(100, 20));
        buttonSalir.setPreferredSize(new Dimension(100, 20));

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        add(Box.createRigidArea(new Dimension(100, 100)));
        add(buttonComenzar);
        add(buttonSalir);

        buttonSalir.addActionListener(e -> salir());

    }

    protected void salir() {
        System.exit(0);
    }

    public JButton getButtonComenzar() {
        return buttonComenzar;
    }

}
