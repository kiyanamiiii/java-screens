package app.telas;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Protótipo de Sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());
        FPanel f = new FPanel();
        TPanel t = new TPanel();
        LPanel l = new LPanel();

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, t, l);
        split.setResizeWeight(0.5);

        getContentPane().setLayout(new BorderLayout(10,10));
        getContentPane().add(f, BorderLayout.NORTH);
        getContentPane().add(split, BorderLayout.CENTER);
        ((JComponent)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    }

    private JMenuBar createMenuBar() {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Arquivo");
        JMenuItem exit = new JMenuItem("Sair");
        exit.addActionListener(e -> System.exit(0));
        m.add(exit);
        mb.add(m);
        return mb;
    }
}