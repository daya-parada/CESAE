package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int [10]; // array de 0 a 9 (tamanho 10)
        int soma=0, media=0;

        for (int i = 0; i < vetor.length ; i++) { // solicita inputs do 0 ao 9
            System.out.print("Insira no Array [" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        //calcula a soma dos elementos
        for (int i = 0; i < vetor.length ; i++) { // while i < 10
            soma = soma + vetor[i];
        }
        System.out.println("soma: " + soma);

        //calcula a media dos elementos: soma/tamanho total
        for (int i = 0; i < vetor.length ; i++) { // while i < 10
            media = soma / vetor.length;
        }
        System.out.println("media: " + media);
    }
}
