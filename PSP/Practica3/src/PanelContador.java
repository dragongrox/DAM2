import javax.swing.*;
import java.awt.*;

public class PanelContador extends JPanel {
    PanelCronometro pc;
    JLabel labelCronometro;
    HiloCronometro hiloCronometro;

    public PanelContador(String nom) {
        iniciaComponentes(nom);
    }

    public void iniciaComponentes(String nom) {
        pc = new PanelCronometro();
        labelCronometro = pc.jlCronometro;


        Container lienzo = this;
        BoxLayout bl = new BoxLayout(lienzo, BoxLayout.PAGE_AXIS);
        lienzo.setLayout(bl);
        lienzo.add(pc);
        lienzo.add(Box.createRigidArea(new Dimension(0, 50)));
        hiloCronometro = new HiloCronometro(labelCronometro, nom);
    }

    public void Comenzar() {
        hiloCronometro.run();
    }
}
