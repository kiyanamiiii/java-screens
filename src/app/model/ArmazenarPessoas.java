package app.model;

import java.util.ArrayList;
import java.util.List;

public class ArmazenarPessoas {
    private static final List<Pessoa> listaPessoas = new ArrayList<>();

    public static void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static List<Pessoa> getPessoas() {
        return listaPessoas;
    }

    public static List<Pessoa> filtrarPorFuncao(String funcao) {
        List<Pessoa> filtradas = new ArrayList<>();
        for (Pessoa p : listaPessoas) {
            if (p.getFuncao().equals(funcao)) {
                filtradas.add(p);
            }
        }
        return filtradas;
    }
}
