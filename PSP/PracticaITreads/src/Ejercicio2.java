import static java.lang.Thread.sleep;

/**
 * Hacer un programa que pasado un número ‘n’ 100.000<n<1000.000 me los descomponga en factores primos
 * la salida será tipo n=a² x b⁴ x ….x 1 esto lo hará en un hilo, otro hilo me ira mostrando un saludo
 * un número de veces pasado como parámetro (entre 1 y 10) separando cada saludo por 1s y otro último
 * hilo me mostrara 10 veces separadas por un segundo “Java es Divertido”. Tiempo de ejecución de cada
 * hilo y del programa
 */
public class Ejercicio2 extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DescomponerFactores());
        Thread thread2 = new Thread(new Saludo());
        Thread thread3 = new Thread(new JavaNoEsDivertido());
        long ti = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        while (thread1.isAlive() || thread2.isAlive() || thread3.isAlive()) {
        }
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("Final de Programa, tiempo de Ejecucion:" + te);
    }
}

class DescomponerFactores implements Runnable {

    static void factor(int numero) {
        int num = 2;
        String salida = "n=";
        while (numero != 1) {
            while (numero % num == 0) {
                salida = salida + num + "x";
                numero /= num;
            }
            num++;
        }

        System.out.println(salida.substring(0, (salida.length() - 1)));
    }

    @Override
    public void run() {
        long ti = System.currentTimeMillis();
        factor(1000000);
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("tiempo de ejecucion factores:" + te);
    }
}

class Saludo implements Runnable {
    public static void cuentaAtras(int num) {
        int cont = 0;
        while (cont < num) {
            dormir(1000);
            System.out.println(("Hola"));
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
        cuentaAtras(10);
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("tiempo de ejecucion Saludos:" + te);
    }
}

class JavaNoEsDivertido implements Runnable {

    public static void cuentaAtras(int num) {
        int cont = 0;
        while (cont < num) {
            dormir(1000);
            System.out.println(("Java es Divertido"));
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
        cuentaAtras(10);
        long te = (System.currentTimeMillis() - ti) / 1000;
        System.out.println("tiempo de ejecucion Java es divertido:" + te);
    }
}
