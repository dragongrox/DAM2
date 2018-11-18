import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    PanelPrincipal panelPrincipal;
    JMenuBar menuBar;
    JMenu menuArchivo, menuReservas, menuAyuda;
    JMenuItem itemSalir, itemAltaReservas, itemBajaReservas, itemAcercaDe;

    public Frame() {
        int altura = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2, anchura = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2;
        panelPrincipal = new PanelPrincipal();
        setBounds(anchura / 2, altura / 2, Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        setTitle("Gestión Hotel Estrella");
        setIconImage(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\T01EclipseSergeyShevchenko\\src\\hotels.png").getImage());
        add(panelPrincipal);

        menuBar = new JMenuBar();

        menuArchivo = new JMenu("Archivo");

        itemSalir = new JMenuItem("Salir");

        menuReservas = new JMenu("Reservas");

        itemAltaReservas = new JMenuItem("Alta Reservas");
        itemBajaReservas = new JMenuItem("Baja Reservas");

        menuAyuda = new JMenu("Ayuda");

        itemAcercaDe = new JMenuItem("Acerca de...");

        menuBar.add(menuArchivo);

        menuArchivo.add(itemSalir);
        itemSalir.addActionListener(e -> Salir());

        menuBar.add(menuReservas);

        menuReservas.add(itemAltaReservas);
        itemAltaReservas.addActionListener(e -> AltaReservas());
        menuReservas.add(itemBajaReservas);
        itemBajaReservas.addActionListener(e -> BajaReservas());

        menuBar.add(menuAyuda);

        menuAyuda.add(itemAcercaDe);
        itemAcercaDe.addActionListener(e -> AcercaDe());

        setJMenuBar(menuBar);
    }

    private void AcercaDe() {
    }

    private void BajaReservas() {
        JOptionPane.showMessageDialog(null, "Esta parte de la aplicacion no esta desarrollada");
    }

    private void AltaReservas() {
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


