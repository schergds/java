package aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MinhaExcecao {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite dois números:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        divide(n1, n2);
    }

    public static void divide(double n1, double n2) throws MinhaExcecao {
        if(n2 == 0){
            throw new MinhaExcecao("Impossível realizar divisão por zero.");
        }
        else {
            System.out.println("Resultado: " + (n1 / n2));
        }
    }
}