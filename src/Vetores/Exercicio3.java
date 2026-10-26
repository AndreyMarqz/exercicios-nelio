package Vetores;

import Vetores.Entities.Pessoa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantas pessoas serão digitadas?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que zero!");
            }
        } while(n <= 0);


        Pessoa[] vetor = new Pessoa[n];

        for(int i = 0; i < vetor.length; i++) {
            sc.nextLine();

            System.out.printf("Nome da %da pessoa: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Idade da %da pessoa: ", i + 1);
            int idade = sc.nextInt();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa(name, idade, altura);

        }

        double sum = 0.0;
        for(int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getAltura();
        }

        System.out.println();

        double media = sum / vetor.length;
        System.out.printf("Média de altura das pessas do vetor: %.2f", media);

        System.out.println();

        int idadeMenor = 0;
        ArrayList<String> vetorNomes = new ArrayList<>();
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].getIdade() < 16) {
                idadeMenor += 1;

                vetorNomes.add(vetor[i].getName());
            }
        }

        System.out.println("Pessoas com menos de 16 anos: %" + (idadeMenor * 100) / vetor.length);

        System.out.println();

        System.out.println("Nome das pessoas com menos de 16 anos:");
        for(int i = 0; i < vetorNomes.toArray().length; i++) {
            System.out.println(vetorNomes.get(i));
        }

        sc.close();
    }
}
