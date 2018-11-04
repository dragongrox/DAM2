package tuberia;

import static javax.swing.SwingUtilities.invokeLater;

public class main {


    public static void ejecutar() {
        char[] contenedor = new char[10];
        int num = 100;
//        HiloRellenar hiloRellenar = new HiloRellenar(contenedor, num);
//        HiloVaciar hiloVaciar = new HiloVaciar(contenedor, num);
//        hiloRellenar.start();
//        hiloVaciar.start();
    }

    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                ejecutar();
            }
        });

    }


}
