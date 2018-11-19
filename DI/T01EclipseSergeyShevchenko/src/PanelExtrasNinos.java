import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PanelExtrasNinos extends JPanel {
    JLabel labelEdadNinos, labelExtras;
    JSpinner spinnerEdadNinos;

    public PanelExtrasNinos() {
        labelEdadNinos = new JLabel("Edad Niños");
        labelExtras = new JLabel("cuna");

        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 14, 1);
        spinnerEdadNinos = new JSpinner(spinnerModel);
        spinnerEdadNinos.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Extras();
            }
        });

        Container container = this;
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelEdadNinos)
                                .addComponent(labelExtras))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(spinnerEdadNinos)
                                .addComponent(labelExtras))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEdadNinos)
                                .addComponent(spinnerEdadNinos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelExtras))
        );

        setBackground(Color.LIGHT_GRAY);
    }

    private void Extras() {
        if (Integer.parseInt(spinnerEdadNinos.getValue().toString()) < 4) {
            labelExtras.setText("cuna");
        } else if (Integer.parseInt(spinnerEdadNinos.getValue().toString()) < 10) {
            labelExtras.setText("cama supletoria pequeña");
        } else
            labelExtras.setText("cama supletoria normal");
    }
}
