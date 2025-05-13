package tres;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Guilherme", 19, new Endereco("Duque de Caxias", 375));

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.print("Endereço: " + pessoa.getEndereco().getRua() + ", " + pessoa.getEndereco().getNumero());
    }
}
