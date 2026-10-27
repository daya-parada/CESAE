package FichaPratica01;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
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

        media = nota1 * 0.20 + nota2 * 0.30 + nota3 * 0.50;

        System.out.println("Valor da média: " + media);
    }
}
