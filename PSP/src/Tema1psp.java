import java.io.IOException;

public class Tema1psp {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("gedit");
        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
