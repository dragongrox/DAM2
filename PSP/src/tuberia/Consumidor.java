package tuberia;

public class Consumidor extends Thread {

    MiLista ml;

    public Consumidor(MiLista m) {
        ml = m;
    }

    public void run() {
        while (true) {
            if (ml.milista.size() == 0) {
                System.out.println("Lista vacia, esperando");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else
                System.out.println("Consumiendo la palabra " + ml.quitar() + ", quedan: " + ml.milista.size());
        }
    }
}
