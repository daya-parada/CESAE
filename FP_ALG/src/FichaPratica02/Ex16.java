package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int valor, notas;
        System.out.print("Introduza um número múltiplo de 5: ");
        valor = input.nextInt();

        if (valor%5 == 0) {
            notas = valor / 200;
            System.out.print(notas + " notas de 200, ");
            valor = valor % 200; //atualiza a variavel

            notas = valor / 100;
            System.out.print(notas + " notas de 100, ");
            valor = valor % 100;

            notas = valor / 50;
            System.out.print(notas + " notas de 50, ");
            valor = valor % 50;

            notas = valor / 20;
            System.out.print(notas + " notas de 20, ");
            valor = valor % 20;

            notas = valor / 10;
            System.out.print(notas + " notas de 10, ");
            valor = valor % 10;

            notas = valor / 5;
            System.out.print("e " + notas + " notas de 5.");
        }
        else {
            System.out.println("Este valor não é multiplo de 5");
        }

    }

}
