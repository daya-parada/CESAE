package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ex12) solicita inputs ate que um input seja menor que 0; agrupa os inputs em 4 intervalos
        int num, countI1, countI2, countI3, countI4;
        num = countI1 = countI2 = countI3 = countI4 = 0; // inicia todas as variaveis

        while (num >= 0) {
            System.out.print("Introduza um numero: ");
            num = input.nextInt(); //atualiza a var num a cada ciclo

            if (num >= 0 && num <= 25) { // se pertence ao intervalo 1 ...
                countI1 = countI1 + 1; // ...adiciona uma contagem para este intervalo
            }
            if (num >= 26 && num <= 50) { // se pertence ao intervalo 2...
                countI2 = countI2 + 1;  // ...adiciona uma contagem para este intervalo
            }
            if (num >= 51 && num <= 75) { // se pertence ao intervalo 3...
                countI3 = countI3 + 1;  // ...adiciona uma contagem para este intervalo
            }
            if (num >= 76 && num <= 100) { // se pertence ao intervalo 4...
                countI4 = countI4 + 1; // ...adiciona uma contagem para este intervalo
            }
        }

        System.out.println("[00,25]: " + countI1);
        System.out.println("[26,50]: " + countI2);
        System.out.println("[51,75]: "+ countI3);
        System.out.println("[76,100]: "+ countI4);

    }
}
