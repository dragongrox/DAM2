package Layout.Ejercicios.Paneles;

import javax.swing.*;

public class PanelPrincipal extends JPanel {
    JButton buttonMostrarPanel2, buttonOcultarPanel2, buttonReiniciarDatos, buttonAceptar;
    Panel1 panel1;
    Panel2 panel2;
    JTextField textFieldPrincipal;

    public PanelPrincipal() {
        panel1 = new Panel1();
        panel2 = new Panel2();

        buttonMostrarPanel2 = new JButton();
        buttonOcultarPanel2 = new JButton();
        buttonReiniciarDatos = new JButton();
        buttonAceptar = new JButton();

        textFieldPrincipal = new JTextField("JPanel Principal");
        textFieldPrincipal.setLocation(600, 30);
        setLayout(null);
        add(textFieldPrincipal);
    }
}
