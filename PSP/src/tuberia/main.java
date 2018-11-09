package tuberia;

import static javax.swing.SwingUtilities.invokeLater;

public class main {

    public static void ejecutar() {
        MiLista miLista = new MiLista();
        Productor productor = new Productor(miLista);
        Consumidor consumidor = new Consumidor(miLista);
        productor.start();
        consumidor.start();
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
