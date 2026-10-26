package POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        String yesOrNo;
        do {
            System.out.println("Is there an initial deposit? (y/n): ");
            yesOrNo = sc.next();
        }
        while (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n"));

        double initialDeposit = 0;
        if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.print("\n");

        System.out.println("POO.Account data:");
        System.out.println(account);

        System.out.print("\n");

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.print("\n");

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\n");

        System.out.println("Enter a withdraw value: ");
        double withDrawValue = sc.nextDouble();
        account.withdraw(withDrawValue);

        System.out.print("\n");

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}