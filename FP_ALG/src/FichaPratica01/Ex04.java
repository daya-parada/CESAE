package FichaPratica01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        //cria as variaveis
        double raio, pi, area;

        //input
        Scanner input = new Scanner(System.in);

        //solicita ao utilizador o input do raio
        System.out.print ("Valor do raio: ");
        // define a variavel raio como o input
        raio = input.nextInt();
        pi = 3.14;

        //calcula a area
        area = pi * raio * raio;

        //imprime o resultado
        System.out.println("A área de uma circunferencia de raio " + raio + " é igual a " + area);
    }
}
