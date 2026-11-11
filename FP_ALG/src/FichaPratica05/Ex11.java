package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        //pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir todo o conteúdo da matriz de forma semelhante ao exercício 8.

        int[][] matriz = new int[3][3];
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // preenche a matriz com inputs
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // percorre a matriz para encontrar o maior e o menor
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
            }
        }

        // imprime a matriz em forma de tabela
        System.out.println("Conteúdo da matriz:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); // muda de linha no fim de cada linha da matriz
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}