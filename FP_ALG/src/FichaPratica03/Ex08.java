package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int inteiro;

        System.out.print("Introduza um número inteiro: ");
        inteiro = input.nextInt();

        System.out.println(inteiro - 5);
        System.out.println(inteiro - 4);
        System.out.println(inteiro - 3);
        System.out.println(inteiro - 2);
        System.out.println(inteiro - 1);

        System.out.println(inteiro + 1);
        System.out.println(inteiro + 2);
        System.out.println(inteiro + 3);
        System.out.println(inteiro + 4);
        System.out.println(inteiro + 5);

    }

}
