import javax.swing.*;
import java.awt.*;

public class PanelDialogoPrimer extends JPanel {


    public PanelDialogoPrimer() {
        setBackground(Color.gray);
        JLabel labelTitulo = new JLabel("Hotel Estrella");
        labelTitulo.setFont(new Font("TimesRoman", Font.ITALIC, 40));
        labelTitulo.setForeground(Color.RED);
        add(labelTitulo);
    }
}
