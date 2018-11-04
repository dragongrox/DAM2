package Minas1.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelTablero extends JPanel {
    static int[][] matriz;
    int altura = 10, anchura = 10, numBanderas;
    JButton[][] buttons;
    int MINALTURA = -1, MAXALTURA, MINANCHURA = -1, MAXANCHURA;
    PanelMenu panelMenu;
    HiloCronometro hiloCronometro;


    public PanelTablero(int altura, int anchura, PanelMenu panelMenu, HiloCronometro hiloCronometro) {
        this.altura = altura;
        this.anchura = anchura;
        this.panelMenu = panelMenu;
        this.hiloCronometro = hiloCronometro;
        numBanderas = 0;
        MAXALTURA = altura;
        MAXANCHURA = anchura;
        buttons = new JButton[altura][];
        for (int contX = 0; contX < buttons.length; contX++) {
            buttons[contX] = new JButton[anchura];
            for (int contY = 0; contY < buttons[contX].length; contY++) {
                buttons[contX][contY] = new JButton();
                add(buttons[contX][contY]);
                buttons[contX][contY].setEnabled(false);
                buttons[contX][contY].addMouseListener(new BotonPulsadoListener(panelMenu));
            }
        }
        this.setLayout(new GridLayout(altura, anchura));

    }

    public void iniciar(int altura, int anchura) {
        dibujar(altura, anchura);
        for (int contX = 0; contX < buttons.length; contX++) {
            for (int contY = 0; contY < buttons[contX].length; contY++) {
                buttons[contX][contY].setEnabled(true);
                buttons[contX][contY].setText("");
                buttons[contX][contY].setIcon(null);
            }
        }
        numBanderas = 0;
        panelMenu.getLabelBanderas().setText(String.valueOf(numBanderas) + "/10");
    }

    public void desvelarBoton(int altura, int anchura) {
        if (altura < MAXALTURA && altura > MINALTURA && anchura < MAXANCHURA && anchura > MINANCHURA && buttons[altura][anchura].isEnabled() && buttons[altura][anchura].getIcon() == null) {
            if (matriz[altura][anchura] > 0 && matriz[altura][anchura] < 9) {
                buttons[altura][anchura].setText(String.valueOf(matriz[altura][anchura]));
                buttons[altura][anchura].setEnabled(false);
            } else if (matriz[altura][anchura] == 0) {
                buttons[altura][anchura].setText(String.valueOf(matriz[altura][anchura]));
                buttons[altura][anchura].setEnabled(false);
                for (int alturaActual = altura - 1; alturaActual < altura + 2; alturaActual++) {
                    for (int anchuraActual = anchura - 1; anchuraActual < anchura + 2; anchuraActual++) {
                        desvelarBoton(alturaActual, anchuraActual);
                    }
                }
            }
            if (matriz[altura][anchura] == 9) {
                buttons[altura][anchura].setIcon(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\src\\Minas1\\img\\minasexpult.png"));
                buttons[altura][anchura].setEnabled(false);
                hiloCronometro.suspend();
                desvelarTodo();
                JOptionPane.showMessageDialog(null, "Has perdido");
            }
        }

    }

    private void desvelarTodo() {
        for (int contX = 0; contX < buttons.length; contX++) {
            for (int contY = 0; contY < buttons[contX].length; contY++) {
                if (buttons[contX][contY].isEnabled()) {
                    if (matriz[contX][contY] < 9) {
                        buttons[contX][contY].setText(String.valueOf(matriz[contX][contY]));
                        buttons[contX][contY].setEnabled(false);
                    } else {
                        buttons[contX][contY].setIcon(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\src\\Minas1\\img\\minanoexp.png"));
                        buttons[contX][contY].setEnabled(false);
                    }
                }

            }
        }
    }

    private void dibujar(int altura, int anchura) {
        matriz = new int[altura][anchura];
        matriz = rellenarMatrizMinas(matriz);
        matriz = ponerMinas(matriz, 10);
        leerMatriz(matriz);
        rellenarPistas();
        System.out.println();
        leerMatriz(matriz);
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

    private void rellenarPistasAlLadoMina(int altura, int anchura) {
        for (int alturaActual = altura - 1; alturaActual < altura + 2; alturaActual++) {
            for (int anchuraActual = anchura - 1; anchuraActual < anchura + 2; anchuraActual++) {
                if (alturaActual > MINALTURA && alturaActual < MAXALTURA && anchuraActual > MINANCHURA && anchuraActual < MAXANCHURA) {
                    if (matriz[alturaActual][anchuraActual] != 9) {
                        matriz[alturaActual][anchuraActual]++;
                    }
                }
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

    class BotonPulsadoListener implements MouseListener {

        JLabel labelBanderas;

        public BotonPulsadoListener(PanelMenu panelMenu) {
            labelBanderas = panelMenu.labelBanderas;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                for (int contX = 0; contX < buttons.length; contX++) {
                    for (int contY = 0; contY < buttons[contX].length; contY++) {
                        if (buttons[contX][contY].equals(e.getSource())) {
                            if (buttons[contX][contY].getIcon() == null && numBanderas < 10) {
                                buttons[contX][contY].setIcon(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\HLC\\src\\Minas1\\img\\bandera2.jpg"));
                                numBanderas++;
                                labelBanderas.setText(String.valueOf(numBanderas) + "/10");
                            } else if (buttons[contX][contY].getIcon() != null && numBanderas > 0) {
                                buttons[contX][contY].setIcon(null);
                                numBanderas--;
                                labelBanderas.setText(String.valueOf(numBanderas) + "/10");
                            }
                        }
                    }
                }
            } else {
                int contador = 0;
                for (int contX = 0; contX < buttons.length; contX++) {
                    for (int contY = 0; contY < buttons[contX].length; contY++) {
                        if (buttons[contX][contY].equals(e.getSource())) {
                            desvelarBoton(contX, contY);
                        }
                        if (buttons[contX][contY].isEnabled()) {
                            contador++;
                        }
                    }
                }
                if (contador <= 10) {
                    desvelarTodo();
                    JOptionPane.showMessageDialog(null, "Has ganado");
                    hiloCronometro.suspend();
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}


