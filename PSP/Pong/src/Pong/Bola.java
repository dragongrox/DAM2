
package Pong;

import javax.swing.*;
import java.awt.*;

public class Bola {
    final int RAD = 30;
    int x = 0, y = 0;
    int dx = 1, dy = 1;
    Color c;
    private Juego game;

    public Bola(Juego g, Color c) {
        game = g;
        this.c = c;
    }

    public void moverBola() {
        if ((x + dx < 0) || (x + dx > game.getWidth() - RAD))
            dx = -dx;

        if (game.raqueta.devolverRaqueta().intersects(this.devolverBola()))
            dy = -dy;

        if (y == game.getHeight() - RAD)
            gameOver();

        if ((y + dy < 0) || (y + dy > game.getHeight() - RAD))
            dy = -dy;
        x += dx;
        y += dy;
    }

    public void pintarBola(Graphics2D g) {
        g.setColor(c);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillOval(x, y, RAD, RAD);
    }

    protected void gameOver() {
        VentanaJuego.terminado = true;
        JOptionPane.showMessageDialog(game, "¡Has Perdido!", "Game Over", JOptionPane.WARNING_MESSAGE);
        game.setVisible(false);
    }

    public Rectangle devolverBola() {
        return new Rectangle(x, y, RAD, RAD);
    }
}
