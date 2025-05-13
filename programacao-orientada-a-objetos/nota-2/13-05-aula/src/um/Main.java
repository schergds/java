package um;

public class Main{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Guilherme", 19);
        meuMetodo(pessoa);
    }
    public static void meuMetodo(Pessoa p) {
        System.out.println("Nome: " + p.getNome());
        System.out.print("Idade: " + p.getIdade());
    }
}