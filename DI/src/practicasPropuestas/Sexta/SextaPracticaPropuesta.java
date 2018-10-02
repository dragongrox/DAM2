package practicasPropuestas.Sexta;

import javax.swing.*;

/**
 * Crea una ventana que al ejecutarse muestre un cuadro de opciones que sean (abrir, cerrar, guardar, cancelar), se se ha
 * elegido la opcion guardar debe aparecer unmensaje de dialogo indicando que el dato se ha guardado, si no un mensaje con
 * el texto de "Continuar"
 */
public class SextaPracticaPropuesta {
    public static void main(String[] args) {
        String[] opciones = {"abrir", "cerrar", "guardar", "cancelar"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "Selecciona un opcion", "Mensaje de Dialogo",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[2]);
        if (seleccion == 2) {
            JOptionPane.showMessageDialog(null, "El dato se ha guardado");
        } else if (seleccion == 3) {
            JOptionPane.showConfirmDialog(null, "Continuar");
        }
    }
}
