package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class Ventana1a extends JFrame {
    private PanelBotones panelBotones;
    private PanelTexto panelTexto;
    private PanelTitulo panelTitulo;
    private JButton btnSalir;
    private JTextField mensaje;

    public Ventana1a() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        panelBotones = new PanelBotones();
        panelTexto = new PanelTexto();
        panelTitulo = new PanelTitulo();
        btnSalir = panelBotones.getBtnSalir();
        mensaje = panelTexto.getTxtMensaje();
        Container lienzo = this.getContentPane();
        //Colocamos todo
        BorderLayout borderLayout = new BorderLayout(5, 5);
        lienzo.setLayout(borderLayout);
        lienzo.add(panelTitulo, BorderLayout.PAGE_START);
        lienzo.add(panelTexto, BorderLayout.CENTER);
        lienzo.add(panelBotones, BorderLayout.PAGE_END);
        lienzo.setPreferredSize(new Dimension(450, 200));
        pack();
    }
}
