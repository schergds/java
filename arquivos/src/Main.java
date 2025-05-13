import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<Product>();
        String path = "/Users/gui/Documents/in/sourcefile.csv";
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String linha;
            while((linha = bf.readLine()) != null){
                String[] dados = linha.split(",");
                String nome = dados[0];
                double preco = Double.parseDouble(dados[1]);
                int quantidade = Integer.parseInt(dados[2]);
                produtos.add(new Product(nome, preco, quantidade));
            }
            }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        String path2 = "/Users/gui/Documents/out/test.csv";
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path2, true))){
            for(Product p : produtos){
                bf.write(p.getProductName() + "," + p.totalValueInStock());
                bf.newLine();
            }
            System.out.println("Sucesso.");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}