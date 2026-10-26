package POO;

public class Account {

    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double quantity) {
        this.balance += quantity;
    }

    public void withdraw(double quantity) {
        this.balance -= (quantity + 5);
    }

    public String toString() {
        return "POO.Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + String.format("%.2f", balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
