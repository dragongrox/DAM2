package Minas1.src;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    PanelTablero panelTablero;
    PanelMenu panelMenu;

    public Frame() {
        panelTablero = new PanelTablero(10, 10);
        panelMenu = new PanelMenu();

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(panelTablero)
                        .addComponent(panelMenu)

        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelTablero)
                                .addComponent(panelMenu))
        );

        groupLayout.linkSize(SwingConstants.CENTER, panelTablero, panelMenu);

        pack();

    }

}
