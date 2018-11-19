import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
    JButton buttonImprimirDatos, buttonAceptar, buttonCancelar;

    public PanelBotones() {
        buttonImprimirDatos = new JButton("Imprimir datos");
        buttonAceptar = new JButton("Aceptar");
        buttonCancelar = new JButton("Cancelar");

        Container containerPrincipal = this;

        GroupLayout groupLayoutPrincipal = new GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(groupLayoutPrincipal);

        groupLayoutPrincipal.setAutoCreateGaps(true);
        groupLayoutPrincipal.setAutoCreateContainerGaps(true);

        groupLayoutPrincipal.setHorizontalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(buttonImprimirDatos))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(buttonAceptar))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(buttonCancelar))
        );

        groupLayoutPrincipal.setVerticalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonImprimirDatos)
                                .addComponent(buttonAceptar)
                                .addComponent(buttonCancelar))
        );
    }
}
