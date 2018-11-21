import javax.swing.*;
import java.awt.*;

public class FrameDialogo extends JFrame {
    PanelDatos panelDatos;
    PanelExtra panelExtra;

    public FrameDialogo() {
        setTitle("Alta");
        panelDatos = new PanelDatos();
        panelExtra = new PanelExtra();

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(panelDatos)
                                .addComponent(panelExtra))

        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDatos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelExtra))
        );
    }
}
