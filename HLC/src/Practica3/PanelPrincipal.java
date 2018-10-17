package Practica3;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    Panel cards;
    String panel1 = "panel1", panel2 = "panel2", panel3 = "panel3", panel4 = "panel4";
    private boolean inAnApplet = true;


    public PanelPrincipal() {
        setLayout(new BorderLayout());
        setFont(new Font("Helvetica", Font.PLAIN, 14));

        Panel panel = new Panel();
        Choice choice = new Choice();
        choice.addItem(panel1);
        choice.addItem(panel2);
        choice.addItem(panel3);
        choice.addItem(panel4);
        panel.add(choice);
        add("North", panel);

        cards = new Panel();
        cards.setLayout(new CardLayout());

        PanelCard panelCard1 = new PanelCard("Panel1");
        PanelCard panelCard2 = new PanelCard("Panel2");
        PanelCard panelCard3 = new PanelCard("Panel3");
        PanelCard panelCard4 = new PanelCard("Panel4");

        cards.add(panel1, panelCard1);
        cards.add(panel2, panelCard2);
        cards.add(panel3, panelCard3);
        cards.add(panel4, panelCard4);
        add("Center", cards);
    }

    public boolean action(Event evt, Object arg) {
        if (evt.target instanceof Choice) {
            ((CardLayout) cards.getLayout()).show(cards, (String) arg);
            return true;
        }
        return false;
    }
}

