package FichaPratica01;
import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // cria 3 variaveis
        int num1, num2, resultado;

        // define o input de um valor
        Scanner input = new Scanner(System.in);

        // imprime um pedido de input ao usuario
        System.out.print ("Insira um valor: ");

        // define a num1 como o input 1
        num1 = input.nextInt();

        // imprime um segundo pedido de input ao usuario
        System.out.print ("Insira outro valor: ");

        // define num2 como o segundo input do usuario
        num2 = input.nextInt();

        // realiza a operaçao
        resultado = num1 + num2;

        // imprime o resultado da operação
        System.out.print ("A soma resulta em: " + resultado);

    }
}
