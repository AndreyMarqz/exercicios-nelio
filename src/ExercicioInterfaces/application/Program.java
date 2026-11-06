package ExercicioInterfaces.application;

import ExercicioInterfaces.entities.Contract;
import ExercicioInterfaces.services.ContractService;
import ExercicioInterfaces.services.OnlinePaymentService;
import ExercicioInterfaces.services.impl.ContractServiceImpl;
import ExercicioInterfaces.services.impl.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Número: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        Double amount = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        Integer numberOfInterests = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number, contractDate, amount);

        OnlinePaymentService onlinePaymentService = new PaypalService();
        ContractService contractService = new ContractServiceImpl(onlinePaymentService);

        contractService.processContract(contract, numberOfInterests);

        System.out.println();

        System.out.println("Parcelas:");
        System.out.print(contract);

        sc.close();
    }
}
