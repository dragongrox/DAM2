package Ejemplos;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    JButton button1, button2, button3, button4, button5;

    public Ventana2() {
        button1 = new JButton("Boton 1");
        button2 = new JButton("Boton 2");
        button3 = new JButton("Boton 3");
        button4 = new JButton("Boton 4");
        button5 = new JButton("Boton 5");

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button1)
                                .addComponent(button4))
                        .addComponent(button2)
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button3)
                                .addComponent(button5))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1)
                                .addComponent(button2)
                                .addComponent(button3))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button4)
                                .addComponent(button5))
        );

        pack();
    }
}
