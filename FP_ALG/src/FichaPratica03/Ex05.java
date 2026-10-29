package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int num, aux;

        System.out.print("Introduza um numero inteiro: ");
        num = input.nextInt();;

        while (num > 0) {
            System.out.println("Amo programação!");
            num = num - 1;
        }
    }
}
