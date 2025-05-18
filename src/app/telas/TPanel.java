package app.telas;

// TablePanel.java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TPanel extends JPanel {
    public TPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Tabela de Dados"));

        String[] colunas = {"ID", "Nome", "Email"};
        Object[][] dados = {
                {"1", "Ana", "ana@email.com"},
                {"2", "Carlos", "carlos@email.com"},
                {"3", "Maria", "maria@email.com"}
        };

        JTable table = new JTable(new DefaultTableModel(dados, colunas));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
}
