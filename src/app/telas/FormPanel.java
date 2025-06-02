package app.telas;

import app.model.ArmazenarPessoas;
import app.model.Pessoa;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextField campoTelefone;
    private JComboBox<String> comboFuncoes;
    private JRadioButton rbMasculino;
    private JRadioButton rbFeminino;

    public FormPanel() {
        setBorder(BorderFactory.createTitledBorder("Formulário de Cadastro"));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        campoNome = new JTextField(20);
        add(campoNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        campoEmail = new JTextField(20);
        add(campoEmail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Telefone:"), gbc);
        gbc.gridx = 1;
        campoTelefone = new JTextField(15);
        add(campoTelefone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Função:"), gbc);
        gbc.gridx = 1;
        String[] funcoes = {"Função 1", "Função 2", "Função 3"};
        comboFuncoes = new JComboBox<>(funcoes);
        add(comboFuncoes, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Sexo:"), gbc);
        gbc.gridx = 1;
        JPanel painelSexo = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        rbMasculino = new JRadioButton("Masculino");
        rbFeminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rbMasculino);
        grupoSexo.add(rbFeminino);
        painelSexo.add(rbMasculino);
        painelSexo.add(rbFeminino);
        add(painelSexo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(e -> cadastrarPessoa());
        add(btnEnviar, gbc);
    }

    private void cadastrarPessoa() {
        String nome = campoNome.getText().trim();
        String email = campoEmail.getText().trim();
        String telefone = campoTelefone.getText().trim();
        String funcao = (String) comboFuncoes.getSelectedItem();
        String sexo = rbMasculino.isSelected() ? "Masculino" : rbFeminino.isSelected() ? "Feminino" : "";

        // Validações
        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Email inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!telefone.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Telefone inválido! Use o formato (XX)XXXXX-XXXX", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pessoa pessoa = new Pessoa(nome, email, telefone, funcao, sexo);
        ArmazenarPessoas.adicionarPessoa(pessoa);

        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        limparCampos();
    }

    private void limparCampos() {
        campoNome.setText("");
        campoEmail.setText("");
        campoTelefone.setText("");
        comboFuncoes.setSelectedIndex(0);
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
    }
}
