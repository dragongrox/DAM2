package sincronizacion.noSincronizado;

public class main {
    public static void main(String[] args) {
        Metodo metodo = new Metodo();
        Hilo hilo1 = new Hilo("1", metodo);
        Hilo hilo2 = new Hilo("2", metodo);


    }
}
