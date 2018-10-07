public class main {
    static int[][] matriz;

    public static int[][] rellenarMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = 0;
            }
        }
        return matriz;
    }

    public static void leerMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("\t" + matriz[x][y]);
            }
            System.out.println();
        }
    }

    public static int[][] ponerMinas(int[][] matriz, int numeroMinas) {
        System.out.println();
        for (int cont = 0; cont < numeroMinas; ) {
            int x = (int) Math.floor(Math.random() * matriz.length);
            int y = (int) Math.floor(Math.random() * matriz[x].length);
            if (matriz[x][y] == 0) {
                matriz[x][y] = 9;
                cont++;
            }
        }
        System.out.println();
        return matriz;
    }

    public static int[][] rodearMinas(int[][] matriz, int x, int y) {

        return matriz;
    }

    public static int[][] completarMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == 9)
                    matriz = rodearMinas(matriz, x, y);
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        matriz = new int[4][4];
        matriz = rellenarMatriz(matriz);
        leerMatriz(matriz);
        matriz = ponerMinas(matriz, 5);
        leerMatriz(matriz);
    }
}
