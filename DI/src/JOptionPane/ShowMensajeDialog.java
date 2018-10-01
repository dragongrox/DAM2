package JOptionPane;

import javax.swing.*;

public class ShowMensajeDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Metodo con dos argumentos");
        JOptionPane.showMessageDialog(null, "Mensaje ERROR_MESAGE", "mensaje en la ba", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje INFORMATION_MESSAGE", "mensaje en la ba", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje WARNING_MESSAGE", "mensaje en la ba", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje QUESTION_MESSAGE", "mensaje en la ba", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje PLAIN_MESSAGE", "mensaje en la ba", JOptionPane.PLAIN_MESSAGE);
        MiIcon miIcon = new MiIcon();
        JOptionPane.showMessageDialog(null, "Mensaje dentro de ventana", "Titulo de ventana", JOptionPane.DEFAULT_OPTION, miIcon);
    }
}
