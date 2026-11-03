package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, num, aux, fatorial = 0;

        System.out.print("Introduza um número não negativo: ");
        n = input.nextInt();
        num = n; // guarda n, para mais tarde imprimir o valor original de n

        while (n > 0) {
            aux = n; // guarda o n do ciclo anterior
            System.out.println("aux = n: " + aux);

            n = n - 1; // atualiza n
            System.out.println("n-1 " + n);

            fatorial = aux * n; // tenta calcular o fatorial
            System.out.println("aux = n: " + fatorial);

            System.out.println(" -- fim de ciclo -- ");
        }
        System.out.print("Somatorio de " + num + " é igual a: " + fatorial);
    }
}
