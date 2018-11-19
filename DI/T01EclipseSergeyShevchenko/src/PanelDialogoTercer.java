import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class PanelDialogoTercer extends JPanel {
    JLabel labelFechaEntrada, labelFechaSalida, labelNumeroDiasEstancia, labelTipoHabitacion,
            labelNumeroHabitaciones, labelNinos, labelExtrasNinos, labelImagenHotel, labelImporteHabitacion;
    JSpinner spinnerFechaEntrada, spinnerFechaSalida;
    JLabel labelNumeroDias;
    JComboBox<String> comboBoxTipoHabitacion;
    JSpinner spinnerNumeroHabitaciones;
    JCheckBox checkBoxNinos;
    PanelExtrasNinos panelExtrasNinos;
    JLabel labelImagen, labelImporte;
    Calendar calendarEntrada, calendarSalida;

    public PanelDialogoTercer() {
        //Declaracion de label
        labelFechaEntrada = new JLabel("Fecha Entrada");
        labelFechaSalida = new JLabel("Fecha Salida");
        labelNumeroDiasEstancia = new JLabel("Nº de dias estancia");
        labelTipoHabitacion = new JLabel("Tipo de habitacion");
        labelNumeroHabitaciones = new JLabel("Nº de habitaciones");
        labelNinos = new JLabel("¿Niños?");
        labelExtrasNinos = new JLabel("Extras Niños");
        labelImagenHotel = new JLabel("Imagen del Hotel");
        labelImporteHabitacion = new JLabel("Importe habitacion");

        //Declaracion de campos
        SpinnerModel spinnerModel1 = new SpinnerDateModel();
        spinnerFechaEntrada = new JSpinner(spinnerModel1);
        calendarEntrada = Calendar.getInstance();
        spinnerFechaEntrada.setValue(calendarEntrada.getTime());
        JComponent editor = new JSpinner.DateEditor(spinnerFechaEntrada, "dd/MM/yyyy");
        spinnerFechaEntrada.setEditor(editor);
        SpinnerModel spinnerModel2 = new SpinnerDateModel();
        spinnerFechaSalida = new JSpinner(spinnerModel2);
        calendarSalida = Calendar.getInstance();
        calendarSalida.set(Calendar.DATE, calendarSalida.getTime().getDate() + 1);
        spinnerFechaSalida.setValue(calendarSalida.getTime());
        JComponent editor1 = new JSpinner.DateEditor(spinnerFechaSalida, "dd/MM/yyyy");
        spinnerFechaSalida.setEditor(editor1);

        labelNumeroDias = new JLabel(String.valueOf(DiferenciaDias()));

        comboBoxTipoHabitacion = new JComboBox<String>();
        comboBoxTipoHabitacion.addItem("Simple");
        comboBoxTipoHabitacion.addItem("Doble");
        comboBoxTipoHabitacion.addItem("Suite");

        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 50, 1);
        spinnerNumeroHabitaciones = new JSpinner(spinnerModel);

        checkBoxNinos = new JCheckBox();

        panelExtrasNinos = new PanelExtrasNinos();
        panelExtrasNinos.setVisible(false);

        labelImagen = new JLabel(new ImageIcon("C:\\Users\\drago\\IdeaProjects\\DAM2\\DI\\T01EclipseSergeyShevchenko\\src\\ImagenHotel.jpg"));

        labelImporte = new JLabel();
        labelImporte.setText(String.valueOf(ImporteHabitacion()));

        //Declaracion del Layout
        JPanel panelDatos = new JPanel();

        Container container = panelDatos;
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelFechaEntrada)
                                .addComponent(labelFechaSalida)
                                .addComponent(labelNumeroDiasEstancia)
                                .addComponent(labelTipoHabitacion)
                                .addComponent(labelNumeroHabitaciones)
                                .addComponent(labelNinos)
                                .addComponent(panelExtrasNinos)
                                .addComponent(labelImporteHabitacion))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(spinnerFechaEntrada)
                                .addComponent(spinnerFechaSalida)
                                .addComponent(labelNumeroDias)
                                .addComponent(comboBoxTipoHabitacion)
                                .addComponent(spinnerNumeroHabitaciones)
                                .addComponent(checkBoxNinos)
                                .addComponent(panelExtrasNinos)
                                .addComponent(labelImporte))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFechaEntrada)
                                .addComponent(spinnerFechaEntrada))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFechaSalida)
                                .addComponent(spinnerFechaSalida))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNumeroDiasEstancia)
                                .addComponent(labelNumeroDias))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTipoHabitacion)
                                .addComponent(comboBoxTipoHabitacion))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNumeroHabitaciones)
                                .addComponent(spinnerNumeroHabitaciones))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNinos)
                                .addComponent(checkBoxNinos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelExtrasNinos))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelImporteHabitacion)
                                .addComponent(labelImporte))

        );

        Container containerPrincipal = this;

        GroupLayout groupLayoutPrincipal = new GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(groupLayoutPrincipal);

        groupLayoutPrincipal.setAutoCreateGaps(true);
        groupLayoutPrincipal.setAutoCreateContainerGaps(true);

        groupLayoutPrincipal.setHorizontalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(panelDatos))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelImagen))
        );

        groupLayoutPrincipal.setVerticalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panelDatos)
                                .addComponent(labelImagen))
        );

        //Puesta en escucha de los elementos
        checkBoxNinos.addActionListener(e -> ExtrasNinos());
        spinnerFechaEntrada.addChangeListener(e -> DiferenciaDias());
        spinnerFechaSalida.addChangeListener(e -> DiferenciaDias());
    }

    private Double ImporteHabitacion() {
        double importe = 0;
        importe = DiferenciaDias() * TipoHabitacion() * Integer.parseInt(spinnerNumeroHabitaciones.getValue().toString());
        if (checkBoxNinos.isSelected()) {

        }
        return importe;
    }

    private int TipoHabitacion() {
        if (comboBoxTipoHabitacion.getItemAt(comboBoxTipoHabitacion.getSelectedIndex())
                .equals(comboBoxTipoHabitacion.getItemAt(0)))
            return 50;
        else if (comboBoxTipoHabitacion.getItemAt(comboBoxTipoHabitacion.getSelectedIndex())
                .equals(comboBoxTipoHabitacion.getItemAt(1)))
            return 75;
        else return 125;
    }

    private void ExtrasNinos() {
        if (checkBoxNinos.isSelected()) {
            panelExtrasNinos.setVisible(true);
        } else
            panelExtrasNinos.setVisible(false);
    }

    private int DiferenciaDias() {
        /*SimpleDateFormat formatter = new SimpleDateFormat();
        try {
            calendarSalida.setTime(formatter.parse(spinnerFechaSalida.getValue().toString()));
            calendarEntrada.setTime(formatter.parse(spinnerFechaEntrada.getValue().toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        return calendarSalida.getTime().getDate() - calendarEntrada.getTime().getDate();
    }
}
