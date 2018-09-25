package MetodoDOM;

import java.io.IOException;
import java.io.RandomAccessFile;

public class crearEmpleado {
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\AleatorioEmple.dat", "rw");
        accessFile.writeInt(1);
        accessFile.writeChars("Informatica");
        accessFile.writeInt(-1);
        accessFile.writeChars("Shevchenko");
        accessFile.writeInt(-1);
        accessFile.writeDouble(1223);
        accessFile.writeInt(-1);
    }
}
