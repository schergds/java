public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws BalanceException {
        if (amount > this.balance) {
            throw new BalanceException("Not enough balance");
        }
        if (amount > this.withdrawLimit) {
            throw new BalanceException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
        System.out.print("New balance: " + this.balance);
    }
}
