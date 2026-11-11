package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira junto aos elementos da segunda.

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        // lê o primeiro array
        System.out.println("Primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("elemento [" + i + "]: ");
            array1[i] = input.nextInt();
        }

        // lê o segundo array
        System.out.println("\nSegundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("elemento [" + i + "]: ");
            array2[i] = input.nextInt();
        }

        // monta a matriz: coluna 0 = array1, coluna 1 = array2
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = array1[i];
            matriz[i][1] = array2[i];
        }

        // imprime a matriz
        System.out.println("\nMatriz 10x2:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
