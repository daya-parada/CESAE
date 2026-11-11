package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int[ ][ ] matriz = new matriz[linha][coluna];
        //matriz.length( ); linhas
        //matriz[0].length( ); colunas


        //Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo
        //utilizador. Deverá depois ler um ou tro valor do utilizador e indicar quantos vezes existe na matriz.

        int[][] matriz = new int[3][5];
        int num;
        int contador = 0;

        // preenche a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.print("Insira um número para pesquisar: ");
        num = input.nextInt();

        // percorre a matriz e conta quantas vezes o num aparece
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] == num) {
                    contador++;
                }
            }
        }
        System.out.println("O número " + num + " aparece " + contador + " vez(es) na matriz.");
    }
}