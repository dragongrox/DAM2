package manejoFicheros;

import java.io.*;

public class ej5 implements Serializable {

    public ej5() {
    }

    public void anidar(File file1, File file2) throws IOException {
        ObjectOutputStream objectOutputStream = null;
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file1, true));
        FileReader fr = new FileReader(file2);
        BufferedReader br = new BufferedReader(fr);
        String texto = br.readLine();
        objectOutputStream.writeChars(texto);

    }

    public static void main(String[] args) {
        File file1 = new File("C:\\Nuevo documento de texto.txt");
        File file2 = new File("C:\\Nuevo documento de texto2.txt");
        ej5 ej5 = new ej5();
        try {
            ej5.anidar(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
