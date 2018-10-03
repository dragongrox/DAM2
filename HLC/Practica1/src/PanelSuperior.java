import javax.swing.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PanelSuperior extends JPanel {
    JLabel labelTexto, labelTiempo;

    PanelSuperior() {

        Calendar cal = Calendar.getInstance();
        Date fecha = cal.getTime();
        DateFormat formatter = DateFormat.getTimeInstance();
        labelTexto = new JLabel("La hora de la ejecucion del programa es ");
        add(labelTexto);
        labelTiempo = new JLabel(formatter.format(fecha));
        add(labelTiempo);

    }
}
