package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números vai ter cada vetor?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while(n <= 0);

        System.out.println("Digite os valores para serem inseridos no vetor A: ");
        int[] vetorA = new int[n];
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores para serem inseridos no vetor B: ");
        int[] vetorB = new int[n];
        for(int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Soma dos valores dos vetores nas mesmas posições: ");
        int[] somaVetores = new int[n];
        for(int i = 0; i < somaVetores.length; i++) {
            somaVetores[i] = vetorA[i] + vetorB[i];
            System.out.println(somaVetores[i]);
        }

        sc.close();
    }
}
