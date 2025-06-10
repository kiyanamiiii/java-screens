package app.telas;

import app.model.ArmazenarPessoas;
import app.model.Pessoa;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TabelaPanel extends JPanel {

    public TabelaPanel() {
        setBorder(BorderFactory.createTitledBorder("Tabela de Dados"));
        setLayout(new BorderLayout(5, 5));

        String[] colunas = {"Nome", "Email", "Telefone", "Função", "Sexo"};
        List<Pessoa> pessoas = ArmazenarPessoas.getPessoas();
        Object[][] dados = new Object[pessoas.size()][5];
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            dados[i][0] = p.getNome();
            dados[i][1] = p.getEmail();
            dados[i][2] = p.getTelefone();
            dados[i][3] = p.getFuncao();
            dados[i][4] = p.getSexo();
        }

        JTable tabela = new JTable(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }
}
