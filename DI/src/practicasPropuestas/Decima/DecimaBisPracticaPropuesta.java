package practicasPropuestas.Decima;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Realiza una modificación sobre la aplicación anterior para que los cuadros de diálogo de mensaje se muestren
 * cuando el cuadro de texto pierda el foco.
 */
public class DecimaBisPracticaPropuesta {
    public static void main(String[] args) {
        VentanaDecima10bis miVentana = new VentanaDecima10bis();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaDecima10bis extends JFrame {
    public VentanaDecima10bis() {
        setTitle("Frame Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelDecimaDecima10bis());
    }
}

class PanelDecimaDecima10bis extends JPanel {
    JLabel labelContraseña;
    JPasswordField textFieldContraseña;

    public PanelDecimaDecima10bis() {
        labelContraseña = new JLabel("Contraseña");
        textFieldContraseña = new JPasswordField();
        setLayout(null);
        labelContraseña.setBounds(10, 10, 150, 20);
        textFieldContraseña.setBounds(160, 10, 150, 20);
        add(labelContraseña);
        add(textFieldContraseña);
        textFieldContraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                JOptionPane.showMessageDialog(null, textFieldContraseña.getText());
            }
        });
    }
}
