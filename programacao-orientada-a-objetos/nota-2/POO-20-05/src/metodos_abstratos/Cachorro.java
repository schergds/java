package metodos_abstratos;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom() {
        System.out.println("Au au");
    }

    public void cuidarPatio() {
        System.out.println("Cuidando o pátio");
    }

    public void exibeDados() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raca: " + getRaca());
    }

}
