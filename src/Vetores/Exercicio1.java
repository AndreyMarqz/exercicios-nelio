package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números você vai digitar? (Digite um número entre 0 e 10):");
            n = sc.nextInt();

            if (n <= 0 || n > 10) {
                System.out.println("Digite um número positivo entre 1 e 10!");
            }
        } while (n <= 0 || n > 10);

        int[] vetor = new int[n];

        int num;
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para ser armazenado no vetor:");
            num = sc.nextInt();
            vetor[i] = num;
        }

        System.out.println("Números negativos do Array:");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }

}
