package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
    private JButton btnSalir;
    private JButton btnSaludo;

    public PanelBotones() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        btnSalir = new JButton("SALIR");
        btnSaludo = new JButton("SALUDO");
        btnSalir.setForeground(Color.red);
        btnSaludo.setBackground(Color.GREEN);
        btnSaludo.setPreferredSize(new Dimension(100, 60));
        btnSalir.setPreferredSize(new Dimension(100, 60));
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);

        //le asignamos el layout a nuestro panel
        this.setLayout(flowLayout);
        this.add(btnSaludo);
        this.add(Box.createGlue());                             //separador flexible
        //this.add(Box.createRigidArea(new Dimension(10,0)));   //separador de un tamaño especifico
        this.add(btnSalir);
        btnSalir.addActionListener(e -> salir());


    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnSaludo() {
        return btnSaludo;
    }

    public void salir() {
        System.exit(0);
    }
}
