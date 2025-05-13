package dois;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Pringles", 10.0);
        Produto produto2 = produto1.clone();

        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco());

        produto2.setNome("Doritos");
        produto2.setPreco(15.0);

        System.out.println("Após modificar o preço do Produto 2:");
        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco());

        if(produto1 == produto2){
            System.out.print("Produto 1 e Produto 2 são o mesmo objeto.");
        } else {
            System.out.print("Produto 1 e Produto 2 são objetos diferentes.");
        }
    }
}