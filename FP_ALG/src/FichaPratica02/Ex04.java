package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        int lugar;

        //solicita o input ao utilizador
        System.out.print("Em que lugar chegou? ");

        //define a variavel como o input do utilizador
        lugar = input.nextInt();

        switch (lugar) {
            case 1:
                System.out.println("Recebe 10 pontos!");
                break;
            case 2:
                System.out.println("Recebe 8 pontos!");
                break;
            case 3:
                System.out.println("Recebe 6 pontos");
                break;
            case 4:
                System.out.println("Recebe 5 pontos!");
                break;
            case 5:
                System.out.println("Recebe 4 pontos!");
                break;
            case 6:
                System.out.println("Recebe 3 pontos!");
                break;
            case 7:
                System.out.println("Recebe 2 pontos!");
                break;
            case 8:
                System.out.println("Recebe 1 ponto!");
                break;
            default:
                System.out.println("Desculpe, não recebe pontos :(");
                break;
        }
    }
}
