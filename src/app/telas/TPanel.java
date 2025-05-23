package app.telas;

import javax.swing.*;
import java.awt.*;

public class TPanel extends JPanel {
    public TPanel() {
        setBorder(BorderFactory.createTitledBorder("Tabela de Dados"));
        setLayout(new BorderLayout(5,5));

        String[] cols = {"ID","Nome","Email","Telefone"};
        Object[][] data = {
                {"1","Ana","ana@email.com","(11)9876-5432"},
                {"2","Carlos","carlos@email.com","(21)9999-8888"}
        };
        JTable table = new JTable(data, cols);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}