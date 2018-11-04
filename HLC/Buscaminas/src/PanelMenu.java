import javax.swing.*;
import java.awt.*;


public class PanelMenu extends JPanel {
    JLabel labelBanderas, labelReloj;
    JButton buttonStart, buttonPause, buttonExit;

    public PanelMenu() {
        JLabel labelBanderaIcon = new JLabel(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\Buscaminas\\src\\img\\bandera.jpg"));
        labelBanderas = new JLabel("0/10");
        JLabel labelTiempoIcon = new JLabel(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\Buscaminas\\src\\img\\reloj1.jpg"));
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

    public JLabel getLabelBanderas() {
        return labelBanderas;
    }

    public void setLabelBanderas(JLabel labelBanderas) {
        this.labelBanderas = labelBanderas;
    }

    public JLabel getLabelReloj() {
        return labelReloj;
    }

    public void setLabelReloj(JLabel labelReloj) {
        this.labelReloj = labelReloj;
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
