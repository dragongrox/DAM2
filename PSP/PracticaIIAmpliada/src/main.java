import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Thread.sleep;

public class main {

    public static lavado[] intercambio(lavado[] array) {

        //Usamos un bucle anidado
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].tiempo > array[j].tiempo) {
                    lavado variableauxiliar = array[i];
                    array[i] = array[j];
                    array[j] = variableauxiliar;

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        lavado[] array = new lavado[4];
        for (int cont = 0; cont < array.length; cont++) {
            boolean errores = false;
            int tamaño = 0, tipo = 0;
            do {
                errores = false;
                try {
                    System.out.println("Introduce el tamaño del coche(0 pequeño,1 mediano,2 grande");
                    tamaño = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Introduce el tipo de lavado(0 normal,1 extra,2 super)");
                    tipo = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    System.out.println("Se produjo un error");
                } catch (NumberFormatException e) {
                    System.out.println("Tipo de dato no valido");
                }
                if (tamaño < 0 || tamaño > 2 || tipo < 0 || tipo > 2) {
                    errores = true;
                    System.out.println("Datos introducidos no validos");
                }
            } while (errores);
            array[cont] = new lavado(tamaño, tipo, "Coche" + String.valueOf(cont));
        }

        array = intercambio(array);

        Thread thread1 = new Thread(array[0]);
        Thread thread2 = new Thread(array[1]);
        thread1.start();
        thread2.start();
        while (thread1.isAlive()) {
        }
        thread1 = new Thread(array[2]);
        thread1.start();
        while (thread2.isAlive()) {
        }
        thread2 = new Thread(array[3]);
        thread2.start();
        while (thread2.isAlive()) {
        }


    }
}

/**
 * Los coches a lavar pueden tener tres tamaños:  pequeño,
 * mediano y grande. El lavadero tiene unos operarios que lavan coches y cada lavado puede ser normal, extra y super.
 * Los tiempos de lavado variarán en función del tamaño y del tipo de coche. El lavado normal de un coche pequeño es
 * 10s, cada lavado superior se incrementa en 2 s. y cada tamaño de coche superior en 4s, por ejemplo el lavado extra
 * de un coche grande sería 10s + 4s + 4s + 2s + 2s = 22s
 */
class lavado implements Runnable {
    int tamaño, tipo, tiempo;
    String nombre;

    public lavado(int tamaño, int tipo, String nombre) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        tiempo = tamaño * 2 + tipo * 4 + 10;
        this.nombre = nombre;
    }

    public static void dormir(long t) {
        try {
            sleep(t);
        } catch (InterruptedException ex) {
            System.err.println("Error, mensaje : " + ex.getMessage());
        }
    }

    public void lavado() {

        System.out.println("Se ha mpezando a lavar " + nombre);
        cuentaAtras(tamaño * 2 + tipo * 4 + 10);
        System.out.println("Se ha terminado de lavar " + nombre);
    }

    public void cuentaAtras(int num) {
        int cont = 0;
        while (cont < num) {
            dormir(1000);
            System.out.println((num - cont) + "< " + this.nombre);
            cont++;
        }
    }

    @Override
    public void run() {
        lavado();
    }
}


