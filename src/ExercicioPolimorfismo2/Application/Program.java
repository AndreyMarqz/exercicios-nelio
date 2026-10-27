package ExercicioPolimorfismo2.Application;

import ExercicioPolimorfismo2.entities.ImportedProduct;
import ExercicioPolimorfismo2.entities.Product;
import ExercicioPolimorfismo2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter the number of products: ");
            n = sc.nextInt();
            sc.nextLine();

            if(n <= 0) {
                System.out.println("Enter a positive number greater than 0!");
            }
        } while(n <= 0);

        List<Product> products = new ArrayList<>();

        char productType;
        for(int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            do {
                System.out.print("Common, used or imported (c/u/i)? ");
                productType = sc.next().charAt(0);
                sc.nextLine();

                if(productType != 'c' && productType != 'u' && productType != 'i' && productType != 'C' && productType != 'U' && productType != 'I') {
                    System.out.println("Type c/C, u/U or i/I!");
                }
            } while(productType != 'c' && productType != 'u' && productType != 'i' && productType != 'C' && productType != 'U' && productType != 'I');

            if(productType == 'i' || productType == 'I') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            } else if(productType == 'c' || productType == 'C') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();

                Product product = new Product(name, price);
                products.add(product);
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDateString = sc.nextLine();
                Date manufactureDate = sdf.parse(manufactureDateString);

                System.out.println();

                Product product = new UsedProduct(name, price, manufactureDate);
                products.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
