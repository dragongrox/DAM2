package ComponenetesAtomicos.ComponentesSwing1_8.ej6;

import javax.swing.*;

public class Frame extends JFrame {
    Panel panel;

    public Frame() {
        panel = new Panel();
        setBounds(0, 0, 600, 500);
        add(panel);

    }
}
