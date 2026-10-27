package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        int num1, num2;

        //solicita o input ao utilizador
        System.out.print("Introduza um número: ");

        //define a variavel como o input do utilizador
        num1 = input.nextInt();

        //solicita o input ao utilizador
        System.out.print("Introduza um número: ");

        //define a variavel como o input do utilizador
        num2 = input.nextInt();

        //mostra o maior primeiro
        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        }
        else {
            System.out.println(num2 + " " + num1);
        }

    }
}
