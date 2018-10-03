import javax.swing.*;

public class BoxLayoutHorizontal extends JPanel {
    public BoxLayoutHorizontal() {
        crearBotones(4, 4, this);
    }

    public void crearBotones(int x, int y, JPanel panel) {
        JButton[][] array = new JButton[x][y];
        for (int contx = 0; contx < x; contx++)
            for (int conty = 0; conty < y; conty++) {
                panel.add(new JButton(contx + "," + conty), BoxLayout.X_AXIS);
            }
    }
}
