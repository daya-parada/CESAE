package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // primos
        // teste divisoes a partir de 2 até o valor do input

        int num;
        boolean primo = true;
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        for (int i =2; i < num; i++){ //o ciclo é crescente // testa divisoes a partir de 2 até o valor do input
            if (num%i == 0) { // se sim, então não é primo!
            primo = false;
            }
            else System.out.println("num");
        }
    }
}

