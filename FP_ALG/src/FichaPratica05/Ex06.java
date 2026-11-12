package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
        int[] vetor = new int [10]; // array de 0 a 9 (tamanho 10)
        int maior=vetor[0]; //inicia a variavel pela primeira posicao i
        boolean crescente = false; //inicia como false, ja que meu ciclo de verificacao deve ser true

        for (int i = 0; i < vetor.length ; i++) { // solicita inputs do 0 ao 9
            System.out.print("Insira no Array [" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        //verifica se i é maior ou menor que i anterior
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor [i] >= maior) {
                maior = vetor [i];
                crescente = true; // iniciei a variavel como false, pra evitar falso positivo
            }
        }

        //imprime o resultado!
        if (crescente) {
            System.out.println("O array é crescente");
        } else {
            System.out.println("O array não é crescente");
        }
    }

}
