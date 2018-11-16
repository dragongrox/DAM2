import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {
    public static void main(String[] args) {
        byte[] mensaje;
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(12000);
            System.out.println("Se ha creado la conexion");

            socket.setSoTimeout(300000);

            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                socket.receive(datagramPacket);
                System.out.println(datagramPacket.getData().toString());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
