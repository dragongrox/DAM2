package Layout.Ejercicios.CalculadoraSergeyShevchenko;

import javax.swing.*;

public class Pantalla extends JPanel {
    JTextField textFieldRespuesta;

    public Pantalla() {
        textFieldRespuesta = new JTextField("0");
        add(textFieldRespuesta);
    }
}
