package practicasPropuestas.DecimoPrimera;

import javax.swing.*;

/**
 * Crea una ventana que contenga 2 botones, el boton “Curso de Java Inicial” y el boton “Curso de Java
 * avanzado”, al pulsar en cada uno de ellos en el título de la ventan aparacera el nombre del botón.
 * Utiliza clases internas anónimas para implementar las interfaces de eventos.
 */
public class DecimoPrimeraPracticaPropuesta {
    public static void main(String[] args) {
        VentanaDecimoPrimera miVentana = new VentanaDecimoPrimera();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}

class VentanaDecimoPrimera extends JFrame {
    public VentanaDecimoPrimera() {
        setTitle("Frame Respondiento FocusEvent");
        setBounds(200, 200, 400, 400);
        add(new PanelDecimoPrimera(this));
    }
}

class PanelDecimoPrimera extends JPanel {
    JButton buttonInicial, buttonAvanzado;
    VentanaDecimoPrimera ventanaDecimoPrimera;

    public PanelDecimoPrimera(VentanaDecimoPrimera ventanaDecimoPrimera) {
        this.ventanaDecimoPrimera = ventanaDecimoPrimera;
        buttonAvanzado = new JButton("Curso de Java Inicial");
        buttonInicial = new JButton("Curso de Java Avanzado");
        add(buttonInicial);
        add(buttonAvanzado);
        buttonInicial.addActionListener(e -> ventanaDecimoPrimera.setTitle(buttonInicial.getText()));
        buttonAvanzado.addActionListener(e -> ventanaDecimoPrimera.setTitle(buttonAvanzado.getText()));

    }
}
