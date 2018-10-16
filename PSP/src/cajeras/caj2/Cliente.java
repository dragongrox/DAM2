package cajeras.caj2;

import java.util.Arrays;

public class Cliente {
    private String nombreCliente;
    private int[] carritoC1;

    public Cliente(String nombreCliente, int[] carritoC1) {
        nombreCliente = nombreCliente;
        carritoC1 = carritoC1;
    }

    public Cliente() {

    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int[] getCarritoC1() {
        return carritoC1;
    }

    public void setCarritoC1(int[] carritoC1) {
        this.carritoC1 = carritoC1;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", carritoC1=" + Arrays.toString(carritoC1) +
                '}';
    }
}