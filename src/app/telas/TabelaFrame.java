package app.telas;

import javax.swing.*;
import java.awt.*;

public class TabelaFrame extends JFrame {

    public TabelaFrame() {
        setTitle("Tabela de Dados");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setJMenuBar(createMenuBar());

        TabelaPanel tabelaPanel = new TabelaPanel();
        getContentPane().add(tabelaPanel, BorderLayout.CENTER);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFiltrar = new JMenu("Filtrar");
        String[] funcoes = {"Função 1", "Função 2", "Função 3"};
        for (String funcao : funcoes) {
            JMenuItem item = new JMenuItem(funcao);
            item.addActionListener(e -> abrirFiltroPorFuncao(funcao));
            menuFiltrar.add(item);
        }
        menuFiltrar.addSeparator();

        JMenuItem itemFechar = new JMenuItem("Fechar");
        itemFechar.addActionListener(e -> dispose());
        menuFiltrar.add(itemFechar);

        menuBar.add(menuFiltrar);

        return menuBar;
    }

    private void abrirFiltroPorFuncao(String funcao) {
        FiltroFuncao filtroFrame = new FiltroFuncao(funcao);
        filtroFrame.setVisible(true);
    }


}
