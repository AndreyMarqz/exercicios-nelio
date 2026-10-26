package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

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
        } while(n <= 0);

        double[] vetor = new double[n];
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para ser inserido no vetor: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.printf("Média do vetor = %.3f", media);
        System.out.println();
        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
