/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * @author paco
 */
public class Panel1 extends JPanel {
    private JTextField pantalla;

    public Panel1() {
        iniciaComponentes();
    }

    public void iniciaComponentes() {
        pantalla = new JTextField(10);
        pantalla.setText("00:00:00");
        pantalla.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.lightGray, Color.yellow));
        pantalla.setPreferredSize(new Dimension(180, 80));
        pantalla.setForeground(Color.green);
        pantalla.setBackground(Color.black);
        pantalla.setFont(new Font("Open 24 Display St", 0, 38));
        pantalla.setHorizontalAlignment(JTextField.CENTER);
        pantalla.setEditable(false);

        this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        pantalla.setAlignmentY((float) 0.5);
        pantalla.setAlignmentX((float) 0.5);
        this.add(Box.createGlue());
        this.add(pantalla);
        this.add(Box.createGlue());
        this.setPreferredSize(new Dimension(400, 200));
        this.setMaximumSize(new Dimension(400, 200));
    }

    public JTextField getPantalla() {
        return pantalla;
    }

}
