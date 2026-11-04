package FichaPratica04;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        // sobre o ciclo for
        // i é o divisor
        // (int i = 1) define um contador inicial
        // (i <= num) é a condição que será verificada a cada iteração
        // (i++) atualiza o contador

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i); // imprime apenas se o resto for 0
            }
        }
    }
}
