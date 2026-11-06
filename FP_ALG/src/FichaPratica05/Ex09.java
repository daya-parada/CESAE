package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5]; //define uma matrix 5*5
        int soma=0;

        //int[ ][ ] matriz = new matriz[linha][coluna];
        //matriz.length( ); linhas
        //matriz[0].length( ); colunas

        // solicita elementos de linhas E colunas
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
                soma = soma + matriz[linha][coluna];
            }
        }

        // imprime a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println(); //quebra a linha
        }

        System.out.println("A soma dos elementos resulta em: " + soma);
    }

}
