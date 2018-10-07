import javax.swing.*;

public class FrameVertical extends JFrame {
    BoxLayoutVertical boxLayoutVertical;

    public FrameVertical() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        boxLayoutVertical = new BoxLayoutVertical();
        add(boxLayoutVertical);
        pack();
    }
}
