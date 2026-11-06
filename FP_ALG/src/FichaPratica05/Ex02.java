package FichaPratica05;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[12];  // array de 0 a 11
        int soma=0;

        for (int i = 0; i < vetor.length ; i++) { // solicita inputs do 0 ao 11
            System.out.print("Insira no Array [" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length ; i++) { // while i < 12
            soma = soma + vetor[i];
        }
        System.out.print("A soma dos vetores da matriz é: " + soma);
    }
}
