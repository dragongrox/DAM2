package JOptionPane;

import javax.swing.*;

public class PruebaDialogos {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(null, "Esto es un mensaje");
    }
}

class Frame extends JFrame {
    public Frame() {
        setTitle("Prueba de dialogo con botones");
        setBounds(200, 200, 400, 400);
        add(new Panel());
    }
}

class Panel extends JPanel {
    JButton button1;

    public Panel() {
        button1 = new JButton("Aceptar");
        add(button1);

    }
}
