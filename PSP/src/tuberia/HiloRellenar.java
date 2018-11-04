package tuberia;

public class HiloRellenar extends Thread {
    public HiloRellenar(char[] contenedor, int num, boolean ocupado) {
        rellenar(contenedor, num, ocupado);
    }

    public synchronized void rellenar(char[] contenedor, int num, boolean ocupado) {
        for (; num > 0; num--) {
            ocupado = true;
            for (int cont = 0; cont < contenedor.length; cont++) {
                if (!ocupado) {
                    contenedor[cont] = (char) (Math.random() * 100);
                    System.out.println("Se ha rellenado la casilla " + cont + " con " + contenedor[cont]);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
