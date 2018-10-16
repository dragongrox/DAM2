package PrimerosPasos2018.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo {

    public static void main(String[] args) {
        //2º instancia de la ventana
        MarcoVentanaFuente miMarco = new MarcoVentanaFuente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}
//1 creamos la ventana

class MarcoVentanaTexto1 extends JFrame {
    public MarcoVentanaTexto1() {
        setBounds(100, 200, 400, 400);
        setTitle("Primer texto en Frame");
        //4º instanciamos la lamina
        PanelFuente miPanel = new PanelFuente();
        //5º agregamos el componente a la lamina
        add(miPanel);

    }
}

//3º Creamos el panel

class PanelTexto1 extends JPanel {
    //utilizamos el constructor por defecto
    //sobreescribimos el metodo paintComponent para escribir dentro de la lamina

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawString("Estamos aprendiendo a escribir en un Panel1", 50, 100);
        // dibujar rectangulo
        //g.drawRect(50,75,200,150);
        // dibujar linea
        //g.drawLine(10,10,0,300);
        // dibujar arco
        //g.drawArc(50,100,200,75,120,150);
        //obtenemos un objeto Graphics2D atraves de casting
        Graphics2D g2 = (Graphics2D) g;
        //no podemos instanciar directamente la clase Rectangle2d por ser abstracta
        //por el principio de Liskov instanciamos atraves de una subclase Rectangle2D.Double
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        //ahora dibujamos el objeto
        g2.draw(rectangulo);
        //creamos un objeto elipse2D
        Ellipse2D elipse = new Ellipse2D.Double(100, 100, 200, 150);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        //centro x e y para el circulo que lo englobetodo
        double centrox = rectangulo.getCenterX();
        double centroy = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centrox, centroy, centrox + radio, centroy + radio);
        g2.draw(circulo);
    }
}
