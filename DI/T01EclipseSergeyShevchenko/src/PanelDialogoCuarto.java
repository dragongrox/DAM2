import javax.swing.*;
import java.awt.*;

public class PanelDialogoCuarto extends JPanel {
    JTabbedPane tabbedPaneDatosPersonales, tabbedPaneDatosHabitacion;

    public PanelDialogoCuarto() {
        tabbedPaneDatosPersonales = new JTabbedPane();
        tabbedPaneDatosHabitacion = new JTabbedPane();

        Container containerPrincipal = this;

        GroupLayout groupLayoutPrincipal = new GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(groupLayoutPrincipal);

        groupLayoutPrincipal.setAutoCreateGaps(true);
        groupLayoutPrincipal.setAutoCreateContainerGaps(true);

        groupLayoutPrincipal.setHorizontalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(tabbedPaneDatosPersonales))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(tabbedPaneDatosHabitacion))
        );

        groupLayoutPrincipal.setVerticalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(tabbedPaneDatosPersonales)
                                .addComponent(tabbedPaneDatosHabitacion))
        );
    }
}
