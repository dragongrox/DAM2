import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class main {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });
    }

    private static void mostrar() {
        FrameVertical frameVertical = new FrameVertical();
        frameVertical.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameVertical.setTitle("Vertical");
        frameVertical.setVisible(true);
        frameVertical.setBounds(0, 70, 250, 600);
        FrameHorizontal frameHorizontal = new FrameHorizontal();
        frameHorizontal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHorizontal.setTitle("Horizontal");
        frameHorizontal.setVisible(true);
        FrameGridLayout frameGridLayout = new FrameGridLayout();
        frameGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGridLayout.setTitle("GridLayout");
        frameGridLayout.setVisible(true);
        frameGridLayout.setLocation(250, 70);
    }
}
