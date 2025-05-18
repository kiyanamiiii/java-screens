package app.telas;

// FormPanel.java
import javax.swing.*;
import java.awt.*;

public class FPanel extends JPanel {
    public FPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));
        setBorder(BorderFactory.createTitledBorder("Formulário"));

        add(new JLabel("Nome:"));
        add(new JTextField());

        add(new JLabel("Sexo:"));
        JPanel sexoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        ButtonGroup bg = new ButtonGroup();
        bg.add(masculino);
        bg.add(feminino);
        sexoPanel.add(masculino);
        sexoPanel.add(feminino);
        add(sexoPanel);

        add(new JLabel("Preferências:"));
        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkPanel.add(new JCheckBox("Email"));
        checkPanel.add(new JCheckBox("SMS"));
        add(checkPanel);

        add(new JLabel("País:"));
        add(new JComboBox<>(new String[]{"Brasil", "EUA", "Canadá"}));

        add(new JLabel(""));
        add(new JButton("Enviar"));
    }
}

