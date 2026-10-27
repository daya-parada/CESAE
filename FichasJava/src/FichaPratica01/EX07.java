package FichaPratica01;
import java.util.Scanner;
public class EX07 {
    public static void main(String[] args) {

        //importa as ferramentas de leitura do codigo
        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3, desconto1, desconto2, desconto3;

        //solicita ao utilizador o valor do produto 1
        System.out.print ("Valor sem desconto do produto 1: ");
        // define a variavel prod1 como sendo igual ao input
        prod1 = input.nextInt();

        //solicita ao utilizador o valor do produto 1
        System.out.print ("Valor sem desconto do produto 2: ");
        // define a variavel prod2 como sendo igual ao input
        prod2 = input.nextInt();

        //solicita ao utilizador o valor do produto 3
        System.out.print ("Valor sem desconto do produto 3: ");
        // define a variavel prod1 como sendo igual ao input
        prod3 = input.nextInt();

        //calcula os descontos
        desconto1 = prod1 - (prod1 * 10/100);
        desconto2 = prod2 - (prod1 * 10/100);
        desconto3 = prod3 - (prod1 * 10/100);

        System.out.println("Valor do produto 1 com desconto: " + desconto1);
        System.out.println("Valor do produto 2 com desconto: " + desconto2);
        System.out.println("Valor do produto 3 com desconto: " + desconto3);

    }

}
