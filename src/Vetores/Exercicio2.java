package Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números você vai digitar? (Digite um número maior que 0):");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Digite um número positivo!");
            }
        } while (n <= 0);

        double[] vetor = new double[n];

        double num;
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para ser armazenado no vetor:");
            num = sc.nextInt();
            vetor[i] = num;
        }

        System.out.println("Valores = " + Arrays.toString(vetor));

        double sum = 0.0;
        for(int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        System.out.println("Soma = " + sum);

        double media = sum / vetor.length;
        System.out.println("Média = " + media);

        sc.close();
    }
}
