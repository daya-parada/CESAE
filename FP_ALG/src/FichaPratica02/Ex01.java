package FichaPratica02;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        //cria 2 variaveis
        int num1, num2;

        //importa as ferramentas de leitura do codigo
        Scanner input = new Scanner(System.in);

        //solilcita inputs
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        if (num1 >= num2)
            System.out.println(num1 + " é maior ou igual a " + num2);
        else
            System.out.println(num2 + " é maior ou igual a " + num1);
    }
}
