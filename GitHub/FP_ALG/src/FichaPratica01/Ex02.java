package FichaPratica01;
import com.sun.jdi.connect.Connector;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        //cria as variaveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        //input
        Scanner input = new Scanner(System.in); //importa as ferramentas de leitura do codigo

        //solicita um primeiro input do usuario
        System.out.print ("Insira um valor: ");
        // define num1 como o input
        num1 = input.nextInt();

        //solicita mais um input do usuario
        System.out.print ("Insira outro valor: ");
        // define num2 como o input
        num2 = input.nextInt();

        //realiza as operaçoes
        soma = num1 * num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        //imprime os resultados
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: "+ multiplicacao);
        System.out.println("Divisão sem resto: "+ divisao);

    }
}