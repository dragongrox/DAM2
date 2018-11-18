import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class PanelDialogoSegundo extends JPanel {

    JTextField textFieldNombre, textFieldApellidos, textFieldDireccion;
    JFormattedTextField textFieldTelefono;
    JLabel labelNombre, labelApellidos, labelDireccion, labelTelefono;

    public PanelDialogoSegundo() {
        labelNombre = new JLabel("Nombre:");
        labelApellidos = new JLabel("Apellidos:");
        labelDireccion = new JLabel("Direccion:");
        labelTelefono = new JLabel("Telefono:");

        textFieldNombre = new JTextField();
        textFieldApellidos = new JTextField();
        textFieldDireccion = new JTextField();

        MaskFormatter formatterTelefono = new MaskFormatter();
        try {
            formatterTelefono = new MaskFormatter("#########");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        textFieldTelefono = new JFormattedTextField(formatterTelefono);

        setLayout(new GridLayout(4, 2, 15, 15));
        add(labelNombre);
        add(textFieldNombre);
        add(labelApellidos);
        add(textFieldApellidos);
        add(labelDireccion);
        add(textFieldDireccion);
        add(labelTelefono);
        add(textFieldTelefono);

    }
}
