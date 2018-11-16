/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.src.Pong;

import java.awt.*;

/**
 * @author Miguel
 */
public class Juego extends Canvas {
    Bola bola = new Bola(this);

    public void mover() {
        bola.moverBola();
    }

    @Override
    public void update(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        bola.paint(g2);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }

    public Bola getBola() {
        return bola;
    }


}
