package FichaPratica02;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //importa as ferramentas scanner
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        int salario;

        //solicita o input ao utilizador
        System.out.print("Valor do Salário: ");

        //define a variavel como o input do utilizador
        salario = input.nextInt();

        //condição e print
        if (salario >= 15000)
            System.out.println("Paga taxa de 30%: " + salario * 30/100);
        else
            System.out.println("Paga taxa de 20%: " + salario * 20/100);

    }
}
