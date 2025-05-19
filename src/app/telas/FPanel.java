package app.telas;

import javax.swing.*;
import java.awt.*;

public class FPanel extends JPanel {
    public FPanel() {
        setBorder(BorderFactory.createTitledBorder("Formulário"));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,10,5,10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(20), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(20), gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Telefone:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Sexo:"), gbc);
        gbc.gridx = 1;
        JPanel sexP = new JPanel(new FlowLayout(FlowLayout.LEFT,5,0));
        JRadioButton m = new JRadioButton("Masculino");
        JRadioButton f = new JRadioButton("Feminino");
        ButtonGroup bg = new ButtonGroup(); bg.add(m); bg.add(f);
        sexP.add(m); sexP.add(f);
        add(sexP, gbc);

        gbc.gridx = 1; gbc.gridy = 4;
        add(new JButton("Enviar"), gbc);
    }
}
