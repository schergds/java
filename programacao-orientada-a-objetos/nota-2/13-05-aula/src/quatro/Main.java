package quatro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("Guilherme", 19));
        pessoas.add(new Pessoa("Weber", 19));
        pessoas.add(new Pessoa("Otávio", 24));

        exibirPessoas2(pessoas);
    }

    public static void exibirPessoas(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.print("Nome: " + pessoa.getNome());
            System.out.println(", Idade: " + pessoa.getIdade());
        }
    }

    public static void exibirPessoas2(List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.print("Nome: " + pessoas.get(i).getNome());
            System.out.println(", Idade: " + pessoas.get(i).getIdade());
        }
    }
}
