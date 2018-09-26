package practicasPropuestas;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Crea una ventana, en la cual aparece el texto "Cabecera" en la parte superior centrada y el texto "Pie" en la parte inferior derecha
 */

public class TerceraPracticaPropuesta {
    public static void main(String[] args) {

        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });


    }

    private static void mostrar() {
        Frame frame=new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 300, 500, 300);
    }
}

class Frame extends JFrame {
    Titilo titilo;
    Pie pie;
    public Frame(){
        titilo=new Titilo();
        pie=new Pie();
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(titilo,BorderLayout.PAGE_START);
        container.add(pie,BorderLayout.PAGE_END);
    }
}

class Titilo extends JPanel{
    JLabel labelTitulo;
    public Titilo(){
        labelTitulo =new JLabel("Cabecera");
        add(labelTitulo,new FlowLayout(FlowLayout.CENTER));
    }
}
class Pie extends JPanel{
    JLabel labelPie;
    public Pie(){
        labelPie=new JLabel("Pie");
        JSlider slider=new JSlider();
        slider.setPreferredSize(new Dimension(200,0));
        add(slider);
        add(labelPie,new FlowLayout(FlowLayout.RIGHT));

    }
}
