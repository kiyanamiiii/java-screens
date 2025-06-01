package app.telas;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Sistema de Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());

        FormPanel formPanel = new FormPanel();

        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(formPanel, BorderLayout.NORTH);
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e -> System.exit(0));

        JMenuItem itemTabela = new JMenuItem("Ver Tabela");
        itemTabela.addActionListener(e -> abrirTabela());

        menuArquivo.add(itemTabela);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);

        menuBar.add(menuArquivo);

        return menuBar;
    }

    private void abrirTabela() {
        TabelaFrame tabelaFrame = new TabelaFrame();
        tabelaFrame.setVisible(true);
    }
}
