package cajeras.caj2;

import static java.lang.Thread.sleep;

public class Cajera {

    public static void main(String[] args) {

    }

    public void procesandoCompras(Cliente cliente) {
        long ti = System.currentTimeMillis();
        System.out.println("Procesando compra de : " + cliente.getNombreCliente());
        for (int i = 0; i < cliente.getCarritoC1().length; i++) {
            try {
                sleep(1000 * cliente.getCarritoC1()[i]);
            } catch (Exception e) {

            }
        }
    }
}
