package tuberia;

import java.util.ArrayList;

public class MiLista {
    public ArrayList<String> milista = new ArrayList<>();

    public synchronized void ponerDato(String c) {
        milista.add(c);
        notify();
    }

    public synchronized String quitar() {
        if (milista.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String cadena = milista.get(0);
        milista.remove(0);
        return cadena;
    }
}
