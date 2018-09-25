package MetodoDOM;

import java.io.IOException;
import java.io.RandomAccessFile;

public class leerEmpleado {
    public static String leerString(RandomAccessFile accessFile) throws IOException {
        String texto = "";
        byte caracter = 0;
        do {
            caracter = accessFile.readByte();
            if (caracter != -1) {
                texto = texto + (char) (caracter);
            }
        } while (caracter != -1);
        return texto;
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\AleatorioEmple.dat", "r");
        System.out.println(accessFile.readInt());
        System.out.println(leerString(accessFile));
        accessFile.readInt();
        System.out.println(leerString(accessFile));
        accessFile.readInt();
        System.out.println(accessFile.readDouble());
        accessFile.close();
    }
}
