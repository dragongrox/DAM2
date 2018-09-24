package manejoFicheros;

import java.io.*;
import java.util.Scanner;

public class ej6 {
    public void escribir(String ruta, String texto) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
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

    public void mostrarMayus(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                for (int cont = 0; cont < linea.length(); cont++) {
                    if (Character.isUpperCase(linea.charAt(cont)))
                        System.out.print(Character.toLowerCase(linea.charAt(cont)));
                    else {
                        if (Character.isLowerCase(linea.charAt(cont)))
                            System.out.print(Character.toUpperCase(linea.charAt(cont)));
                        else
                            System.out.print(linea.charAt(cont));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

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

    public static void main(String[] args) {
        ej6 ej6 = new ej6();
        System.out.println();
        String ruta = introduccionTeclado("ruta");
        ej6.escribir(ruta, introduccionTeclado("texto a mostrar"));
        System.out.println("Se va a mostrar el texto introducido: ");
        ej6.mostrarMayus(ruta);
    }
}
