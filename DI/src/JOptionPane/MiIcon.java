package JOptionPane;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MiIcon implements Icon {

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        try {
            Image image = ImageIO.read(new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\src\\JOptionPane\\lapiz.jpg"));
            g.drawImage(image, x, y, c);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(c, "Imagen no encontrada", "Atenccion", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public int getIconWidth() {
        return 50;
    }

    @Override
    public int getIconHeight() {
        return 50;
    }
}
