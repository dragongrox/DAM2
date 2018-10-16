package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class TrabajandoColores {

    public static void main(String[] args) {
        //2º instancia de la ventana
        MarcoVentanaFuente miMarco = new MarcoVentanaFuente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}
//1 creamos la ventana

class MarcoVentanaColor extends JFrame {
    public MarcoVentanaColor() {
        setBounds(100, 200, 400, 400);
        setTitle("Primer texto en Frame");
        //4º instanciamos la lamina
        PanelFuente miPanel = new PanelFuente();
        //5º agregamos el componente a la lamina
        miPanel.setBackground(SystemColor.window);
        add(miPanel);

    }
}

//3º Creamos el panel

class PanelColor extends JPanel {
    //utilizamos el constructor por defecto
    //sobreescribimos el metodo paintComponent para escribir dentro de la lamina

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //utilizamos el constructor por defecto
        //sobreescribimos el metodo principal paintComponent para escribir dentro del panel
        g.drawString("Empezamos el color", 50, 50);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.RED);
        g2.drawString("Escribiendo en rojo", 50, 75);
        //instanciamos un color
        Color color1 = new Color(10, 100, 20);
        Rectangle2D rectangulo1 = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(color1);
        g2.draw(rectangulo1);
        g2.setPaint(new Color(255));
        g2.fill(rectangulo1);
        g2.setPaint(new Color(100).brighter().brighter());
        Ellipse2D elipse1 = new Ellipse2D.Double(200, 200, 150, 150);
        g2.fill(elipse1);
        g2.setPaint(Color.BLACK);
    }
}
