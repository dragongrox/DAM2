import javax.swing.*;

public class BoxLayoutVertical extends JPanel {
    public BoxLayoutVertical() {
        crearBotones(4, 4, this);
    }

    public void crearBotones(int x, int y, JPanel panel) {
        JButton[][] array = new JButton[x][y];
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int contx = 0; contx < x; contx++)
            for (int conty = 0; conty < y; conty++) {
                panel.add(new JButton(contx + "," + conty));
            }
    }
}
