package eventos;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {
    public static void main(String[] args) {
        VentanaEventosFoco miVentana = new VentanaEventosFoco();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaEventosFoco extends JFrame {
    public VentanaEventosFoco() {
        setTitle("Ventana Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelFoco());
    }
}

class PanelFoco extends JPanel implements FocusListener {
    JLabel labelEmail, labelComprobacion;
    JTextField textFieldEmail, textFieldComprobacion;

    public PanelFoco() {
        labelEmail = new JLabel();
        labelComprobacion = new JLabel("¿Email correcto?: ");
        labelEmail.setText("Email: ");
        textFieldComprobacion = new JTextField();
        textFieldEmail = new JTextField();
        setLayout(null);
        labelEmail.setBounds(10, 10, 150, 20);
        labelComprobacion.setBounds(10, 50, 150, 20);
        textFieldEmail.setBounds(160, 10, 150, 20);
        textFieldComprobacion.setBounds(160, 50, 150, 20);
        add(labelEmail);
        add(labelComprobacion);
        add(textFieldEmail);
        add(textFieldComprobacion);
        textFieldEmail.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        JOptionPane.showMessageDialog(null, "Has perdido el foco");
        String email = textFieldEmail.getText();
        boolean comprobacion = false;
        for (int i = 0; email.length() > i; i++) {
            if (email.charAt(i) == '@') {
                comprobacion = true;
            }
            if (comprobacion) {
                textFieldComprobacion.setText("correcto");
            } else
                textFieldComprobacion.setText("incorrecto");
        }
    }
}

