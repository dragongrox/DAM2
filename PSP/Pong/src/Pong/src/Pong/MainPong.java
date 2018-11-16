/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.src.Pong;

import javax.swing.*;

/**
 * @author Miguel
 */
public class MainPong {
    public static void main(String[] args) {
        VentanaJuego v = new VentanaJuego("Pong");
        v.setSize(300, 400);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setResizable(false);
        v.setVisible(true);
        v.mover();
    }
}
