package MetodoDOM;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class metodoDOM {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\AleatorioEmple.dat");
        File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\Empleados.xml");

        RandomAccessFile file = new RandomAccessFile(fileIn, "r");

        Source source;
        Result result;
    }
}
