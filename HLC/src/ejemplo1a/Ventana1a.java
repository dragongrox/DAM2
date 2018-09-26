package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class Ventana1a extends JFrame {
    private PanelBotones panelBotones;
    private PanelTexto panelTexto;
    private PanelTitulo panelTitulo;
    private JButton btnSalir;
    private JTextField mensaje;
    private JButton btnSaludo;

    public Ventana1a() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        panelBotones = new PanelBotones();
        panelTexto = new PanelTexto();
        panelTitulo = new PanelTitulo();
        btnSalir = panelBotones.getBtnSalir();
        btnSaludo = panelBotones.getBtnSaludo();

        mensaje = panelTexto.getTxtMensaje();
        Container lienzo = this.getContentPane();
        //Colocamos todo
        BorderLayout borderLayout = new BorderLayout(5, 5);
        lienzo.setLayout(borderLayout);
        lienzo.add(panelTitulo, BorderLayout.PAGE_START);
        lienzo.add(panelTexto, BorderLayout.CENTER);
        lienzo.add(panelBotones, BorderLayout.PAGE_END);
        lienzo.setPreferredSize(new Dimension(450, 200));
        //Añadimos listener a boton saludo
        btnSaludo.addActionListener(e -> saludo());
        pack();
    }

    public void saludo() {
        String text = mensaje.getText().trim();
        if (text.length() == 0) {
            JOptionPane.showMessageDialog(this, "Introduce un saludo!!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Tu saludo es: " + text);
            mensaje.setText("");
        }
    }
}
