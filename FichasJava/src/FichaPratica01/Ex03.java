package FichaPratica01;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        //cria as variaveis
        int ladoA, ladoB, area, perimetro;

        //input
        Scanner input = new Scanner(System.in);

        //solicita o lado A do retangulo
        System.out.print ("Comprimento do lado A: ");
        // define num1 como o input
        ladoA = input.nextInt();

        //solicita o lado B do retangulo
        System.out.print ("Comprimento do Lado B ");
        // define num2 como o input
        ladoB = input.nextInt();

        //realiza as operaçoes
        area = ladoA * ladoB;
        perimetro = ladoA*2 + ladoB*2;

        //imprime o resultado
        System.out.println("Área do retangulo: " + area);
        System.out.println("Perímetro do retangulo: " + perimetro);

    }




}
