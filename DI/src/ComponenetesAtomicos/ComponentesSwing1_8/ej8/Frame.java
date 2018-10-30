package ComponenetesAtomicos.ComponentesSwing1_8.ej8;

import javax.swing.*;

public class Frame extends JFrame {
    Panel panel;

    public Frame() {
        panel = new Panel();
        setBounds(0, 0, 515, 237);
        add(panel);

    }
}
