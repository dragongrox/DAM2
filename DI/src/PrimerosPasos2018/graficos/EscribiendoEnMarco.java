package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        //2º instancia de la ventana
        MarcoVentanaTexto miMarco = new MarcoVentanaTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}
//1 creamos la ventana

class MarcoVentanaTexto extends JFrame {
    public MarcoVentanaTexto() {
        setBounds(100, 200, 400, 400);
        setTitle("Primer texto en Ventana");
        //4º instanciamos la lamina
        PanelTexto miPanel = new PanelTexto();
        //5º agregamos el componente a la lamina
        add(miPanel);

    }
}

//3º Creamos el panel

class PanelTexto extends JPanel {
    //utilizamos el constructor por defecto
    //sobreescribimos el metodo paintComponent para escribir dentro de la lamina

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo a escribir en un panel", 50, 100);
    }
}
