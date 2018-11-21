import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor1 {
    public static void main(String[] args) {
        int PTO = 15000;
        String cad = " ";
        System.out.println("## Servidor Activo y Aceptando Una Conexion ##");
        try (
                ServerSocket tuberia = new ServerSocket(PTO);
                Socket conex = tuberia.accept();
                BufferedReader IN = new BufferedReader(new InputStreamReader(conex.getInputStream()));
                PrintWriter OUT = new PrintWriter(conex.getOutputStream(), true);
        ) {

            System.out.println("Se ha conectado una maquina remota, IP=" + conex.getInetAddress());
            //Mandando Mensaje de bienvenida al cliente
            OUT.println("Conectado con el Servidor: " + conex.getInetAddress() + ":" + conex.getPort());
            while (true) {
                cad = IN.readLine();
                System.out.println(cad.trim());
                if (cad == null || cad.equals("Exit") || cad.equals("exit")) {
                    System.out.println("El usuario cerro la conexion!!!");
                    break;
                }
            }
        } catch (Exception ex) {

        }
    }

}