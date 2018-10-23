package Layout.Ejercicios.Paneles;

import javax.swing.*;

public class Panel1 extends JPanel {
    JLabel labelTituloPanel1, labelNombre, labelApellidos;
    JTextField textFieldNombre, textFieldApellido;

    public Panel1() {
        labelNombre = new JLabel("Nombre");
        labelApellidos = new JLabel("Apellidos");
        labelTituloPanel1 = new JLabel("Titulo Panel1");
        textFieldNombre = new JTextField();
        textFieldApellido = new JTextField();

        setLayout(null);
        labelTituloPanel1.setLocation(20, 10);
        labelNombre.setLocation(10, 30);
        labelApellidos.setLocation(10, 60);
        textFieldNombre.setLocation(100, 30);
        textFieldApellido.setLocation(100, 60);

        labelNombre.setSize(60, 20);
        labelApellidos.setSize(60, 20);
        labelTituloPanel1.setSize(100, 20);
        textFieldNombre.setSize(100, 20);
        textFieldApellido.setSize(100, 20);

        add(labelApellidos);
        add(labelNombre);
        add(labelTituloPanel1);
        add(textFieldApellido);
        add(textFieldNombre);


    }
}
