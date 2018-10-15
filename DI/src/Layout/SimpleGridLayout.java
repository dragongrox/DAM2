package Layout;

import javax.swing.*;
import java.awt.*;

public class SimpleGridLayout {
    public static void main(String[] args) {
        MarcoGridLayout marco = new MarcoGridLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoGridLayout extends JFrame {
    public MarcoGridLayout() {
        setTitle("Simple GridLayout");
        setBounds(600, 350, 300, 200);
        PanelGridLayout lamina = new PanelGridLayout();
        add(lamina);
    }
}

class PanelGridLayout extends JPanel {
    public PanelGridLayout() {
        setLayout(new GridLayout(3, 2, 15, 15));
        add(new JLabel("Primera"));
        add(new JLabel("Segunda"));
        add(new JLabel("Tercera"));
        add(new JLabel("Cuarta"));
        add(new JLabel("Quinta"));
        add(new JLabel("Sexta"));
    }
}
