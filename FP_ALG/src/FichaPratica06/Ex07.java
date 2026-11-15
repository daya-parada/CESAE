package FichaPratica06;
import java.sql.SQLOutput;
import java.util.Scanner;

import static FichaPratica06.BibliotecaFP6.*;

public class Ex07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Introduza um caractere: ");
        char caractere = input.next().charAt(0);

        System.out.print("Introduza numero de linhas: ");
        int linha = input.nextInt();

        System.out.print("Introduza numero de colunas: ");
        int coluna = input.nextInt();

        imprimeQuadrado(caractere, linha, coluna);
    }
}
