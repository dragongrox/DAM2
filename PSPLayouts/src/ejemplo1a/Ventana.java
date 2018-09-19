package ejemplo1a;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton buttonSalir, buttonSaludo;
    private JTextField txtSaludo;
    private JLabel labelSuperior, labelInferior;

    public Ventana(){
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        buttonSalir=new JButton("Salir");
        buttonSaludo=new JButton("Dar la bienvenida");
        txtSaludo=new JTextField();
        labelSuperior=new JLabel("Este programa de va a saludar. Introduce tu nombre");
        labelInferior=new JLabel("v1.1");
        buttonSaludo.setBackground(Color.GREEN);
        buttonSalir.setBackground(Color.RED);


        Container container = this.getContentPane();
        container.setPreferredSize(new Dimension(500,300));
        container.add(labelSuperior, BorderLayout.PAGE_START);
        container.add(labelInferior, BorderLayout.LINE_START);
        container.add(txtSaludo, BorderLayout.CENTER);
        container.add(buttonSaludo, BorderLayout.LINE_END);
        container.add(buttonSalir, BorderLayout.PAGE_END);

        buttonSaludo.addActionListener(e->saludo());
        buttonSaludo.addActionListener(e->salir());
    }

    private void saludo() {
        if(txtSaludo.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "No se detecto texto");
        }else{
            JOptionPane.showMessageDialog(this, "Hola: " + txtSaludo.getText().trim());
            txtSaludo.setText("");
        }
    }

    private void salir() {
        System.exit(0);
    }
}
