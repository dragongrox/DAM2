package Layout.Ejercicios.CalculadoraSergeyShevchenko;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {
    JButton button7, button8, button9, buttonDividir, button4,
            button5, button6, buttonMultiplicar, button1, button2,
            button3, buttonRestar, button0, buttonComa, buttonIgual, buttonSumar;

    public Teclado() {
        button7 = new JButton("7");
        button8 = new JButton("6");
        button9 = new JButton("5");
        buttonDividir = new JButton("/");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonMultiplicar = new JButton("*");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        buttonRestar = new JButton("-");
        button0 = new JButton("0");
        buttonComa = new JButton(",");
        buttonIgual = new JButton("=");
        buttonSumar = new JButton("+");

        GridLayout boxLayout = new GridLayout(4, 4);
        setLayout(boxLayout);

        add(button7);
        add(button8);
        add(button9);
        add(buttonDividir);
        add(button4);
        add(button5);
        add(button6);
        add(buttonMultiplicar);
        add(button1);
        add(button2);
        add(button3);
        add(buttonRestar);
        add(button0);
        add(buttonComa);
        add(buttonIgual);
        add(buttonSumar);
    }
}
