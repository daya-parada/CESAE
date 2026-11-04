package FichaPratica03;

import java.util.Scanner;

public class Ex15 { //exercicio flair: o valor deve ser conservado, nao utilize else
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=0, fatorial = 1, aux=1;

        System.out.print("Introduza um número não negativo: ");
        n = input.nextInt();

        while (aux <= n) {
           fatorial = fatorial * aux;
           aux = aux  + 1; // atualiza o ciclo !contador!
           // System.out.println(" -- fim de ciclo -- ");
        }
        System.out.print("Somatorio de " + n + " é igual a: " + fatorial);
    }
}
