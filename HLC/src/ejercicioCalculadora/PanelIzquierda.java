package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class PanelIzquierda extends JPanel {
    JButton buttonReset;

    public void setButtonReset(JButton buttonReset) {
        this.buttonReset = buttonReset;
    }

    public PanelIzquierda() {
        buttonReset = new JButton("Reset");
        buttonReset.setPreferredSize(new Dimension(150, 60));
        buttonReset.setFont(new Font("Tahoma", 0, 20));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(buttonReset);
    }
}
