package FichaPratica04;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, operador;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        System.out.println("Escolha um operador: ");
        do {
            System.out.println("Digite 1 para escolher soma");
            System.out.println("Digite 2 para escolher subtracao");
            System.out.println("Digite 3 para escolher multiplicacao");
            System.out.println("Digite 4 para escolher divisao");
            System.out.println("0 para sair");
            System.out.print("Digite uma opção: ");
            operador = input.nextInt();
            switch (operador) {
                case 1:
                    System.out.print(num1+num2);
                    break;
                case 2:
                    System.out.print(num1-num2);
                    break;
                case 3:
                    System.out.print(num1*num2);
                    break;
                case 4:
                    System.out.print(num1/num2);
                    break;
                default:
                    System.out.print("operador inválido");
            }
       } while (operador !=4);
    }
}
