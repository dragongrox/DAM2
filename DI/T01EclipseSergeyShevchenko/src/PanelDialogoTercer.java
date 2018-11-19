import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.Calendar;

public class PanelDialogoTercer extends JFrame {
    JLabel labelFechaEntrada, labelFechaSalida, labelNumeroDiasEstancia, labelTipoHabitacion,
            labelNumeroHabitaciones, labelNinos, labelExtrasNinos, labelImagenHotel, labelImporteHabitacion;
    JFormattedTextField textFieldFechaEntrada, textFieldFechaSalida;
    JTextField textFieldNumeroDiasEstancia;
    JComboBox<String> comboBoxTipoHabitacion;

    public PanelDialogoTercer() {
        labelFechaEntrada = new JLabel("Fecha Entrada");
        labelFechaSalida = new JLabel("Fecha Salida");
        labelNumeroDiasEstancia = new JLabel("Nº de dias estancia");
        labelTipoHabitacion = new JLabel("Tipo de habitacion");
        labelNumeroHabitaciones = new JLabel("Nº de habitaciones");
        labelNinos = new JLabel("¿Niños?");
        labelExtrasNinos = new JLabel("Extras Niños");
        labelImagenHotel = new JLabel("Imagen del Hotel");
        labelImporteHabitacion = new JLabel("Importe habitacion");

        MaskFormatter mascaraFecha = new MaskFormatter();
        try {
            mascaraFecha = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        textFieldFechaEntrada = new JFormattedTextField(mascaraFecha);
        textFieldFechaSalida = new JFormattedTextField(mascaraFecha);

        Calendar c = Calendar.getInstance();
        textFieldFechaEntrada.setText(String.valueOf(c.get(Calendar.DATE)) + "/"
                + String.valueOf(c.get(Calendar.MONTH)) + "/"
                + String.valueOf(c.get(Calendar.YEAR)));
        textFieldFechaSalida.setText(String.valueOf(c.get(Calendar.DATE)) + "/"
                + String.valueOf(c.get(Calendar.MONTH)) + "/"
                + String.valueOf(c.get(Calendar.YEAR)));

        textFieldNumeroDiasEstancia = new JTextField(DiferenciaDias());

        comboBoxTipoHabitacion = new JComboBox<String>();
        comboBoxTipoHabitacion.addItem("Simple");
        comboBoxTipoHabitacion.addItem("Doble");
        comboBoxTipoHabitacion.addItem("Suite");

        Container container = this.getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelFechaEntrada)
                                .addComponent(textFieldFechaEntrada))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelFechaSalida)
                                .addComponent(textFieldFechaSalida))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelNumeroDiasEstancia)
                                .addComponent(textFieldNumeroDiasEstancia))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelTipoHabitacion)
                                .addComponent(comboBoxTipoHabitacion))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelNumeroHabitaciones))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelNinos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelExtrasNinos))

        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFechaEntrada)
                                .addComponent(labelFechaSalida)
                                .addComponent(labelNumeroDiasEstancia)
                                .addComponent(labelTipoHabitacion)
                                .addComponent(labelNumeroHabitaciones)
                                .addComponent(labelNinos)
                                .addComponent(labelExtrasNinos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldFechaEntrada)
                                .addComponent(textFieldFechaSalida)
                                .addComponent(textFieldNumeroDiasEstancia)
                                .addComponent(comboBoxTipoHabitacion))
        );

        pack();
    }

    private int DiferenciaDias() {
        return 0;
    }
}
