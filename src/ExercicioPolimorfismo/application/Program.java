package ExercicioPolimorfismo.application;

import ExercicioPolimorfismo.entities.Employee;
import ExercicioPolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfEmployess;
        do {
            System.out.println("Enter the number of employees");
            numberOfEmployess = sc.nextInt();
            sc.nextLine();

            if(numberOfEmployess <= 0) {
                System.out.println("Enter a positive number greater than 0!");
            }
        } while (numberOfEmployess <= 0);

        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < numberOfEmployess; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + " data:");

            char outsourced;
            do {
                System.out.print("Outsourced (y/n)? ");
                outsourced = sc.next().charAt(0);
                sc.nextLine();

                if(outsourced != 'y' && outsourced != 'n' && outsourced != 'Y' && outsourced != 'N'){
                    System.out.println("Type only: N/n for No or Y/y for Yes!");
                }
            } while (outsourced != 'y' && outsourced != 'n' && outsourced != 'Y' && outsourced != 'N');

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced == 'y' || outsourced == 'Y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println();

        System.out.println("PAYMENTS:");
        for(Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
