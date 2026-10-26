package Vetores;

import Vetores.Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos pessoas serão digitadas?");
            n = sc.nextInt();

            if(n <= 0) {
                System.out.println("Digite um número positivo maior que 0!");
            }
        } while(n <= 0);

        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[n];

        for(int i = 0; i < pessoa.length; i++) {

            System.out.printf("Digite a altura da %dª pessoa: ", i + 1);
            System.out.println();
            double altura = sc.nextDouble();

            sc.nextLine();

            char genero;
            char padronizada;
            do {
                System.out.printf("Digite o genêro da %dª pessoa: ", i + 1);
                System.out.println();
                genero = sc.next().charAt(0);
                padronizada = Character.toUpperCase(genero);

                if (padronizada != 'M' && padronizada != 'F') {
                    System.out.println("Digite M para Masculino ou F para Feminino!");
                }
            } while (padronizada != 'M' && padronizada != 'F');

            pessoa[i] = new Pessoa(altura, padronizada);
        }

        double menorAltura = pessoa[0].getAltura();
        double maiorAltura = pessoa[0].getAltura();
        double alturaMulheres = 0;
        int contador = 0;
        int qtdHomens = 0;

        for(int i = 0; i < pessoa.length; i++) {

            if(pessoa[i].getAltura() < menorAltura) {
                menorAltura = pessoa[i].getAltura();
            }

            if(pessoa[i].getAltura() > maiorAltura) {
                maiorAltura = pessoa[i].getAltura();
            }

            if(pessoa[i].getGenero() == 'F') {
                alturaMulheres += pessoa[i].getAltura();
                contador += 1;
            }

            if(pessoa[i].getGenero() == 'M') {
                qtdHomens += 1;
            }

        }

        System.out.println("Menor altura do vetor: " + menorAltura);
        System.out.println("Maior altura do vetor: " + maiorAltura);

        if (contador > 0) {
            System.out.printf("Média das alturas das mulheres: %.2f%n", alturaMulheres / contador);
        } else {
            System.out.println("Média das alturas das mulheres: Nenhuma mulher cadastrada.");
        }

        System.out.println("Quantidade de homens no vetor: " + qtdHomens);

        sc.close();
    }
}
