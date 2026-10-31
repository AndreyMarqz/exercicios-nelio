package ExercicioExcecoes.application;

import ExercicioExcecoes.model.entities.Account;
import ExercicioExcecoes.model.exceptions.WithdrawErrorException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double amountWithdraw = sc.nextDouble();

        try {
            account.withdraw(amountWithdraw);
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (WithdrawErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
