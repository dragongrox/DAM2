package sincronizacion.noSincronizado;

import static java.lang.Thread.sleep;

public class Metodo {
    public Metodo() {

    }

    public void contar(String nombre) {
        for (int cont = 0; cont <= 10; cont++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HiloRellenar " + nombre + ": " + cont);
        }
    }
}
