package Vetores;

import Vetores.Entities.PensionatoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int roomsQuantity;
        do {
            System.out.println("How many rooms will be rented? ");
            roomsQuantity = sc.nextInt();

            sc.nextLine();

            if(roomsQuantity <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            } else if(roomsQuantity > 10) {
                System.out.println("Digite um número menor ou igual a 10! Existem somente 10 quartos para serem alugados.");
            }
        } while (roomsQuantity <= 0 || roomsQuantity > 10);

        PensionatoVetor[] pensionato = new PensionatoVetor[10];

        for(int i = 0; i < roomsQuantity; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            int room;
            do {
                System.out.print("Room (0 a 9): ");
                room = sc.nextInt();
                sc.nextLine();

                if (room < 0 || room > 9) {
                    System.out.println("Quarto inválido! Escolha um número de 0 a 9.");
                } else if (pensionato[room] != null) {
                    System.out.println("Este quarto já está ocupado! Escolha outro.");
                    room = -1;
                }
            } while (room < 0 || room > 9);

            pensionato[room] = new PensionatoVetor(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < pensionato.length; i++) {

            if(pensionato[i] != null) {
                System.out.printf("%d: %s, %s%n", i, pensionato[i].getName(), pensionato[i].getEmail());
            }
        }

        sc.close();

    }
}
