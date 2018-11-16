/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.src.Ejemplopong;

import javax.swing.*;
import java.awt.*;

/**
 * @author Miguel
 */
public class BolaMovimiento extends Canvas {
    int x = 0, y = 0;
    int dx = 1, dy = 1;
    int tamBola = 40;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        BolaMovimiento bola = new BolaMovimiento();
        frame.add(bola);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        while (true) {
            bola.mover();
            bola.repaint();
            Thread.sleep(10);
        }
    }

    public void mover() {
        if ((x + dx < 0) || (x + dx > this.getWidth() - tamBola))
            dx = -dx;

        if ((y + dy < 0) || (y + dy > this.getHeight() - tamBola))
            dy = -dy;
        x += dx;
        y += dy;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillOval(x, y, tamBola, tamBola);
    }

}
