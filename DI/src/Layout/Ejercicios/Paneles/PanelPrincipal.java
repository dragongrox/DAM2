package Layout.Ejercicios.Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    JButton buttonMostrarPanel2, buttonOcultarPanel2, buttonReiniciarDatos, buttonAceptar;
    Panel1 panel1;
    Panel2 panel2;
    JLabel textFieldPrincipal;

    public PanelPrincipal() {
        panel1 = new Panel1();
        panel2 = new Panel2();

        buttonMostrarPanel2 = new JButton("Mostrar Panel2");
        buttonOcultarPanel2 = new JButton("Oculatar Panel2");
        buttonReiniciarDatos = new JButton("Reiniciar Datos");
        buttonAceptar = new JButton("Aceptar");
        setLayout(null);

        textFieldPrincipal = new JLabel("JPanel Principal");
        textFieldPrincipal.setLocation(250, 30);
        textFieldPrincipal.setSize(new Dimension(100, 30));
        panel1.setBackground(Color.gray);
        panel2.setBackground(Color.GREEN);


        panel1.setSize(230, 130);
        panel2.setSize(230, 130);


        panel1.setLocation(50, 60);
        panel2.setLocation(300, 60);

        buttonMostrarPanel2.setSize(165, 25);
        buttonAceptar.setSize(165, 25);
        buttonReiniciarDatos.setSize(165, 25);
        buttonOcultarPanel2.setSize(165, 25);

        buttonMostrarPanel2.setLocation(50, 210);
        buttonOcultarPanel2.setLocation(50, 240);
        buttonReiniciarDatos.setLocation(310, 210);
        buttonAceptar.setLocation(310, 240);

        add(textFieldPrincipal);
        add(panel1);
        add(panel2);
        add(buttonAceptar);
        add(buttonMostrarPanel2);
        add(buttonOcultarPanel2);
        add(buttonReiniciarDatos);
    }
}
