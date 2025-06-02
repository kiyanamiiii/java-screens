package app.model;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String funcao;
    private String sexo;

    public Pessoa(String nome, String email, String telefone, String funcao, String sexo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.funcao = funcao;
        this.sexo = sexo;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getFuncao() { return funcao; }
    public String getSexo() { return sexo; }
}
