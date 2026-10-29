package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        double num1, num2, num3;

        System.out.print("Insira um número: "); //solicita o input ao utilizador
        num1 = input.nextDouble(); //define a variavel como o input do utilizador

        System.out.print("Insira outro número: ");
        num2 = input.nextDouble();

        System.out.print("Insira mais um número: ");
        num3 = input.nextDouble();

        if (num1 < num2 && num1 < num3) {
            System.out.println("" + num1);
        }
        if (num2 < num1 && num2 <num3) {
            System.out.println("O menor entre eles é " + num2);
        }
    }
}
