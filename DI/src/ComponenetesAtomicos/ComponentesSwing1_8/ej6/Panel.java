package ComponenetesAtomicos.ComponentesSwing1_8.ej6;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Panel extends JPanel {
    JLabel labelUsuario, labelContrasena, labelTelefono, labelFechaDeAlta, labelUsuarioExp, labelTelefonExp;
    JTextArea textArea;
    JButton buttonEnviarDatos;
    JPasswordField passwordField;
    JFormattedTextField formattedTextFieldTelefono, formattedTextFieldUsuario, formattedTextFieldFechaDeAlta;


    public Panel() {
        labelUsuario = new JLabel("Usuario:");
        labelContrasena = new JLabel("Contraseña: ");
        labelTelefono = new JLabel("Telefono:");
        labelFechaDeAlta = new JLabel("Fecha de Alta:");
        labelUsuarioExp = new JLabel("Maximo 6 alfanumericos");
        labelTelefonExp = new JLabel("Nueve digitos");

        MaskFormatter mascaraNumero = new MaskFormatter();
        MaskFormatter mascaraUsuario = new MaskFormatter();
        MaskFormatter mascaraFecha = new MaskFormatter();
        try {
            mascaraNumero = new MaskFormatter("#########");
            mascaraUsuario = new MaskFormatter("AAAAAA");
            mascaraFecha = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        formattedTextFieldUsuario = new JFormattedTextField(mascaraUsuario);
        passwordField = new JPasswordField();
        formattedTextFieldTelefono = new JFormattedTextField(mascaraNumero);
        formattedTextFieldFechaDeAlta = new JFormattedTextField(mascaraFecha);
        formattedTextFieldFechaDeAlta.setText("07/10/2017");

        textArea = new JTextArea();

        buttonEnviarDatos = new JButton("Enviar Datos");

        setLayout(null);

        labelUsuario.setSize(100, 20);
        labelTelefonExp.setSize(100, 20);
        labelUsuarioExp.setSize(100, 20);
        labelFechaDeAlta.setSize(100, 20);
        labelTelefono.setSize(100, 20);
        labelContrasena.setSize(100, 20);

        formattedTextFieldFechaDeAlta.setSize(100, 20);
        formattedTextFieldTelefono.setSize(100, 20);
        passwordField.setSize(100, 20);
        formattedTextFieldUsuario.setSize(100, 20);

        textArea.setSize(400, 200);
        buttonEnviarDatos.setSize(100, 20);

        labelUsuario.setLocation(5, 5);
        labelTelefonExp.setLocation(230, 85);
        labelUsuarioExp.setLocation(230, 5);
        labelFechaDeAlta.setLocation(5, 125);
        labelTelefono.setLocation(5, 85);
        labelContrasena.setLocation(5, 45);

        formattedTextFieldFechaDeAlta.setLocation(105, 125);
        formattedTextFieldTelefono.setLocation(105, 85);
        passwordField.setLocation(105, 45);
        formattedTextFieldUsuario.setLocation(105, 5);

        textArea.setLocation(5, 200);

        buttonEnviarDatos.setLocation(450, 400);

        add(labelUsuario);
        add(labelTelefonExp);
        add(labelUsuarioExp);
        add(labelFechaDeAlta);
        add(labelTelefono);
        add(labelContrasena);

        add(formattedTextFieldFechaDeAlta);
        add(formattedTextFieldTelefono);
        add(passwordField);
        add(formattedTextFieldUsuario);

        add(textArea);

        add(buttonEnviarDatos);

        buttonEnviarDatos.addActionListener(e -> Accion());
    }

    private void Accion() {
        textArea.setText("Usuario = " + formattedTextFieldUsuario.getText() +
                "\n Contraseña encriptada =" + passwordField +
                "\n Telefono = " + formattedTextFieldTelefono.getText() +
                "\n Fecha de Alta = " + formattedTextFieldFechaDeAlta.getText());
    }


}
