/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.src.BolasChocando;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Miguel
 */
public class VentanaJuego extends JFrame {
    Juego game = new Juego();

    public VentanaJuego(String s) {
        super(s);
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        Container lienzo = this.getContentPane();
        lienzo.add(game);
//        mover();
    }

    public void mover() {
        while (true) {
            game.mover();
            game.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
