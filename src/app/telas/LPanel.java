package app.telas;

import javax.swing.*;
import java.awt.*;

public class LPanel extends JPanel {
    public LPanel() {
        setBorder(BorderFactory.createTitledBorder("Lista de Itens"));
        setLayout(new BorderLayout(5,5));

        String[] items = {"Cliente","Fornecedor","Parceiro"};
        JList<String> list = new JList<>(items);
        add(new JScrollPane(list), BorderLayout.CENTER);
    }
}