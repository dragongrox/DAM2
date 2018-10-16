package practicasPropuestas.DecimoSegunda;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Crea una calculadora que sume los dos valores introducidos en dos campos de texto, y el cálculo aparezca
 * en un tercer campo en el momento que uno de los campos gane o pierdan el foco.
 * Trata el posible error que se pueda generar al convertir String en Float.
 */
public class DecimoSegundaPracticaPropuesta {
    public static void main(String[] args) {
        VentanaDecimoSegunda miVentana = new VentanaDecimoSegunda();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaDecimoSegunda extends JFrame {
    public VentanaDecimoSegunda() {
        setTitle("Frame Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelDecimaDecimoSegunda());
    }
}

class PanelDecimaDecimoSegunda extends JPanel implements FocusListener {
    JTextField textFieldSumando1, textFieldSumando2, textFieldResultado;
    JLabel labelSumando1, labelSumando2, labelResultado;


    public PanelDecimaDecimoSegunda() {
        setLayout(null);
        textFieldSumando1 = new JTextField();
        textFieldSumando2 = new JTextField();
        textFieldResultado = new JTextField();
        labelSumando1 = new JLabel("Sumando 1:");
        labelSumando2 = new JLabel("Sumando 2:");
        labelResultado = new JLabel("Resultado: ");
        labelSumando1.setBounds(10, 10, 150, 20);
        textFieldSumando1.setBounds(160, 10, 150, 20);
        labelSumando2.setBounds(10, 50, 150, 20);
        textFieldSumando2.setBounds(160, 50, 150, 20);
        labelResultado.setBounds(10, 100, 150, 20);
        textFieldResultado.setBounds(160, 100, 150, 20);
        add(labelSumando1);
        add(textFieldSumando1);
        add(labelSumando2);
        add(textFieldSumando2);
        add(labelResultado);
        add(textFieldResultado);
        textFieldSumando1.addFocusListener(this);
        textFieldSumando2.addFocusListener(this);

    }

    @Override
    public void focusGained(FocusEvent e) {
        Sumar();
    }

    @Override
    public void focusLost(FocusEvent e) {
        Sumar();
    }

    public void Sumar() {
        float sumando1, sumando2;
        if (!textFieldSumando1.getText().isEmpty() && !textFieldSumando2.getText().isEmpty()) {
            try {
                sumando1 = Float.valueOf(textFieldSumando1.getText());
                sumando2 = Float.valueOf(textFieldSumando2.getText());
                textFieldResultado.setText(String.valueOf(sumando1 + sumando2));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.WARNING_MESSAGE);
                textFieldSumando1.setText("");
                textFieldSumando2.setText("");
            }
        }
    }
}

