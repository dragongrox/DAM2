/**
 * Hacer un programa donde desde un hilo nos muestren los primeros ‘n’ números primos donde n>10 lo pasaremos como
 * parámetros y en otro hilo muestre una cuenta atrás de 15s a 1s. Tiempo de ejecución de cada hilo y del programa
 */
public class Ejercicio1 extends Thread {
    public Ejercicio1(String s) {
        super(s);
    }

    public static void main(String[] args) {
        Ejercicio1 ca = new Ejercicio1("hilo1");
        ca.start(); //lanzo un hilo el programa sigue en ejecucion
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
        System.out.println("Calculando numeros n");
        for (int cont = 1, n = 0; n <= 1000; cont++) {
            boolean primo = true;
            for (int div = 2; div < cont && primo == true; div++) {
                Float sol = Float.valueOf(cont % div);
                if (sol == 0) {
                    primo = false;
                    System.out.println(n + " es un numero primo");
                    n++;
                }
            }
        }
    }
}
