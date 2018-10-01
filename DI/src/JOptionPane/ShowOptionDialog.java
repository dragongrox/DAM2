package JOptionPane;

import javax.swing.*;

public class ShowOptionDialog {
    public static void main(String[] args) {
        MiIcon miIcon = new MiIcon();
        String[] opciones = {"Op1", "Op2", "Op3", "Op4"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona un opcion", "Mensaje de Dialogo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, miIcon, opciones, opciones[2]);

    }
}
