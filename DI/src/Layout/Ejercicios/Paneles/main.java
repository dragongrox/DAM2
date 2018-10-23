package Layout.Ejercicios.Paneles;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Crea esta interfaz con tres paneles:
 * PanelPrincipal contiene a Panel1, Panel2 y los cuatro botones. Utiliza un seLayout(null).
 * La funcionalidad de los botones es la siguiente:
 * Ocultar Panel2: al hacer un clic sobre el el Panel2 se oculta.
 * Mostrar Panel2: al hacer un clic sobre el el Panel2 se muestra.
 * Reiniciar Datos: los campos nombre y apellidos se ponen en blanco y el cursor se posiciona en el
 * campo de texto de nombre.
 * Aceptar: comprueba sí se han introducido datos en los campos nombre y apellidos, sí es así nos aparecerá
 * un mensaje que nos indica que se han guardado los datos y se reinician los datos, si no
 * se han introducido datos en alguno de los campos nos indicara que faltan datos.
 */
public class main {
    public static void mostrar() {
        Frame v = new Frame();
        v.setTitle("Ventana Confirmacion");
        v.setBounds(250, 250, 600, 600);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrar();
            }
        });

    }
}
