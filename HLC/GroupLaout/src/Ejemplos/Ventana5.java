package Ejemplos;

import javax.swing.*;
import java.awt.*;

public class Ventana5 extends JFrame {
    JButton buttonAceptar, buttonCancelar;
    JLabel labelEscribe;
    JTextField textField;
    PanelBox panelBox;

    public Ventana5() {
        textField = new JTextField();
        labelEscribe = new JLabel("Escribe un texto");
        buttonAceptar = new JButton("Aceptar");
        buttonCancelar = new JButton("Cancelar");
        panelBox = new PanelBox();

        textField.setSize(240, 20);

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(labelEscribe)
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(textField)
                                .addComponent(panelBox))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(buttonAceptar)
                                .addComponent(buttonCancelar))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEscribe)
                                .addComponent(textField)
                                .addComponent(buttonAceptar))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelBox)
                                .addComponent(buttonCancelar))
        );

        pack();
    }
}

class PanelBox extends JPanel {
    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    public PanelBox() {
        checkBox1 = new JCheckBox("Opcion 1");
        checkBox2 = new JCheckBox("Opcion 2");
        checkBox3 = new JCheckBox("Opcion 3");
        checkBox4 = new JCheckBox("Opcion 4");

        Container container = this;
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(checkBox1)
                                .addComponent(checkBox3))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(checkBox2)
                                .addComponent(checkBox4))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(checkBox1)
                                .addComponent(checkBox2))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(checkBox3)
                                .addComponent(checkBox4))
        );

    }
}