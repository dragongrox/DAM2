package practicasPropuestas;
/**
 * Crea una ventana, cuyo titulo sea Segunda Practica Propuesta, define el tamaño y la posicion con un solo
 * metodo, tamaño 500,300 y posicion 200, 300. Que la ventana no sea redimensionable. Cambia el icono de la
 * ventana por el logotipo de ies.
 */
import javax.swing.*;
import java.awt.*;

public class SegundaPracticaPropuesta {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Segunda Practica Propuesta");
        frame.setBounds(200, 300, 500, 300);
        frame.setResizable(false);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\src\\practicasPropuestas\\IconoAlandaluz.jpg");
        frame.setIconImage(image);

    }

}
