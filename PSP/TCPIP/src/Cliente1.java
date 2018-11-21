import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente1 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.err.println("Error, se esperaba direccion IP y Puerto TCP");
            System.err.println("Uso: \"java ClienteTcp1 dirIP Puerto\"");
            System.exit(-1);
        }

        InetAddress ipDestino = null;
        int puerto = 0;
        String cadI = "", cadO = "";
        Scanner teclado = new Scanner(System.in);

        try {
            ipDestino = InetAddress.getByName(args[0]);
            puerto = Integer.parseInt(args[1]);
        } catch (UnknownHostException ex) {
            System.err.println("Imposible resolver direccion Servidor, verífique sintaxis!!!");
            System.exit(-1);
        } catch (NumberFormatException ex) {
            System.err.println("Formato de puerto INVÁLIDO!!!, debe ser un numero 1-65000");
            System.exit(-1);
        }
        //--------------------------------------------------------
        try (
                Socket concli = new Socket(ipDestino, puerto);
                PrintWriter salida = new PrintWriter(concli.getOutputStream(), true);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(concli.getInputStream()));
        ) {
            cadI = entrada.readLine();
            System.out.println(cadI);
            do {
                cadO = teclado.nextLine();
                salida.println(cadO);
            } while (!cadO.equals("EXIT") || !cadO.equals("Exit") || !cadO.equals("exit"));

        } catch (Exception ex) {
        }
    }
}
