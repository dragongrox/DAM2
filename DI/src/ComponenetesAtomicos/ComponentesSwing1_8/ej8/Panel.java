package ComponenetesAtomicos.ComponentesSwing1_8.ej8;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JTextArea textAreaIzquierda, textAreaDerecha;
    JButton buttonCopiar;
    JScrollBar scrollBar1, scrollBar2, scrollBar3, scrollBar4;

    public Panel() {
        textAreaIzquierda = new JTextArea();
        textAreaDerecha = new JTextArea();
        buttonCopiar = new JButton("Copiar >>>");
        scrollBar1 = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
        scrollBar2 = new JScrollBar(JScrollBar.VERTICAL, 30, 20, 0, 500);
        scrollBar3 = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
        scrollBar4 = new JScrollBar(JScrollBar.VERTICAL, 30, 20, 0, 500);

        setLayout(null);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        panel1.add(textAreaIzquierda, BorderLayout.CENTER);
        panel1.add(scrollBar1, BorderLayout.SOUTH);
        panel1.add(scrollBar2, BorderLayout.EAST);

        panel2.add(textAreaDerecha, BorderLayout.CENTER);
        panel2.add(scrollBar3, BorderLayout.SOUTH);
        panel2.add(scrollBar4, BorderLayout.EAST);

        panel1.setBounds(0, 0, 200, 200);
        buttonCopiar.setBounds(200, 90, 100, 20);
        panel2.setBounds(300, 0, 200, 200);

        add(panel1);
        add(buttonCopiar);
        add(panel2);

        buttonCopiar.addActionListener(e -> Accion());
    }

    private void Accion() {
        String texto = textAreaIzquierda.getSelectedText();
        textAreaDerecha.setText(texto);
    }

}