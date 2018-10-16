package Layout.Ejercicios.CalculadoraSergeyShevchenko;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Pantalla pantalla;
    Teclado teclado;

    public Frame() {
        pantalla = new Pantalla();
        teclado = new Teclado();

        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);

        add(pantalla, BorderLayout.PAGE_START);
        add(teclado);
    }
}
