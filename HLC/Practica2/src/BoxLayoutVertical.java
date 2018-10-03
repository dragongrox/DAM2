import javax.swing.*;

public class BoxLayoutVertical extends JPanel {
    public BoxLayoutVertical() {
        crearBotones(6, 6, this);
    }

    public void crearBotones(int x, int y, JPanel panel) {
        JButton[][] array = new JButton[x][y];
        for (int contx = 0; contx < x; contx++)
            for (int conty = 0; conty < y; conty++) {
                panel.add(new JButton(contx + "," + conty), BoxLayout.X_AXIS);
            }
    }
}
