package Cronometro;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {

    JButton btnComenzar, btnPausar, btnContinuar, btnSalir;

    public PanelBotones() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        btnComenzar = new JButton("Comenzar");
        btnPausar = new JButton("Pausar");
        btnContinuar = new JButton("Continuar");
        btnSalir = new JButton("Salir");


        btnPausar.setEnabled(false);
        btnContinuar.setEnabled(false);


        btnComenzar.setPreferredSize(new Dimension(100, 20));
        btnPausar.setPreferredSize(new Dimension(100, 20));
        btnContinuar.setPreferredSize(new Dimension(100, 20));
        btnSalir.setPreferredSize(new Dimension(100, 20));


        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));


        add(btnComenzar);
        add(btnPausar);
        add(btnContinuar);
        add(btnSalir);


        btnSalir.addActionListener(e -> salir());

    }

    protected void salir() {
        System.exit(0);
    }

    public JButton getBtnComenzar() {
        return btnComenzar;
    }

    public JButton getBtnPausar() {
        return btnPausar;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }


}
