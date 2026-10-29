package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int inicio, fim;

        System.out.print("Introduza um numero inteiro: ");
        inicio = input.nextInt();

        System.out.print("Introduza um numero inteiro maior que o anterior: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio + 1;

        }
    }
}
