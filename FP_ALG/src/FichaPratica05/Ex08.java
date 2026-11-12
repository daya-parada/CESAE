package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3
        //e que os imprima com o seguinte aspeto gráfico

        int[ ][ ] matriz = new int[3][3]; //define uma matrix 3*3

        // solicita elementos de linhas E colunas
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("elemento [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // imprime a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println(); //quebra a linha
        }
    }
}
