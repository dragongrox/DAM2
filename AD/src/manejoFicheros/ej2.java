package manejoFicheros;

import java.io.File;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        System.out.printf("Introduzca el directorio: ");
        Scanner scanner = new Scanner(System.in);
        String directorio = scanner.next();
        File file = new File(directorio);
        String[] lista = file.list();
        String[] subLista;
        if (lista == null)
            System.out.println("No hay ficheros en el directorio especificado");
        else {
            for (String elemento : lista) {
                if (elemento.contains("."))
                    System.out.println(elemento);
                else {
                    System.out.println(elemento);
                    file = new File(directorio + "\\" + elemento);
                    subLista = file.list();
                    if (lista == null)
                        System.out.println("No hay ficheros en el directorio especificado");
                    else
                        for (String e : lista) {
                            System.out.println("\t" + e);
                        }
                }
            }
        }
    }
}
