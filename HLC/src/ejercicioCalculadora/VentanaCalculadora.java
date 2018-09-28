package ejercicioCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaCalculadora extends JFrame implements KeyListener {
    private PanelTitulo panelTitulo;
    private PanelCentral panelCentral;
    private PanelSolucion panelSolucion;
    private PanelIzquierda panelIzquierda;
    private PanelDerecha panelDerecha;
    private JTextField textField1, textField2;
    public VentanaCalculadora() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        panelTitulo = new PanelTitulo();
        panelCentral = new PanelCentral();
        panelDerecha = new PanelDerecha();
        panelIzquierda = new PanelIzquierda();
        panelSolucion = new PanelSolucion();
        textField1 = panelCentral.getTextField1();
        textField2 = panelCentral.getTextField2();

        Container container = this.getContentPane();

        container.setLayout(new BorderLayout(10, 10));
        container.add(panelTitulo, BorderLayout.PAGE_START);
        container.add(panelCentral, BorderLayout.CENTER);
        container.add(panelDerecha, BorderLayout.EAST);
        container.add(panelIzquierda, BorderLayout.WEST);
        container.add(panelSolucion, BorderLayout.AFTER_LAST_LINE);
        container.setPreferredSize(new Dimension(600, 300));
        pack();
        textField1.addKeyListener(this);
        textField2.addKeyListener(this);
        panelCentral.buttonSuma.addActionListener(e -> Sumar());
        panelDerecha.buttonCalcular.addActionListener(e -> Sumar());
    }

    private void Sumar() {
        panelSolucion.textFieldSolucion.setText(String.valueOf(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText())));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == textField1 || e.getSource() == textField2) {
            char c = e.getKeyChar();
            if (c < '0' || c > '9') {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
