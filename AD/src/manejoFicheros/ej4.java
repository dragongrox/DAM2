package manejoFicheros;

import java.io.File;
import java.util.Date;

public class ej4 {

    public static void filtro(File file, Date fechaSuperior, Date fechaInferior) {
        for (String elemento : file.list()) {
            File fileFecha = new File(file.getAbsolutePath() + "\\" + elemento);
            if (fileFecha.lastModified() <= fechaSuperior.getTime() && fileFecha.lastModified() >= fechaInferior.getTime()) {
                System.out.println(elemento);
            }
        }
    }

    public static void main(String[] args) {
        filtro(new File("C:\\"), new Date(12312312310L), new Date(134123245123521353L));
    }
}
