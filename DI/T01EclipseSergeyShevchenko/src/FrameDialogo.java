import javax.swing.*;
import java.awt.*;

public class FrameDialogo extends JFrame {
    PanelDialogoPrimer panelDialogoPrimer;
    PanelDialogoSegundo panelDialogoSegundo;
    PanelDialogoTercer panelDialogoTercer;
    PanelDialogoCuarto panelDialogoCuarto;
    PanelBotones panelBotones;

    public FrameDialogo() {
        panelDialogoPrimer = new PanelDialogoPrimer();
        panelDialogoSegundo = new PanelDialogoSegundo();
        panelDialogoTercer = new PanelDialogoTercer();
        panelDialogoCuarto = new PanelDialogoCuarto();
        panelBotones = new PanelBotones();

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(panelDialogoPrimer)
                                .addComponent(panelDialogoSegundo)
                                .addComponent(panelDialogoTercer)
                                .addComponent(panelDialogoCuarto)
                                .addComponent(panelBotones))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDialogoPrimer))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDialogoSegundo))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDialogoTercer))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDialogoCuarto))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelBotones))
        );
    }
}
