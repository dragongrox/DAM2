package ComponenetesAtomicos.ComponentesSwing1_8.ej7;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Frame extends JFrame {
    JMenuBar menuBar;
    JMenu menuArchivo, menuEdicion, menuOpciones, menuAcercaDe;
    JMenuItem menuItemNuevo, menuItemAbrir, menuItemGuardar, menuItemSalir;
    JMenuItem menuItemCopiar, menuItemPegar;
    JMenu menuGirar;
    JMenuItem menuItemVertical, menuItemHorizontal;
    JCheckBox checkBoxCheck1, checkBoxCheck2;
    JRadioButton radioButtonRadio1, radioButtonRadio2;
    JPanel panel;
    JMenuItem menuItemEmergente1, menuItemEmergente2;
    JPopupMenu popupMenu;

    public Frame() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        menuBar = new JMenuBar();

        menuArchivo = new JMenu("Archivo");
        menuEdicion = new JMenu("Edicion");
        menuOpciones = new JMenu("Opciones");
        menuAcercaDe = new JMenu("Acerca de...");

        menuItemNuevo = new JMenuItem("Nuevo");
        menuItemAbrir = new JMenuItem("Abrir");
        menuItemGuardar = new JMenuItem("Guardar");
        menuItemSalir = new JMenuItem("Salir");

        menuItemCopiar = new JMenuItem("Copiar");
        menuItemPegar = new JMenuItem("Pegar");

        menuGirar = new JMenu("Girar");

        menuItemVertical = new JMenuItem("Verticar");
        menuItemHorizontal = new JMenuItem("Horizontal");

        checkBoxCheck1 = new JCheckBox("Check1");
        checkBoxCheck2 = new JCheckBox("Check2");

        radioButtonRadio1 = new JRadioButton("Radio1");
        radioButtonRadio2 = new JRadioButton("Radio2");

        menuBar.add(menuArchivo);
        menuBar.add(menuEdicion);
        menuBar.add(menuOpciones);
        menuBar.add(menuAcercaDe);

        menuArchivo.add(menuItemNuevo);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemAbrir);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemSalir);

        menuEdicion.add(menuItemCopiar);
        menuEdicion.add(menuItemPegar);
        menuEdicion.add(menuGirar);

        menuGirar.add(menuItemVertical);
        menuGirar.add(menuItemHorizontal);

        menuOpciones.add(checkBoxCheck1);
        menuOpciones.add(checkBoxCheck2);
        menuOpciones.add(radioButtonRadio1);
        menuOpciones.add(radioButtonRadio2);

        setJMenuBar(menuBar);

        panel = new JPanel();
        panel.setLayout(null);
        menuItemEmergente1 = new JMenuItem("Opcion Emergente 1");
        menuItemEmergente2 = new JMenuItem("Opcion Emergente 2");
        popupMenu = new JPopupMenu();
        popupMenu.add(menuItemEmergente1);
        popupMenu.add(menuItemEmergente2);
        panel.setComponentPopupMenu(popupMenu);
        add(panel);

        menuAcercaDe.addMenuListener(new Evento());

    }
}

class Evento implements MenuListener {

    @Override
    public void menuSelected(MenuEvent e) {
        JOptionPane.showMessageDialog(null, "Esta es una aplicacion con el fin de exponer" +
                "\nde forma sencilla el funcionamiento basico de los" +
                "\ncomponentes de los menus");
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
