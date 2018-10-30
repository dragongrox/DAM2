package Minas1.src;

import javax.swing.*;
import java.awt.*;


public class PanelMenu extends JPanel {
    JLabel labelBanderas, labelReloj;
    JButton buttonStart, buttonPause, buttonExit;
    public PanelMenu() {
        JLabel labelBanderaIcon = new JLabel(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\src\\Minas1\\src\\img\\bandera.jpg"));
        labelBanderas = new JLabel("0/10");
        JLabel labelTiempoIcon = new JLabel(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\src\\Minas1\\src\\img\\reloj1.jpg"));
        labelReloj = new JLabel("00:00");
        buttonStart = new JButton("START");
        buttonPause = new JButton("PAUSE");
        buttonExit = new JButton("EXIT");

        setLayout(new GridLayout(9, 1));
        add(labelBanderaIcon);
        add(labelBanderas, CENTER_ALIGNMENT);
        add(labelTiempoIcon);
        add(labelReloj, CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(Box.createVerticalStrut(10));
        add(buttonStart);
        add(buttonPause);
        add(buttonExit);


    }
}
