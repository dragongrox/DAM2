package Minas1.src;

import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {
    static int[][] matriz;
    int altura = 3, anchura = 3;
    JButton[][] buttons;

    public PanelTablero(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
        buttons = new JButton[altura][];
        this.setLayout(new GridLayout(altura, anchura));
        dibujar(buttons);
    }

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

    private void dibujar(JButton[][] buttons) {

        matriz = new int[altura][anchura];
        matriz = rellenarMatriz(matriz);
        matriz = ponerMinas(matriz, 5);
        leerMatriz(matriz);

        for (int contX = 0; contX < buttons.length; contX++) {
            buttons[contX] = new JButton[anchura];
            for (int contY = 0; contY < buttons[contX].length; contY++) {
                buttons[contX][contY] = new JButton(String.valueOf(matriz[contX][contY]));
                add(buttons[contX][contY]);
            }
        }
    }
}
