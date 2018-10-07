import javax.swing.*;

public class GridLayout extends JPanel {
    public GridLayout() {
        crearBotones(3, 2, this);
    }

    public void crearBotones(int x, int y, JPanel panel) {
        JButton[][] array = new JButton[x][y];
        panel.setLayout(new java.awt.GridLayout(3, 2));
        for (int contx = 0; contx < x; contx++)
            for (int conty = 0; conty < y; conty++) {
                panel.add(new JButton(contx + "," + conty));
            }
    }
}
