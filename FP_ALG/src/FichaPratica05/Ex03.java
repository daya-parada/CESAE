package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int [10]; // array de 0 a 9 (tamanho 10)


        for (int i = 0; i < vetor.length ; i++) { // solicita inputs do 0 ao 9
            System.out.print("Insira no Array [" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        int maior=vetor[0]; // ao inves de definir maior=0. inicia na primeira posicao. Isso evita que, caso todos os arrayz sejam negativos, o for a seguir devolva 0 como o maior elemento

        // encontra o maior vetor [i]
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor [i] >= maior) {
                maior = vetor [i];
            }
        }
        System.out.print("O maior array [i] é: " + maior);
    }
}
