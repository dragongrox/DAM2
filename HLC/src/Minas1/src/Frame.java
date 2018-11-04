package Minas1.src;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    PanelTablero panelTablero;
    PanelMenu panelMenu;
    HiloCronometro hiloCronometro;
    boolean pausado = false;

    public Frame() {
        panelMenu = new PanelMenu();
        hiloCronometro = new HiloCronometro(panelMenu.labelReloj);
        panelTablero = new PanelTablero(10, 10, panelMenu, hiloCronometro);

        JPanel panelMargenes = new JPanel();
        panelMargenes.add(panelMenu, BorderLayout.CENTER);
        panelMargenes.add(Box.createHorizontalStrut(10), BorderLayout.EAST);
        panelMargenes.add(Box.createHorizontalStrut(10), BorderLayout.WEST);
        panelMargenes.add(Box.createVerticalStrut(10), BorderLayout.NORTH);
        panelMargenes.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(panelTablero, BorderLayout.CENTER);
        add(panelMargenes, BorderLayout.EAST);
        pack();
        this.setSize(600, this.getHeight());

        panelMenu.buttonStart.addActionListener(e -> Iniciar());
        panelMenu.buttonExit.addActionListener(e -> Salir());
        panelMenu.buttonPause.addActionListener(e -> Pausar());

        hiloCronometro.start();
        hiloCronometro.suspend();
    }

    private void Pausar() {
        if (!pausado) {
            hiloCronometro.suspend();
            pausado = true;
            panelTablero.setVisible(false);
            panelMenu.buttonStart.setEnabled(false);
        } else {
            hiloCronometro.resume();
            pausado = false;
            panelTablero.setVisible(true);
            panelMenu.buttonStart.setEnabled(true);
        }

    }

    private void Salir() {
        System.exit(0);
    }

    private void Iniciar() {
        panelTablero.iniciar(10, 10);
        panelMenu.labelReloj.setText("00:00");
        hiloCronometro.resume();
    }
}
