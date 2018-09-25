package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;

public class TrabajandoFuentes {

    public static void main(String[] args) {
        //2º instancia de la ventana
        MarcoVentanaFuente miMarco = new MarcoVentanaFuente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}
//1 creamos la ventana

class MarcoVentanaFuente extends JFrame {
    public MarcoVentanaFuente() {
        setBounds(100, 200, 400, 400);
        setTitle("Primer texto en Ventana");
        //4º instanciamos la lamina
        PanelFuente miPanel = new PanelFuente();
        //5º agregamos el componente a la lamina
        miPanel.setBackground(SystemColor.window);
        add(miPanel);

    }
}

//3º Creamos el panel

class PanelFuente extends JPanel {
    //utilizamos el constructor por defecto
    //sobreescribimos el metodo paintComponent para escribir dentro de la lamina

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //utilizamos el constructor por defecto
        //sobreescribimos el metodo principal paintComponent para escribir dentro del panel
        g.drawString("Empezamos el color", 50, 50);
        Graphics2D g2 = (Graphics2D) g;
        Font miFuente1 = new Font("Arial", Font.ITALIC, 20);
        g2.setFont(miFuente1);
        g2.setColor(Color.orange);
        g2.drawString("Modificando el titulo de letra", 50, 100);
        g2.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 26));
        g2.setColor(Color.red.darker().darker());
        g2.drawString("Modificando el titulo de letra", 50, 150);
    }
}
