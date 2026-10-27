package FichaPratica02;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        int num;

        //solicita o input ao utilizador
        System.out.print("Introduza um número: ");
        //define a variavel como o input do utilizador
        num = input.nextInt();

        //mostra o maior primeiro
        if (num % 2 == 0) {
            System.out.println(num + " é par!");
        }
        else {
            System.out.println(num + " é ímpar!");
        }

    }
}
