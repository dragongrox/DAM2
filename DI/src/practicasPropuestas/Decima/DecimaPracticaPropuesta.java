package practicasPropuestas.Decima;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Crea una aplicación que utilize un campo de texto normal y un campo de texto de contraseña. Cuando el usuario e
 * scribe un texto en uno de los campos y presiona la tecla intro, la aplicación debe mostrar un
 * cuadro de diálogo de mensaje que contiene el texto que escribio el usuario.
 */
public class DecimaPracticaPropuesta {
    public static void main(String[] args) {
        VentanaDecima miVentana = new VentanaDecima();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaDecima extends JFrame {
    public VentanaDecima() {
        setTitle("Ventana Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelDecima());
    }
}

class PanelDecima extends JPanel {
    JLabel labelContraseña;
    JPasswordField textFieldContraseña;

    public PanelDecima() {
        labelContraseña = new JLabel("Contraseña");
        textFieldContraseña = new JPasswordField();
        setLayout(null);
        labelContraseña.setBounds(10, 10, 150, 20);
        textFieldContraseña.setBounds(160, 10, 150, 20);
        add(labelContraseña);
        add(textFieldContraseña);
        textFieldContraseña.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null, textFieldContraseña.getText());
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}