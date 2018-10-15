package practicasPropuestas.DecimaTercera;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Crea una calculadora que sume los dos valores introducidos en dos campos de texto
 * y ponga el resultado en un tercer campo de texto al hacer clic sobre un botón llamado suma y cuando se presione la
 * combinación de teclas “ctrl + s”. Indica con un cuadro emergente la función del botón.
 * Incluye en el boton un icono. Trata el posible error que se pueda generar al convertir String en Float.
 */
public class DecimaTerceraPropuesta {
    public static void main(String[] args) {
        VentanaDecimoTercera miVentana = new VentanaDecimoTercera();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaDecimoTercera extends JFrame {
    public VentanaDecimoTercera() {
        setTitle("Ventana Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelDecimaDecimoTercera());
    }
}

class PanelDecimaDecimoTercera extends JPanel {
    JTextField textFieldSumando1, textFieldSumando2, textFieldResultado;
    JLabel labelSumando1, labelSumando2, labelResultado;
    JButton buttonSumar;


    public PanelDecimaDecimoTercera() {
        setLayout(null);
        textFieldSumando1 = new JTextField();
        textFieldSumando2 = new JTextField();
        textFieldResultado = new JTextField();
        labelSumando1 = new JLabel("Sumando 1:");
        labelSumando2 = new JLabel("Sumando 2:");
        labelResultado = new JLabel("Resultado: ");
        buttonSumar=new JButton("Sumar");
        labelSumando1.setBounds(10, 10, 150, 20);
        textFieldSumando1.setBounds(160, 10, 150, 20);
        labelSumando2.setBounds(10, 50, 150, 20);
        textFieldSumando2.setBounds(160, 50, 150, 20);
        labelResultado.setBounds(10, 100, 150, 20);
        textFieldResultado.setBounds(160, 100, 150, 20);
        buttonSumar.setBounds(10,160,150,20);
        buttonSumar.addActionListener(e -> Sumar());
        buttonSumar.setToolTipText("Suma");
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        KeyStroke teclaSumar = KeyStroke.getKeyStroke("ctrl S");
        mapaEntrada.put(teclaSumar, "Suma");
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("sumar", new suma());
        add(labelSumando1);
        add(textFieldSumando1);
        add(labelSumando2);
        add(textFieldSumando2);
        add(labelResultado);
        add(textFieldResultado);
        add(buttonSumar);
    }

    private class suma extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            Sumar();

        }

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
