import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    PanelContador panelContador1, panelContador2;
    PanelBotones panelBotones;
    HiloCronometro hiloCronometro1, hiloCronometro2;

    public Ventana() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        panelBotones = new PanelBotones();
        panelContador1 = new PanelContador("1");
        panelContador2 = new PanelContador("2");

        Container lienzo = this.getContentPane();
        GridLayout bl = new GridLayout();
        lienzo.setLayout(bl);
        lienzo.add(panelContador1);
        lienzo.add(panelContador2);
        lienzo.add(panelBotones);
        pack();

        panelBotones.buttonComenzar.addActionListener(e -> Comenzar());


    }

    private void Comenzar() {
        panelContador1.Comenzar();
        panelContador2.Comenzar();
    }

}
