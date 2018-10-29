package Minas1.src;

import javax.swing.*;

public class PanelBotones extends JPanel {
    JButton buttonStart, buttonPause, buttonExit;

    public PanelBotones() {
        buttonStart = new JButton("Start");
        buttonPause = new JButton("Pause");
        buttonExit = new JButton("Exit");
    }

    public JButton getButtonStart() {
        return buttonStart;
    }

    public void setButtonStart(JButton buttonStart) {
        this.buttonStart = buttonStart;
    }

    public JButton getButtonPause() {
        return buttonPause;
    }

    public void setButtonPause(JButton buttonPause) {
        this.buttonPause = buttonPause;
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }
}
