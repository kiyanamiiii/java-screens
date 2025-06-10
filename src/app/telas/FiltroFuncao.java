package app.telas;

import app.model.ArmazenarPessoas;
import app.model.Pessoa;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FiltroFuncao extends JFrame {

    public FiltroFuncao(String funcaoFiltrada) {
        setTitle("Filtrado por: " + funcaoFiltrada);
        setSize(500, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout(5, 5));
        painel.setBorder(BorderFactory.createTitledBorder("Função: " + funcaoFiltrada));

        String[] colunas = {"Nome", "Email", "Telefone", "Função", "Sexo"};
        List<Pessoa> pessoas = ArmazenarPessoas.filtrarPorFuncao(funcaoFiltrada);
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
        painel.add(new JScrollPane(tabela), BorderLayout.CENTER);

        getContentPane().add(painel);
    }
}
