package metodos_abstratos;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Cachorro", 1, "Pinscher");
        c.emitirSom();
        c.cuidarPatio();
        c.exibeDados();

        System.out.println("---------------------------------------------");

        Retangulo retangulo = new Retangulo(10, 15);
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.area());
        System.out.print("Perímetro do círculo: " + circulo.perimetro());
    }
}