/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Raqueta {
    static int vel = 1;
    final int TAM = 60;
    int x, y, dx;
    Color c;
    private Juego game;

    public Raqueta(Juego game, Color c) {
        this.game = game;
        x = 150;
        y = 330;
        dx = 0;
        this.c = c;
    }

    public void moverRaqueta() {
        if (x + dx > 0 && x + dx < game.getWidth() - TAM) {
            x += dx;
        }

    }

    public void pintarRaqueta(Graphics2D g2) {
        g2.setColor(c);
        g2.fill3DRect(x, y, TAM, 15, true);
    }

    public void keyReleased(KeyEvent e) {
        dx = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx = -vel;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx = vel;
        }
    }

    public Rectangle devolverRaqueta() {
        return new Rectangle(x, y, TAM, TAM);
    }

}
