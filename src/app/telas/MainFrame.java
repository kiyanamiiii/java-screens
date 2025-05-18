package app.telas;

// MainFrame.java
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Protótipo de Sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());

        JPanel mainPanel = new JPanel(new BorderLayout());

        FPanel formPanel = new FPanel();
        TPanel tablePanel = new TPanel();
        LPanel listPanel = new LPanel();

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        centerPanel.add(tablePanel);
        centerPanel.add(listPanel);

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Arquivo");
        JMenuItem exitItem = new JMenuItem("Sair");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        return menuBar;
    }
}

