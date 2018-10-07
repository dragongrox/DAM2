import static java.lang.Thread.sleep;

/**
 * Hacer un programa donde desde un hilo nos muestren los primeros ‘n’ números primos donde n>10 lo pasaremos como
 * parámetros y en otro hilo muestre una cuenta atrás de 15s a 1s. Tiempo de ejecución de cada hilo y del programa
 */
public class Ejercicio1 extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new numPrimos());
        Thread thread2 = new Thread(new cuentaAtras());
        long ti = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {
        }
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("Final de Programa, tiempo de Ejecucion:" + te);
    }
}

class numPrimos implements Runnable {

    public static void mostrarNPrimos(int n) {
        int i, nx = 4, cont = 2;
        String cad = "";
        if (n > 2) {
            cad = "2 - 3";
            while (cont < n) {
                i = 2;
                while (i <= nx) {
                    if (i == nx) {
                        cad = cad + " - " + nx;
                        cont = cont + 1;
                    } else {
                        if (nx % i == 0) {
                            i = nx;
                        }
                    }
                    i = i + 1;
                }
                nx = nx + 1;
            }
            System.out.println(cad);
        } else {
            if (n > 0) {
                if (n == 1) {
                    System.out.println("es primo 2");
                } else {
                    System.out.println("es primo 2, 3");
                }
            } else {
                System.out.println("ingresa numeros positivos");
            }
        }
    }

    @Override
    public void run() {
        long ti = System.currentTimeMillis();
        mostrarNPrimos(10000);
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("tiempo de ejecucion primos:" + te);
    }
}

class cuentaAtras implements Runnable {
    public static void cuentaAtras(int num) {
        int cont = 0;
        while (cont < num) {
            dormir(1000);
            System.out.println((num - cont));
            cont++;

        }
    }

    public static void dormir(long t) {
        try {
            sleep(t);
        } catch (InterruptedException ex) {
            System.err.println("Error, mensaje : " + ex.getMessage());
        }
    }

    @Override
    public void run() {
        long ti = System.currentTimeMillis();
        cuentaAtras(15);
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("tiempo de ejecucion cuenta atras:" + te);
    }
}
