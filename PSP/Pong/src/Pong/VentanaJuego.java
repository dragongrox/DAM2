
package Pong;

import javax.swing.*;
import java.awt.*;

public class VentanaJuego extends JFrame implements Runnable {
    static boolean terminado = false;
    Dimension dim;
    Juego game;
    int vel = 12;
    long tiempoJuego = System.currentTimeMillis();
    int tiempo;

    public VentanaJuego(String s, Dimension d) {
        super(s);
        dim = new Dimension(d);
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        game = new Juego(dim);
        Container lienzo = this.getContentPane();
        lienzo.add(game);
    }

    @Override
    public void run() {
        while (!terminado) {
            if (tiempo == 5 && vel > 1) {
                vel--;
                tiempoJuego = System.currentTimeMillis();
            }
            game.mover();
            game.repaint();
            try {
                Thread.sleep(vel);
            } catch (InterruptedException ex) {
            }
            tiempo = (int) ((System.currentTimeMillis() - tiempoJuego) / 1000);
            System.out.println(vel);
        }
    }

}
