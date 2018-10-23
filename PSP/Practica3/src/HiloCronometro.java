import javax.swing.*;

public class HiloCronometro extends Thread {
    JLabel labelCronometro;
    JButton buttonComenzar;
    String nom;

    public HiloCronometro(JLabel labelCronometro, String nom) {
        super();
        this.labelCronometro = labelCronometro;
        this.buttonComenzar = buttonComenzar;
        this.nom = nom;
    }

    @Override
    public void run() {
        int contador = Integer.parseInt(labelCronometro.getText());
        while (contador < 100) {
            contador += (int) (Math.random() * 2);
            dormir(1000);
            labelCronometro.setText(String.valueOf(contador));
            if (contador == 100) {
                JOptionPane.showMessageDialog(null, "El jugador " + nom + " ha ganado la partida");
                buttonComenzar.setEnabled(true);
            }
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
