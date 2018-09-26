package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;

public class VentanaCalculadora extends JFrame {
    private PanelTitulo panelTitulo;
    private PanelCentral panelCentral;
    private PanelSolucion panelSolucion;
    private PanelIzquierda panelIzquierda;
    private PanelDerecha panelDerecha;

    public VentanaCalculadora() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        panelTitulo = new PanelTitulo();
        panelCentral = new PanelCentral();
        panelDerecha = new PanelDerecha();
        panelIzquierda = new PanelIzquierda();
        panelSolucion = new PanelSolucion();

        Container container = this.getContentPane();

        container.setLayout(new BorderLayout(10, 10));
        container.add(panelTitulo, BorderLayout.PAGE_START);
        container.add(panelCentral, BorderLayout.CENTER);
        container.add(panelDerecha, BorderLayout.EAST);
        container.add(panelIzquierda, BorderLayout.WEST);
        container.add(panelSolucion, BorderLayout.AFTER_LAST_LINE);
        container.setPreferredSize(new Dimension(600, 300));
        pack();
    }
}
