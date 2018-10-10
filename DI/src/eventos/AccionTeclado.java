package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class AccionTeclado {
    public static void main(String[] args) {
        FrameAccion frame = new FrameAccion();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class FrameAccion extends JFrame {
    PanelAccionTeclado panel;

    public FrameAccion() {
        setTitle("El oyente es: Un objeto de una clase que lo implemente");
        setBounds(200, 200, 400, 400);
        panel = new PanelAccionTeclado();
        add(panel);
    }
}

class PanelAccionTeclado extends JPanel {
    JButton buttonAzul, buttonAmarillo, buttonRojo;

    public PanelAccionTeclado() {
        buttonAzul = new JButton("Azul");
        buttonAmarillo = new JButton("Amarillo");
        buttonRojo = new JButton("Rojo");
        add(buttonAzul);
        add(buttonAmarillo);
        add(buttonRojo);
        buttonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
        buttonAzul.addActionListener(new ColorFondo(Color.BLUE));
        buttonRojo.addActionListener(new ColorFondo(Color.RED));
        buttonAmarillo.setMnemonic(KeyEvent.VK_B);
        buttonRojo.setMnemonic(KeyEvent.VK_V);

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private class ColorFondo extends AbstractAction implements ActionListener {
        Color color;

        public ColorFondo(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(color);
        }
    }
}
