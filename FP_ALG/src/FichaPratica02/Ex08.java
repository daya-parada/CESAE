package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //cria as variaveis
        int nota, nota25, nota35, nota40, notaf;

        //solicita o input ao utilizador
        System.out.print("Introduza um número: ");

        //define a variavel como o input do utilizador
        nota = input.nextInt();

        if (notaf >=9.5){
            System.out.println("Está aprovado!");
        }
        else {
            System.out.println("Foi reprovado :(");
        }
    }
}
