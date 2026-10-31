package ExercicioExcecoes.model.entities;

import ExercicioExcecoes.model.exceptions.WithdrawErrorException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        validadeWithdraw(amount);
        balance -= amount;
    }

    private void validadeWithdraw(Double amount) {
        if(amount > getWithdrawLimit()) {
            throw new WithdrawErrorException("Withdraw error: The amount exceeds the withdraw limit");
        }

        if(amount > getBalance()) {
            throw new WithdrawErrorException("Withdraw error: The amount exceeds the balance");
        }
    }
}
