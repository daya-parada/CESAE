package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //cria as variaveis
        double nota1, nota2, nota3, media;

        //solicita o input ao utilizador
        System.out.print("Valor da primeira nota: ");
        //define a variavel como o input do utilizador
        nota1 = input.nextInt();

        System.out.print("Valor da segunda nota: ");
        nota2 = input.nextInt();

        System.out.print("Valor da terceira nota: ");
        nota3 = input.nextInt();

        media = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;

        if (media >= 9.5){
            System.out.println("Estás aprovado e obteve média " + media);
        }
        else {
            System.out.println("Fostes reprovado e obteve média " + media);
        }
    }
}
