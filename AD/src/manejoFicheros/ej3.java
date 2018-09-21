package manejoFicheros;

import java.io.File;
import java.util.Scanner;

public class ej3 {

    public static void eliminar(File file) {
        if (file.isDirectory()) {
            if (file.list().length == 0) {                       //si el directorio es un archivo se borrara
                file.delete();
            } else {
                for (String elemento : file.list()) {           //en el caso de que no lo sea se tendra que eliminar todo su contenido interior
                    File fileEliminar = new File(file, elemento);
                    eliminar(fileEliminar);                     //se volvera a usar el mismo metodo de forma recursiva
                }
                if (file.list().length == 0)                    //y cuando este vacio se elimina el archivo
                    file.delete();
            }
        } else {
            file.delete();                                      //si desde el principio era un archivo este se borrara
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca el directorio a eliminar.");
        Scanner scanner = new Scanner(System.in);
        String directorio = scanner.nextLine();
        eliminar(new File(directorio));
    }
}
