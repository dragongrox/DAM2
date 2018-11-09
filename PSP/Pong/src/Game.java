import javax.swing.*;
import java.awt.*;

public class Game extends Canvas {
    int x = 0, y = 0, dx = 1, dy = 1;
    Dimension dim, dimaux;
    Image imaux;
    Graphics gaux;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tenis");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //    Bola miBola;
    private void moverBola() {
        if ((x + dx < 0) || (x + dx > this.getWidth() - 30)) {
            dx = -dx;
        }
        if ((y + dy < 0) || (y + dy > this.getHeight() - 30)) {
            dy = -dy;
        }
        x = x + dx;
        y = y + dy;
    }

    public void update(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    public void paint(Graphics g) {
        paint(g);
    }
}