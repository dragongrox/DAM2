package ejemplo1a;

import javax.swing.*;

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
    }
}
