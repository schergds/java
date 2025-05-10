import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.print("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            sc.close();
        }
        catch(BalanceException e){
            System.out.print("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.print("Unexpected error");
        }
    }
}