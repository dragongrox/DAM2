package Cronometro;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class PanelCronometro extends JPanel {
    private static final long serialVersionUID = 1L;

    JLabel jlCronometro;

    public PanelCronometro() {
        iniciaComponentes();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.BLACK);
        Rectangle2D rectangulo = new Rectangle2D.Double(170, 60, 150, 150);
        g2.fill(rectangulo);
    }

    public void iniciaComponentes() {


        jlCronometro = new JLabel("00:00");


        jlCronometro.setForeground(Color.GREEN);


        add(Box.createRigidArea(new Dimension(0, 250)));
        add(jlCronometro);
    }

    public JLabel getjlCronometro() {
        return jlCronometro;
    }


}
