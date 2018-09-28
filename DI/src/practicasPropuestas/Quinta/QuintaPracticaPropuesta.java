package practicasPropuestas.Quinta;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Crea una ventana, en la que se muestre un cartel de prohibido utilizar moviles en clase. Crea el texto con un
 * tipo de letra grande, visible y en un color destacado, crea un objeto tipo rectangulo y tachalo con una linea.
 * Comenta los metodos utilizados.
 */
public class QuintaPracticaPropuesta {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });
    }

    public static void mostrar() {
        Ventana frame = new Ventana();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 300, 500, 500);

    }
}

class Ventana extends JFrame {
    Cartel cartel;
    Imagen imagen;

    public Ventana() {
        cartel = new Cartel();
        imagen = new Imagen();
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(cartel, BorderLayout.PAGE_START);
        container.add(imagen, BorderLayout.CENTER);
    }
}

class Cartel extends JPanel {
    JLabel labelMensaje;

    public Cartel() {
        labelMensaje = new JLabel("Prohibido utilizar moviles en clase");
        labelMensaje.setFont(new Font("Tahoma", 1, 25));
        labelMensaje.setForeground(Color.RED);
        add(labelMensaje, new FlowLayout(FlowLayout.CENTER));
    }
}

class Imagen extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //no podemos instanciar directamente la clase Rectangle2d por ser abstracta
        //por el principio de Liskov instanciamos atraves de una subclase Rectangle2D.Double
        File file = new File("C:\\Pruebas\\movil.png");
        try {
            Image image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
