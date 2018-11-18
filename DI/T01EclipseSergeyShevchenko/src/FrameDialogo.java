import javax.swing.*;
import java.awt.*;

public class FrameDialogo extends JFrame {
    PanelDialogoPrimer panelDialogoPrimer;
    PanelDialogoSegundo panelDialogoSegundo;
    PanelDialogoTercer panelDialogoTercer;

    public FrameDialogo() {
        panelDialogoPrimer = new PanelDialogoPrimer();
        panelDialogoSegundo = new PanelDialogoSegundo();
        panelDialogoTercer = new PanelDialogoTercer();
        setLayout(new GridLayout(5, 1, 15, 15));
        add(panelDialogoPrimer);
        add(panelDialogoSegundo);
        add(panelDialogoTercer);
    }
}
