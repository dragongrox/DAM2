package PrimerosPasos2018.graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PruebaImagenes {

    public static void main(String[] args) {
        //2º instancia de la ventana
        MarcoVentanaImagenes miMarco = new MarcoVentanaImagenes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}
//1 creamos la ventana

class MarcoVentanaImagenes extends JFrame {
    public MarcoVentanaImagenes() {
        setBounds(100, 200, 400, 400);
        setTitle("Primer texto en Frame");
        //4º instanciamos la lamina
        PanelImagenes miPanel = new PanelImagenes();
        //5º agregamos el componente a la lamina
        miPanel.setBackground(SystemColor.window);
        add(miPanel);

    }
}

//3º Creamos el panel

class PanelImagenes extends JPanel {
    //utilizamos el constructor por defecto
    //sobreescribimos el metodo paintComponent para escribir dentro de la lamina

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //utilizamos el constructor por defecto
        //sobreescribimos el metodo principal paintComponent para escribir dentro del panel
        g.drawString("Empezamos el color", 50, 50);
        Graphics2D g2 = (Graphics2D) g;
        File fichero = new File("C:\\Pruebas\\arbol.png");
        try {
            Image miImage = ImageIO.read(fichero);
            g.drawImage(miImage, 0, 0, null);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "La imagen no se encuentra");
        }

    }
}
