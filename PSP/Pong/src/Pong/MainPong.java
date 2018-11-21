
package Pong;

import javax.swing.*;
import java.awt.*;

public class MainPong {
    public static void main(String[] args) {
        VentanaJuego v = new VentanaJuego("Pong", new Dimension(300, 400));
        v.setSize(v.dim);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setResizable(false);
        v.setVisible(true);
        (new Thread(v)).start();
    }
}
