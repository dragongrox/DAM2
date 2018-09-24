package manejoFicheros;

import java.io.*;

public class ej7 {

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

    public static void aniadirNumero(int num, String ruta) {
        if (num < 1) {
            System.out.println("Error. El numero es negativo");
            System.exit(0);
        }
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(ruta, true);
            pw = new PrintWriter(fichero);
            String texto = "";
            for (int cont = 0; cont <= num; cont++)
                texto = texto + (int) (Math.floor(Math.random() * 100 + 1)) + " ";
            pw.println(texto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            aniadirNumero(Integer.parseInt(introduccionTeclado("numero")), introduccionTeclado("ruta"));
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
