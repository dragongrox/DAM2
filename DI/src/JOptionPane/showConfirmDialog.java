package JOptionPane;

import javax.swing.*;

public class showConfirmDialog {
    public static void main(String[] args) {
        int resp0 = JOptionPane.showConfirmDialog(null, "¿Esta seguro");
        int resp1 = JOptionPane.showConfirmDialog(null, "Esta seguro", "Alerta", JOptionPane.OK_CANCEL_OPTION);
        MiIcon miIcon = new MiIcon();
        int resp2 = JOptionPane.showConfirmDialog(null, "Esta seguro", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, miIcon);
        int resp3 = JOptionPane.showConfirmDialog(null, "Esta seguro", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, miIcon);
    }
}
