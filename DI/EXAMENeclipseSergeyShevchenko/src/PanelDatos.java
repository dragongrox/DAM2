import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Calendar;

public class PanelDatos extends JPanel {
    JLabel labelCodigo, labelMarca, labelTipoMotor, labelTipoVehiculo, labelTipoCambio, labelFecha, labelNombreProveedor, labelTelefono, labelPrecio, labelPVP;
    JTextField textFieldCodigo, textFieldMarca;
    JComboBox<String> comboBoxMotor, comboBoxTipoVehiculo, comboBoxCambio;
    JSpinner spinnerFecha;
    JTextField textFieldNombreProveedo;
    JFormattedTextField textFieldTelefono;
    JTextField textFieldCoste, textFieldPVP;
    Calendar calendar;
    JButton buttonAceptar, buttonCancelar;
    MaskFormatter mascaraNumero;

    public PanelDatos() {
        buttonAceptar = new JButton("Aceptar");
        buttonCancelar = new JButton("Cancelar");

        labelCodigo = new JLabel("Codigo: ");
        labelMarca = new JLabel("Marca: ");
        labelTipoMotor = new JLabel("Tipo de motor: ");
        labelTipoVehiculo = new JLabel("Tipo de vehiculo: ");
        labelTipoCambio = new JLabel("Tipo de cambio: ");
        labelFecha = new JLabel("Fecha de alta: ");
        labelNombreProveedor = new JLabel("Nombre Proveedor: ");
        labelTelefono = new JLabel("Telefono de contacto: ");
        labelPrecio = new JLabel("Precio de coste: ");
        labelPVP = new JLabel("P.V.P.: ");

        textFieldCodigo = new JTextField();
        textFieldMarca = new JTextField();
        comboBoxMotor = new JComboBox<String>();
        comboBoxMotor.addItem("gasolina");
        comboBoxMotor.addItem("diesel");
        comboBoxMotor.addItem("hibrido");
        comboBoxMotor.addItem("electrico");
        comboBoxTipoVehiculo = new JComboBox<String>();
        comboBoxTipoVehiculo.addItem("Turismo");
        comboBoxTipoVehiculo.addItem("Monovolumen");
        comboBoxTipoVehiculo.addItem("SUV");
        comboBoxTipoVehiculo.addItem("Todoterreno");
        comboBoxCambio = new JComboBox<String>();
        comboBoxCambio.addItem("Manual");
        comboBoxCambio.addItem("Automatico");
        SpinnerModel spinnerModel1 = new SpinnerDateModel();
        spinnerFecha = new JSpinner(spinnerModel1);
        calendar = Calendar.getInstance();
        spinnerFecha.setValue(calendar.getTime());
        JComponent editor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy");
        spinnerFecha.setEditor(editor);
        textFieldNombreProveedo = new JTextField();
        mascaraNumero = new MaskFormatter();
        try {
            mascaraNumero = new MaskFormatter("#########");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        textFieldTelefono = new JFormattedTextField(mascaraNumero);
        textFieldCoste = new JTextField("");
        textFieldCoste.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                if (((caracter < '0') ||
                        (caracter > '9')) &&
                        (caracter != '\b')) {
                    e.consume();
                }
            }
        });
        textFieldPVP = new JTextField();
        textFieldPVP.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                if (((caracter < '0') ||
                        (caracter > '9')) &&
                        (caracter != '\b')) {
                    e.consume();
                }
            }
        });

        Container containerPrincipal = this;

        GroupLayout groupLayoutPrincipal = new GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(groupLayoutPrincipal);

        groupLayoutPrincipal.setAutoCreateGaps(true);
        groupLayoutPrincipal.setAutoCreateContainerGaps(true);

        groupLayoutPrincipal.setHorizontalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelCodigo)
                                .addComponent(labelMarca)
                                .addComponent(labelTipoMotor)
                                .addComponent(labelTipoVehiculo)
                                .addComponent(labelTipoCambio)
                                .addComponent(labelFecha)
                                .addComponent(labelNombreProveedor)
                                .addComponent(labelTelefono)
                                .addComponent(labelPrecio)
                                .addComponent(labelPVP)
                                .addComponent(buttonAceptar))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldCodigo)
                                .addComponent(textFieldMarca)
                                .addComponent(comboBoxMotor)
                                .addComponent(comboBoxTipoVehiculo)
                                .addComponent(comboBoxCambio)
                                .addComponent(spinnerFecha)
                                .addComponent(textFieldNombreProveedo)
                                .addComponent(textFieldTelefono)
                                .addComponent(textFieldCoste)
                                .addComponent(textFieldPVP)
                                .addComponent(buttonCancelar))
        );

        groupLayoutPrincipal.setVerticalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCodigo)
                                .addComponent(textFieldCodigo))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelMarca)
                                .addComponent(textFieldMarca))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTipoMotor)
                                .addComponent(comboBoxMotor))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTipoVehiculo)
                                .addComponent(comboBoxTipoVehiculo))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTipoCambio)
                                .addComponent(comboBoxCambio))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFecha)
                                .addComponent(spinnerFecha))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNombreProveedor)
                                .addComponent(textFieldNombreProveedo))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTelefono)
                                .addComponent(textFieldTelefono))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelPrecio)
                                .addComponent(textFieldCoste))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelPVP)
                                .addComponent(textFieldPVP))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonAceptar)
                                .addComponent(buttonCancelar))

        );

        buttonCancelar.addActionListener(e -> EstadoInicial());
        buttonAceptar.addActionListener(e -> Guardar());

        buttonAceptar.setToolTipText("Opcion de aceptar");
        buttonCancelar.setToolTipText("Opcion de cancelar");
        labelCodigo.setToolTipText("Introduzca el codigo");

        labelCodigo.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelMarca.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelTipoMotor.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelTipoVehiculo.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelTipoCambio.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelFecha.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelNombreProveedor.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelTelefono.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelPrecio.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelPVP.setFont(new Font("TimesRoman", Font.ITALIC, 14));


    }

    private void Guardar() {
        if (!textFieldCodigo.getText().isEmpty() &&
                !textFieldMarca.getText().isEmpty() &&
                !textFieldNombreProveedo.getText().isEmpty() &&
                !textFieldTelefono.getText().isEmpty() &&
                !textFieldCoste.getText().isEmpty() &&
                !textFieldPVP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            EstadoInicial();
        } else JOptionPane.showMessageDialog(null, "Faltan Datos", "Error", JOptionPane.WARNING_MESSAGE);
    }

    public void EstadoInicial() {
        textFieldCodigo.setText("");
        textFieldMarca.setText("");
        comboBoxMotor.setSelectedIndex(0);
        comboBoxTipoVehiculo.setSelectedIndex(0);
        comboBoxCambio.setSelectedIndex(0);
        spinnerFecha.setValue(calendar.getTime());
        textFieldNombreProveedo.setText("");
        textFieldTelefono = new JFormattedTextField("");
        textFieldCoste.setText("");
        textFieldPVP.setText("");
    }
}
