import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    PanelPrincipal panelPrincipal;
    JMenuBar menuBar;
    JMenu menuArchivo, menuCoches, menuAyuda;
    JMenuItem itemSalir, itemAltaReservas, itemBajaReservas, itemAcercaDe;
    JButton button;

    public Frame() {
        int altura = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2, anchura = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2;
        panelPrincipal = new PanelPrincipal();
        setBounds(anchura / 2, altura / 2, Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        setTitle("Gestion Vehiculos");
        setIconImage(new ImageIcon("src\\icoCoches.png").getImage());
        add(panelPrincipal);

        button = new JButton("Abrir el dialogo");
        button.addActionListener(e -> Alta());
        this.add(button);

        menuBar = new JMenuBar();

        menuArchivo = new JMenu("Archivo");

        itemSalir = new JMenuItem("Salir");

        menuCoches = new JMenu("Coches");

        itemAltaReservas = new JMenuItem("Alta");
        itemBajaReservas = new JMenuItem("Baja");

        menuAyuda = new JMenu("Ayuda");

        itemAcercaDe = new JMenuItem("Acerca de...");

        menuBar.add(menuArchivo);

        menuArchivo.add(itemSalir);
        itemSalir.addActionListener(e -> Salir());

        menuBar.add(menuCoches);

        menuCoches.add(itemAltaReservas);
        itemAltaReservas.addActionListener(e -> Alta());
        menuCoches.add(itemBajaReservas);
        itemBajaReservas.addActionListener(e -> Baja());

        menuBar.add(menuAyuda);

        menuAyuda.add(itemAcercaDe);
        itemAcercaDe.addActionListener(e -> AcercaDe());

        setJMenuBar(menuBar);
    }

    private void AcercaDe() {
    }

    private void Baja() {
        JOptionPane.showMessageDialog(null, "Esta parte de la aplicacion no esta desarrollada");
    }

    private void Alta() {
        FrameDialogo frameDialogo = new FrameDialogo();
        frameDialogo.setVisible(true);
        frameDialogo.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frameDialogo.setTitle("Alta Reservas");
        setIconImage(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\T01EclipseSergeyShevchenko\\src\\hotels.png").getImage());
    }

    private void Salir() {
        System.exit(0);
    }
}


