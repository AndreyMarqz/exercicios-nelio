package Vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números você vai digitar?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while (n <= 0);

        int[] vetor = new int[n];

        int num;
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para ser inserido no vetor: ");
            num = sc.nextInt();
            vetor[i] = num;
        }

        int qtd = 0;
        System.out.println("Números pares do vetor: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
                qtd += 1;
            }
        }

        System.out.println("Quantidade de pares no vetor: " + qtd);

        sc.close();
    }
}
