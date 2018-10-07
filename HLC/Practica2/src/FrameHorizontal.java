import javax.swing.*;

public class FrameHorizontal extends JFrame {
    BoxLayoutHorizontal boxLayoutHorizontal;

    public FrameHorizontal() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        boxLayoutHorizontal = new BoxLayoutHorizontal();
        add(boxLayoutHorizontal);
        pack();
    }
}
