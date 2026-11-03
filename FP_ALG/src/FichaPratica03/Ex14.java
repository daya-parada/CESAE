package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // le uma sequência de números inteiros do utilizador e determina se a sequência está em ordem crescente ou não

        int lim, num, aux=0, crescente=0, auxCres=0;

        System.out.print("Quantos números deseja inserir? "); // input lim
        lim = input.nextInt();

        System.out.print("Introduza um número: "); // input num
        num = input.nextInt();

            while (lim-1 > 0) { //estava a pedir sempre um ciclo extra, pq sera!?
                aux = num;
                System.out.print("Introduza um número: "); // input num
                num = input.nextInt();
                    if (aux < num) { // o ciclo foi crescente
                        crescente = 0;
                    }
                    else { // o ciclo foi decrescente
                        crescente = 1; //
                    }
                auxCres = crescente + auxCres; //se a soma continuar dando 0, logo todos os ciclos foram crescentes
                lim = lim-1; // atualiza a variavel lim
            }

            if (auxCres != 0) {
                System.out.print("Não crescente");
            }

            else {
                System.out.println("Crescente");
            }
    }
}
