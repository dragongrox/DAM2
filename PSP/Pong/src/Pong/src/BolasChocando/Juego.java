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
public class Juego extends Canvas {
    Bola bola1 = new Bola(100, 0, this, Color.BLACK);
    Bola bola2 = new Bola(0, 0, this, Color.RED);

    public void mover() {
        bola1.moverBola();
        bola2.moverBola();

//        if(bola1.y-bola1.tamBola==bola2.y || bola1.y==bola2.y-bola2.tamBola){
//            bola1.dy=-bola1.dy;
//            bola2.dy=-bola2.dy;
//        }
//        
//        if(bola1.x+bola1.tamBola==bola2.x || bola1.x==bola2.x+bola2.tamBola){
//            bola1.dx=-bola1.dx;
//            bola2.dx=-bola2.dx;
//        }


    }

    @Override
    public void update(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        bola1.paint(g2);
        bola2.paint(g2);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }

    public Bola getBola1() {
        return bola1;
    }

    public Bola getBola2() {
        return bola2;
    }


}
