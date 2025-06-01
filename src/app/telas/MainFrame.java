package app.telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Protótipo de Sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());
        FPanel f = new FPanel();

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, null, null);
        split.setResizeWeight(0.5);

        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(f, BorderLayout.NORTH);
        getContentPane().add(split, BorderLayout.CENTER);
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");

        JMenuItem exit = new JMenuItem("Sair");
        exit.addActionListener(e -> System.exit(0));

        JMenuItem tabela = new JMenuItem("Tabela");
        tabela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame novaJanela = new JFrame("Tabela de Dados");
                novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                novaJanela.setSize(500, 300);
                novaJanela.add(new TPanel());
                novaJanela.setVisible(true);
            }
        });

        menu.add(exit);
        menu.add(tabela);
        menuBar.add(menu);
        return menuBar;
    }
}