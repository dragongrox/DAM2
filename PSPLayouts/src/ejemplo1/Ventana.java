/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dragon
 */
public class Ventana extends JFrame{
    private JButton btnSalir, btnSaludo;
    private JTextField txtSaludo;
    private JLabel lbSup,lbInf;
    ///Constructor
    public Ventana(){
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        btnSalir=new JButton("Salir");
        btnSaludo=new JButton("Saludo");
        txtSaludo=new JTextField();
        lbSup=new JLabel("Encabezado de Mi Ventana");
        lbInf=new JLabel("Pie de mi Ventana");
        btnSaludo.setBackground(Color.BLUE);
        btnSalir.setBackground(Color.RED);
        txtSaludo.setBackground(Color.BLACK);
        txtSaludo.setForeground(Color.GREEN);
        //Colocamos los objetos en el JFrame
        Container lienzo = this.getContentPane();
        lienzo.setPreferredSize(new Dimension(400,200));
        lienzo.add(lbSup, BorderLayout.PAGE_START);
        lienzo.add(txtSaludo, BorderLayout.CENTER);
        lienzo.add(btnSalir, BorderLayout.LINE_START);
        lienzo.add(btnSaludo, BorderLayout.LINE_END);
        lienzo.add(lbInf, BorderLayout.PAGE_END);
        //Ponemos codigo a los botones
        btnSalir.addActionListener(e->salir());
        btnSaludo.addActionListener(e->saludo());
        
    }
    //---------------------------------------------------------------------
    public void salir(){
        System.exit(0);
    }
    
    public void saludo(){
        if(txtSaludo.getText().trim().length()==0){
            //No hemos escrito nada
            JOptionPane.showMessageDialog(this, "Debes escribir un mensaje, no seas timido");
        }else{
            JOptionPane.showMessageDialog(this, "Hola: " + txtSaludo.getText().trim());
            txtSaludo.setText("");
        }
    }
}
