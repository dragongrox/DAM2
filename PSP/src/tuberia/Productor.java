package tuberia;

public class Productor extends Thread {

    MiLista ml;

    public Productor(MiLista m) {
        ml = m;
    }

    public void run() {
        while (true) {
            if (ml.milista.size() > 10) {
                System.out.println("Lista llena, esperando");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Generando la palabra");
                ml.ponerDato("algo");
            }
        }
    }
}
