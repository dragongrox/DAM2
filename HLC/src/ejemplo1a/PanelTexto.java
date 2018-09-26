package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    private JTextField txtMensaje;

    public PanelTexto() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        txtMensaje = new JTextField("");
        txtMensaje.setBackground(Color.BLACK);
        txtMensaje.setForeground(Color.green);
        txtMensaje.setPreferredSize(new Dimension(100, 60));
        txtMensaje.setMaximumSize(new Dimension(120, 60));
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        this.setLayout(flowLayout);
        this.add(txtMensaje);
    }

    public JTextField getTxtMensaje() {
        return txtMensaje;
    }

    public void setTxtMensaje(JTextField txtMensaje) {
        this.txtMensaje = txtMensaje;
    }
}
