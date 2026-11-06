package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int [10]; // array de 0 a 9 (tamanho 10)
        int maior=vetor[0]; //inicia a variavel pela primeira posicao i
        boolean crescente = true; //inicia como true

        for (int i = 0; i < vetor.length ; i++) { // solicita inputs do 0 ao 9
            System.out.print("Insira no Array [" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        //verifica se i é maior ou menor que i anterior
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor [i] >= maior) {
                maior = vetor [i];
                crescente = true;
            }
        }

        if (crescente) { // crescente == true
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }

}
