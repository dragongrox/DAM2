/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.src.BolasChocando;

import java.awt.*;

/**
 * @author Miguel
 */
public class Bola {
    int x = 0, y = 0;
    int dx = 1, dy = 1;
    int tamBola = 30;
    Color c;
    private Juego game;

    public Bola(int x, int y, Juego g, Color c) {
        this.x = x;
        this.y = y;
        game = g;
        this.c = c;
    }

    public void moverBola() {
        if ((x + dx < 0) || (x + dx > game.getWidth() - tamBola))
            dx = -dx;

        if ((y + dy < 0) || (y + dy > game.getHeight() - tamBola))
            dy = -dy;
        x += dx;
        y += dy;
    }

    public void paint(Graphics2D g) {
        g.setColor(c);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillOval(x, y, tamBola, tamBola);
    }
}
