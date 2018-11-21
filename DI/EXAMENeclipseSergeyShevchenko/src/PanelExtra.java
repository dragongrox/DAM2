import javax.swing.*;
import java.awt.*;

public class PanelExtra extends JPanel {
    JPasswordField passwordField;
    JButton button;
    JLabel label;

    public PanelExtra() {
        passwordField = new JPasswordField();
        button = new JButton("Aceptar");
        label = new JLabel("Acertaste la contraseña, Felicidades");
        label.setVisible(false);

        button.addActionListener(e -> Desvelar());

        passwordField.setToolTipText("Este campo sirve para introducir una contraseña de forma segura, intruduce cheat ;)");

        Container containerPrincipal = this;

        GroupLayout groupLayoutPrincipal = new GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(groupLayoutPrincipal);

        groupLayoutPrincipal.setAutoCreateGaps(true);
        groupLayoutPrincipal.setAutoCreateContainerGaps(true);

        groupLayoutPrincipal.setHorizontalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(passwordField)
                                .addComponent(label))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button))
        );

        groupLayoutPrincipal.setVerticalGroup(
                groupLayoutPrincipal.createSequentialGroup()
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordField)
                                .addComponent(button))
                        .addGroup(groupLayoutPrincipal.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label))

        );
    }

    private void Desvelar() {
        String t = passwordField.getText();
        if (t.contains("cheat")) {
            label.setVisible(true);
        }
    }
}
