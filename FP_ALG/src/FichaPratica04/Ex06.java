package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, aux=0;

        System.out.println("Player 1, Insira um valor entre 0 a 100: ");
        num = input.nextInt();
        System.out.println("Player 2, advinhe o numero escolhido pelo player 1 ");
        do {
            System.out.print("Tente advinhar: ");
            aux = input.nextInt();
            // gambiarra que limpa a consola
                for (int i = 0; i < 100; i++) {
                    System.out.println();
                }
        } while (aux != num);
        System.out.println("Parabens!");
        System.out.println("Player 2 advinhou o número escolhido pelo player 1!");
    }
}
