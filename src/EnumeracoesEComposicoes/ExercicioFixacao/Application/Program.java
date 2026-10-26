package EnumeracoesEComposicoes.ExercicioFixacao.Application;

import EnumeracoesEComposicoes.ExercicioFixacao.entities.Client;
import EnumeracoesEComposicoes.ExercicioFixacao.entities.Order;
import EnumeracoesEComposicoes.ExercicioFixacao.entities.OrderItem;
import EnumeracoesEComposicoes.ExercicioFixacao.entities.Product;
import EnumeracoesEComposicoes.ExercicioFixacao.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String bd = sc.nextLine();
        Date birthDate = sdf.parse(bd);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), status, client);

        for(int i = 0; i < n; i++) {
            System.out.println();

            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();

        System.out.println(order);
    }
}
