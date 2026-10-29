package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int num, aux;

        System.out.println("Introduza um numero inteiro: ");
        num = input.nextInt();
        aux = 0;

        System.out.println(aux); // imprime o 0 antes de iniciar o loop
        while (num > 0) {
            num = num - 1;
            aux = aux + 1;
            System.out.println(aux);
        }
    }
}
