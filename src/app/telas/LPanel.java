package app.telas;

// ListPanel.java
import javax.swing.*;
import java.awt.*;

public class LPanel extends JPanel {
    public LPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Lista de Itens"));

        String[] itens = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(itens);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
    }
}

