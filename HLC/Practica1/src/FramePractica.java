import javax.swing.*;
import java.awt.*;

public class FramePractica extends JFrame {
    PanelSuperior panelSuperior;
    PanelCentral panelCentral;
    PanelInferior panelInferior;

    public FramePractica() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        panelSuperior = new PanelSuperior();
        panelCentral = new PanelCentral();
        panelInferior = new PanelInferior();
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout(10, 10));
        container.add(panelSuperior, BorderLayout.PAGE_START);
        container.add(panelCentral, BorderLayout.CENTER);
        container.add(panelInferior, BorderLayout.PAGE_END);
    }
}
