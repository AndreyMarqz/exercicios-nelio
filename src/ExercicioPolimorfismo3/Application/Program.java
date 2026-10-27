package ExercicioPolimorfismo3.Application;

import ExercicioPolimorfismo3.Entities.Pessoa;
import ExercicioPolimorfismo3.Entities.PessoaFisica;
import ExercicioPolimorfismo3.Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter the number of tax payers: ");
            n = sc.nextInt();
            sc.nextLine();

            if(n <= 0) {
                System.out.println("Type a positive number greater than 0!");
            }
        } while(n <= 0);

        List<Pessoa> pessoas = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            System.out.println("Tax payer #" + i + " data:");
            char option;
            do {
                System.out.print("Individual or company (i/c)? ");
                option = sc.next().charAt(0);
                sc.nextLine();

                if(option != 'i' && option != 'I' && option != 'c' && option != 'C') {
                    System.out.println("Type i/I for Individual or c/C for Company!");
                }
            } while(option != 'i' && option != 'I' && option != 'c' && option != 'C');

            if(option == 'i' || option == 'I') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                Pessoa pessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
                pessoas.add(pessoa);
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                Integer employeeNumbers = sc.nextInt();
                sc.nextLine();

                Pessoa pessoa = new PessoaJuridica(name, anualIncome, employeeNumbers);
                pessoas.add(pessoa);
            }
        }

        System.out.println();

        Double sum = 0.0;
        System.out.println("TAXES PAID:");
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + ": $" + String.format("%.2f", pessoa.calcularImposto()));
            sum += pessoa.calcularImposto();
        }

        System.out.println();

        System.out.print("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
