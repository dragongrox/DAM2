import javax.swing.*;

public class Frame extends JFrame {
    BoxLayoutHorizontal boxLayoutHorizontal;

    public Frame() {
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        boxLayoutHorizontal = new BoxLayoutHorizontal();
        add(boxLayoutHorizontal);
    }
}
