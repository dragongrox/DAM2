package ComponenetesAtomicos.ComponentesSwing1_8.ej5;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Panel extends JPanel {
    JProgressBar progressBar;
    JSpinner spinner1, spinner2, spinner3, spinner4, spinner5;


    public Panel() {
        progressBar = new JProgressBar();
        SpinnerModel sm1 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel sm2 = new SpinnerDateModel();
        SpinnerModel sm3 = new SpinnerListModel();
        SpinnerModel sm5 = new SpinnerModel() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public void setValue(Object value) {

            }

            @Override
            public Object getNextValue() {
                return null;
            }

            @Override
            public Object getPreviousValue() {
                return null;
            }

            @Override
            public void addChangeListener(ChangeListener l) {

            }

            @Override
            public void removeChangeListener(ChangeListener l) {

            }
        };
        spinner1 = new JSpinner(sm1);
        spinner2 = new JSpinner(sm2);
        spinner3 = new JSpinner(sm3);
        spinner4 = new JSpinner();
        spinner5 = new JSpinner(sm5);
        progressBar.setStringPainted(true);


        this.setLayout(null);
        add(progressBar, BorderLayout.PAGE_START);
        add(spinner1);
        add(spinner2);
        add(spinner3);
        add(spinner4);
        add(spinner5);

        progressBar.setSize(500, 40);
        spinner1.setSize(80, 20);
        spinner2.setSize(80, 20);
        spinner3.setSize(80, 20);
        spinner4.setSize(80, 20);
        spinner5.setSize(80, 20);

        progressBar.setLocation(5, 150);
        spinner1.setLocation(100, 330);
        spinner2.setLocation(180, 330);
        spinner3.setLocation(260, 330);
        spinner4.setLocation(320, 330);
        spinner5.setLocation(400, 330);

        spinner1.addChangeListener(e -> Accion());


    }

    private void Accion() {
        progressBar.setValue((Integer) spinner1.getValue());

    }


}
