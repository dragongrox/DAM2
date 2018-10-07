import javax.swing.*;

public class FrameGridLayout extends JFrame {
    GridLayout gridLayout;

    public FrameGridLayout() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        gridLayout = new GridLayout();
        add(gridLayout);
        pack();
    }
}
