
package Pong;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Juego extends Canvas {
    Bola bola;
    Raqueta raqueta;
    private Dimension dim, dimaux;
    private Image imaux;
    private Graphics gaux;

    public Juego(Dimension d) {
        raqueta = new Raqueta(this, Color.RED);
        bola = new Bola(this, Color.BLACK);
        dim = d;

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                raqueta.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                raqueta.keyReleased(e);
            }

        });
        setFocusable(true);

    }

    public void mover() {
        bola.moverBola();
        raqueta.moverRaqueta();
    }

    @Override
    public void update(Graphics g) {
        if (dimaux == null || imaux == null) {
            dimaux = dim;
            imaux = createImage(dimaux.width, dimaux.height);
            gaux = imaux.getGraphics();
        }
        super.paint(gaux);
        Graphics2D g2 = (Graphics2D) gaux;
        bola.pintarBola(g2);
        raqueta.pintarRaqueta(g2);
        g.drawImage(imaux, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }

    public Bola getBola() {
        return bola;
    }


}
