package Layout;

import javax.swing.*;
import java.awt.*;

public class SimpleBorderLayout {
    public static void main(String[] args) {
        MarcoBorderLayout marco = new MarcoBorderLayout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoBorderLayout extends JFrame {
    public MarcoBorderLayout() {
        setTitle("Simple BorderLayout");
        setBounds(600, 350, 400, 100);
        PanelBorderLayout lamina = new PanelBorderLayout();
        add(lamina);
    }
}

class PanelBorderLayout extends JPanel {
    public PanelBorderLayout() {
        setLayout(new BorderLayout());
        add(new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
        add(new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
        add(new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
        add(new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
        add(new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
    }
}
