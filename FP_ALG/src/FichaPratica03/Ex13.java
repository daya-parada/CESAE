package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ex13) imprime os múltiplos de 5 no intervalo entre dois inputs do utilizador, do maior para o menor

        int n1, n2;

        System.out.print("Introduza o primeiro número: "); // input n1
        n1 = input.nextInt();

        System.out.print("Introduza o segundo número: " );  // input n2
        n2 = input.nextInt();

        if (n1 > n2) { // se n1 for o maior entre os dois inputs (...)
            n1 = n1 - (n1 % 5); // encontra o maior múltiplo de 5 que é menor ou igual a n1
            while(n1 >= n2) { // ...enquanto n1 for maior que n2...
                System.out.println(n1); //...imprime n1
                n1 = n1 - 5; // ...atualiza n1 para o maior múltiplo de 5 que é menor ou igual a n1
            }
        }
        else { // se n2 for o maior entre os dois inputs (...)
            n2 = n2 - (n2 % 5); // maior múltiplo de 5 que é menor ou igual a n2
            while(n2 >= n1) { // ...enquanto n2 for maior que n1...
                System.out.println(n2); //...imprime n2
                n2 = n2 - 5; // atualiza n2 para o multiplo de 5 imediatamente inferior a n2
            }
        }
    }
}
