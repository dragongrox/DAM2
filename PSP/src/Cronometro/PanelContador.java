package Cronometro;

import javax.swing.*;
import java.awt.*;

public class PanelContador extends JPanel {
    PanelBotones pb;
    PanelCronometro pc;
    JButton btnComenzar, btnPausar, btnContinuar;
    JLabel jlCronometro;
    HiloCronometro hilo;

    public PanelContador() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {

        pb = new PanelBotones();
        pc = new PanelCronometro();
        btnComenzar = pb.btnComenzar;
        btnPausar = pb.btnPausar;
        btnContinuar = pb.btnContinuar;
        jlCronometro = pc.jlCronometro;
        hilo = new HiloCronometro(jlCronometro);


        Container lienzo = this;
        BoxLayout bl = new BoxLayout(lienzo, BoxLayout.PAGE_AXIS);
        lienzo.setLayout(bl);
        lienzo.add(pc);
        lienzo.add(pb);
        lienzo.add(Box.createRigidArea(new Dimension(0, 50)));


        btnComenzar.addActionListener(e -> comenzar());
        btnPausar.addActionListener(e -> pausar());
        btnContinuar.addActionListener(e -> continuar());


    }

    public void comenzar() {
        btnComenzar.setEnabled(false);
        btnPausar.setEnabled(true);
        hilo.start();
    }

    @SuppressWarnings("deprecation")
    public void pausar() {
        btnPausar.setEnabled(false);
        btnContinuar.setEnabled(true);
        hilo.suspend();
    }

    @SuppressWarnings("deprecation")
    public void continuar() {
        btnPausar.setEnabled(true);
        btnContinuar.setEnabled(false);
        hilo.resume();

    }
}
