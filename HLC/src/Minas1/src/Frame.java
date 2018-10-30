package Minas1.src;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    PanelTablero panelTablero;
    PanelMenu panelMenu;

    public Frame() {
        panelTablero = new PanelTablero(10, 10);
        panelMenu = new PanelMenu();

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

    }

}
