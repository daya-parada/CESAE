package FichaPratica03;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ex11) imprime de 0 ate um numero inteiro x(input), atraves de saltos de y(input).
        int lim, salto, start;
        start = 0;

        System.out.print("Introduza um valor limite: ");
        lim = input.nextInt();
        System.out.print("Introduza um valor de salto: ");
        salto = input.nextInt();

        System.out.println(start);
        while (start < lim) {
            System.out.println(start);
            start = start + salto; //atualiza a var lim
        }
    }
}
