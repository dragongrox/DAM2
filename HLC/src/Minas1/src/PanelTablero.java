package Minas1.src;

import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {
    static int[][] matriz;
    int altura = 10, anchura = 10;
    JButton[][] buttons;

    public PanelTablero(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
        buttons = new JButton[altura][];
        this.setLayout(new GridLayout(altura, anchura));
        dibujar(buttons);
    }

    public static int[][] rellenarMatrizMinas(int[][] matriz) {
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

    private void dibujar(JButton[][] buttons) {

        matriz = new int[altura][anchura];
        matriz = rellenarMatrizMinas(matriz);
        matriz = ponerMinas(matriz, 10);
        leerMatriz(matriz);
        rellenarPistas();
        System.out.println();
        leerMatriz(matriz);

        for (int contX = 0; contX < buttons.length; contX++) {
            buttons[contX] = new JButton[anchura];
            for (int contY = 0; contY < buttons[contX].length; contY++) {
                buttons[contX][contY] = new JButton();
                add(buttons[contX][contY]);
            }
        }
    }

    private void rellenarPistas() {

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == 9) {
                    rellenarPistasAlLadoMina(x, y);
                }
            }
        }

    }

    private void rellenarPistasAlLadoMina(int x, int y) {
        int MINX = -1, MAXX = matriz.length, MINY = -1, MAXY = matriz[0].length;
        for (int xActual = x - 1; xActual < x + 2; xActual++) {
            for (int yActual = y - 1; yActual < y + 2; yActual++) {
                if (xActual > MINX && xActual < MAXX && yActual > MINY && yActual < MAXY) {
                    if (matriz[xActual][yActual] != 9) {
                        matriz[xActual][yActual]++;
                    }
                }
            }

        }
    }
}
