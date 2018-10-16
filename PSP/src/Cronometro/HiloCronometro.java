package Cronometro;

import javax.swing.*;

public class HiloCronometro extends Thread {
    JLabel jlCronometro;

    public HiloCronometro(JLabel jlCronometro) {
        super();
        this.jlCronometro = jlCronometro;
    }

    @Override
    public void run() {
        char[] textoSeparado = jlCronometro.getText().toCharArray();
        String texto = "";
        while (textoSeparado[0] != '9' && textoSeparado[1] != 9 && textoSeparado[3] != 5 && textoSeparado[4] != 9) {
            textoSeparado[4]++;
            if (textoSeparado[4] == ':') {
                textoSeparado[4] = '0';
                textoSeparado[3]++;
                if (textoSeparado[3] == '6') {
                    textoSeparado[3] = '0';
                    textoSeparado[1]++;
                    if (textoSeparado[1] == ':') {
                        textoSeparado[1] = '0';
                        textoSeparado[0]++;
                    }
                }
            }
            for (char c : textoSeparado)
                texto += c;
            dormir(1000);
            jlCronometro.setText(texto);
            texto = "";

        }

    }

    public void dormir(long t) {
        try {
            sleep(t);
        } catch (InterruptedException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

}
