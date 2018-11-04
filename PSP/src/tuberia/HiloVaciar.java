package tuberia;

public class HiloVaciar extends Thread {

    public HiloVaciar(char[] contenedor, int num, boolean ocupado) {
        vaciar(contenedor, num, ocupado);
    }


    public synchronized void vaciar(char[] contenedor, int num, boolean ocupado) {
        for (; num > 0; num--) {
            if (ocupado) {
                for (int cont = 0; cont < contenedor.length; cont++) {
                    contenedor[cont] = (char) (Math.random() * 100);
                    System.out.println("Se ha vaciado la casilla " + cont);
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
