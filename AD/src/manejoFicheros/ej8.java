package manejoFicheros;

import java.io.*;

public class ej8 implements Serializable {

    public static String introduccionTeclado(String motivo) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Introduzca " + motivo + ": ");
        try {
            return br.readLine();
        } catch (IOException e) {
            return "error de lectura";
        }
    }

    public static void introducirDatos(String ruta, Empleado empleado) throws IOException {
        int tamanio = 168;
        RandomAccessFile fichero = new RandomAccessFile(ruta, "rw");

        fichero.seek(fichero.length());
        fichero.writeInt((int) (fichero.length() / tamanio));
        fichero.writeBytes(empleado.apellido);
        fichero.writeBytes(empleado.departamento);
        fichero.writeFloat(empleado.salario);
        /*for (int cont = (int) fichero.length();cont<=(fichero.length()/164+1)*164;cont++)*/
        fichero.skipBytes((int) (fichero.length() - (fichero.length() / tamanio * tamanio)));
        fichero.close();
    }

    public static void leerID(String ruta, int ID) throws IOException {
        int tamanio = 168;
        RandomAccessFile fichero = new RandomAccessFile(ruta, "rw");
        fichero.seek(ID * tamanio + 1);
        fichero.readInt();
        System.out.println(fichero.readLine() + fichero.readLine() + fichero.readFloat());
        fichero.close();
    }


    public static void main(String[] args) {
        try {
            introducirDatos("C:\\Pruebas\\Empleados.xml", new Empleado(introduccionTeclado("Apellido"), introduccionTeclado("Departamento"), Float.parseFloat(introduccionTeclado("salario"))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            leerID("C:\\Pruebas\\Empleados.xml", Integer.parseInt(introduccionTeclado("Identificador")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
