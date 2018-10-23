package ComponenetesAtomicos;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    JPanel contenedor;
    JLabel labelTitulo, etiquetaLabel, etiquetaBoton, etiquetaTongleButton;

    public VentanaPrincipal() {
        setTitle("Swing Componentes");
        setSize(630, 250);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void iniciarComponentes() {
        contenedor = new JPanel();
        contenedor.setLayout(null);
        labelTitulo = new JLabel();
        labelTitulo.setText("Componenetes Atomicos");
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
        labelTitulo.setBounds(180, 5, 380, 40);

        contenedor.add(labelTitulo);
    }
}
