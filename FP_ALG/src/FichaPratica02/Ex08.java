package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        double nota1, nota2, nota3, media;

        //solicita o input ao utilizador
        System.out.print("Nota 1: ");
        //define a variavel como o input do utilizador
        nota1 = input.nextDouble();

        //solicita o input ao utilizador
        System.out.print("Nota 2: ");
        //define a variavel como o input do utilizador
        nota2 = input.nextDouble();

        //solicita o input ao utilizador
        System.out.print("Nota 3: ");
        //define a variavel como o input do utilizador
        nota3 = input.nextDouble();

        //calcula a media
        media = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;

        if (media >=9.5){
            System.out.println("Está aprovado! Obteve média " + media);
        }
        else {
            System.out.println("Foi reprovado! :( Obteve média " + media);
        }
    }
}
