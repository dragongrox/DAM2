package manejoFicheros;

import java.io.File;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        System.out.printf("Introduzca el directorio: ");
        Scanner scanner = new Scanner(System.in);
        String directorio = scanner.next();
        File file = new File(directorio);
        String[] lista = file.list();
        if (lista == null)
            System.out.println("No hay ficheros en el directorio especificado");
        else {
            for (String elemento : lista)
                System.out.println(elemento);
        }
    }
}
