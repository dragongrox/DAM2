package sincronizacion.noSincronizado;

public class Hilo {
    public Hilo(String nombre, Metodo metodo) {
        metodo = new Metodo();
        metodo.contar(nombre);
    }
}
