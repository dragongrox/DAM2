package practicasPropuestas;

import javax.swing.*;
import java.awt.*;

/**
 * Crea una ventana, cuyo titulo sea SegundaBis Practica Propuesta, el tamaño sea la resolucion de la pantalla
 * donde se ejecute y el icono la imagen que tu quieras.
 */
public class SegundaBisPracticaPropuesta {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("SegundaBis Practica Propuesta");
        Dimension dimension = new Dimension();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        frame.setSize(dimension);
        Image image = toolkit.getImage("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\src\\practicasPropuestas\\IconoAlandaluz.jpg");
        frame.setIconImage(image);
    }

}
