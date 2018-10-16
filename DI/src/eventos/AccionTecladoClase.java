package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class AccionTecladoClase {

    public static void main(String[] args) {
        VentanaAccionTeclado miVentana = new VentanaAccionTeclado();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);

    }

}

class VentanaAccionTeclado extends JFrame {
    private static final long serialVersionUID = 1L;

    public VentanaAccionTeclado() {
        setTitle("Frame respondiendo a FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelAccionTeclado());
    }


}


class PanelAccionTeclado extends JPanel {
    private static final long serialVersionUID = 1L;


    public PanelAccionTeclado() {

        ColorFondo colorAzul = new ColorFondo(Color.BLUE);
        ColorFondo colorAmarillo = new ColorFondo(Color.YELLOW);
        ColorFondo colorRojo = new ColorFondo(Color.RED);

        JButton btnAzul = new JButton(colorAzul);
        JButton btnAmarillo = new JButton(colorAmarillo);
        JButton btnRojo = new JButton(colorRojo);
        btnAzul.setText("Azul");
        btnAmarillo.setText("Amarillo");
        btnRojo.setText("Rojo");
        btnAzul.setIcon(new ImageIcon("src/recursos/azul.png"));
        btnAmarillo.setIcon(new ImageIcon("src/recursos/amarillo.png"));
        btnRojo.setIcon(new ImageIcon("src/recursos/rojo.png"));
        btnAzul.setMnemonic(KeyEvent.VK_B);
        btnAmarillo.setMnemonic(KeyEvent.VK_Y);
        btnRojo.setMnemonic(KeyEvent.VK_R);

        //mensaje emergente
        btnAzul.setToolTipText("Pone el fondo azul");
        btnAmarillo.setToolTipText("Pone el fondo amarillo");
        btnRojo.setToolTipText("Pone el fondo rojo");

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //B2
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        //B3
        mapaEntrada.put(teclaAzul, "fondoAzul");
        mapaEntrada.put(teclaAmarillo, "fondoAmarillo");
        mapaEntrada.put(teclaRojo, "fondoRojo");
        //B4
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAzul", colorAzul);
        mapaAccion.put("fondoAmarillo", colorAmarillo);
        mapaAccion.put("fondoRojo", colorRojo);

        add(btnAzul);
        add(btnAmarillo);
        add(btnRojo);

    }

    //1� definimos la clase Action
    private class ColorFondo extends AbstractAction {

        /**
         *
         */
        private static final long serialVersionUID = 1L;

        private Color colorFondo;

        public ColorFondo(Color c) {
            colorFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            setBackground(colorFondo);

        }

    }

}


