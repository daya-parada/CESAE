package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //cria as variaveis
        int salario;

        //solicita o input ao utilizador
        System.out.print("Valor do Salário: ");

        //define a variavel como o input do utilizador
        salario = input.nextInt();

        if (salario <= 15000)
            System.out.println("Paga uma taxa de 20%: " + salario * 20/100);

        if (salario > 15000 && salario <= 20000)
            System.out.println("Paga uma taxa de 30%: " + salario * 30/100);

        if (salario > 20000 && salario <= 25000)
            System.out.println("Paga uma taxa de 30%: " + salario * 35/100);

        if (salario > 25000)
            System.out.println("Paga uma taxa de 40%: " + salario * 40/100);

    }
}
