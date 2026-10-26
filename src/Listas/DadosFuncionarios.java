package Listas;

import Listas.Entities.Employees;

import java.util.*;

public class DadosFuncionarios {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("How many employees will be registered?");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Type a number positive greater than 0!");
            }
        } while (n <= 0);

        List<Employees> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(employees, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            employees.add(emp);
        }

        System.out.println();

//      Integer position;
        Employees result;
        do {
            System.out.println("Enter the employee id that will have salary increase: ");
            int salaryIncreaseId = sc.nextInt();

//          position = position(employees, salaryIncreaseId);

            result = employees.stream().filter(x -> x.getId() == salaryIncreaseId).findFirst().orElse(null);

//        if(position == null) {
//
//        }
            if (result == null) {
                System.out.println("This id does not exist!");
            } else {
                System.out.println("Enter the percentage: ");
                double percentage = sc.nextDouble();

                result.increaseSalary(percentage);
            }
        } while (result == null);

        System.out.println();
        System.out.println("List of employees: ");
        for (Employees emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employees> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employees> employees, int id) {
        Employees emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
