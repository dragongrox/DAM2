package ComponenetesAtomicos.ComponentesSwing1_8.ej2;

import javax.swing.*;

public class Frame extends JFrame {
    Panel panel;

    public Frame() {
        panel = new Panel();
        setBounds(500, 500, 550, 400);
        add(panel);

    }
}
