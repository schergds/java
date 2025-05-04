package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else if(ch == 'c') {
                System.out.print("Number of employees: ");
                int numOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID: ");
        double sum = 0;
        for(TaxPayer t : list) {
            System.out.println(t.getName() + ": $ " + t.tax());
            sum += t.tax();
        }
        System.out.println("\nTOTAL TAXES: $ " + sum);
        sc.close();
    }
}
