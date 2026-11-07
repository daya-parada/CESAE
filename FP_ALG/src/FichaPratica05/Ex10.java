package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int[ ][ ] matriz = new matriz[linha][coluna];
        //matriz.length( ); linhas
        //matriz[0].length( ); colunas

        int[ ][ ] matriz = new matriz[3][5];
        int num;

        // solicita elementos de linhas E colunas
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.print("Insira um número para pesquisar: ");
        num = input.nextInt();

    }
}
