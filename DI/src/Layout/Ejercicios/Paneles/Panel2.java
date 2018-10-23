package Layout.Ejercicios.Paneles;

import javax.swing.*;

public class Panel2 extends JPanel {
    JLabel labelTitulo;
    JButton buttonBoton;

    public Panel2() {
        labelTitulo = new JLabel("Titulo Panel2");
        buttonBoton = new JButton("Boton");

        setLayout(null);

        labelTitulo.setLocation(60, 10);
        buttonBoton.setLocation(50, 60);

        labelTitulo.setSize(100, 20);
        buttonBoton.setSize(100, 25);

        add(labelTitulo);
        add(buttonBoton);
    }
}
