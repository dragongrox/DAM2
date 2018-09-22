package manejoFicheros;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ej4 {

    public static void filtro(File file, Date fechaSuperior, Date fechaInferior) {
        for (String elemento : file.list()) {
            File fileFecha = new File(file.getAbsolutePath() + "\\" + elemento);
            FileFilter fileFilter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.lastModified() >= fechaInferior.getTime() && pathname.lastModified() <= fechaSuperior.getTime()) {
                        return true;
                    } else return false;
                }
            };
            if (fileFilter.accept(fileFecha)) {
                System.out.println(elemento);
            }
        }
    }

    public static Date parseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public static void main(String[] args) {
        filtro(new File("C:\\"), parseFecha("22/09/2018"), parseFecha("10/09/2018"));
    }
}
