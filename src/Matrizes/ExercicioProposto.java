package Matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha, coluna;
        do {
            System.out.println("Digite a quantidade de linhas da matriz: ");
            linha = sc.nextInt();

            if(linha <= 0) {
                System.out.println("Insira um número positivo maior que 0!");
            }
        } while(linha <= 0);

        do {
            System.out.println("Digite a quantidade de colunas da matriz: ");
            coluna = sc.nextInt();

            if(coluna <= 0) {
                System.out.println("Insira um número positivo maior que 0!");
            }
        } while(coluna <= 0);

        int[][] matriz = new int[linha][coluna];

        System.out.println("Digite os números a serem inseridos na matriz: ");
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número para ser encontrado a posição no vetor, junto dos elementos próximos: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    System.out.println("\nElemento encontrado na posição [" + i + "][" + j + "]:");

                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }

                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }

                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }

                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                }
            }
        }

        if(!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado na matriz.");
        }

        sc.close();
    }
}
