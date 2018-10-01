package JOptionPane;

import javax.swing.*;

public class showImputDialog {
    public static void main(String[] args) {
        String resp0 = JOptionPane.showInputDialog("Escribe tu nombre");
        String resp1 = JOptionPane.showInputDialog(null, "esc");
        String resp2 = JOptionPane.showInputDialog("Escribe tu apellido", "Lopez");
        String reso3 = JOptionPane.showInputDialog(null, "Escriba de nuevo su nombre", "Error");
        String[] modulos = {"AD", "SGE", "DI", "PSP", "DM"};
        MiIcon miIcon = new MiIcon();
        /*String resp4=(String) JOptionPane.showInputDialog(null,"Selecciona un modulo a cursar","MODULOS",miIcon,modulos,modulos[2]);*/
    }
}
