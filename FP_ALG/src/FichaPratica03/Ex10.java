package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int num;

        System.out.print("Digite um numero: ");
        num = input.nextInt();


        while(num >= 2){
            System.out.println(num);
            num = num - 2;
        }
    }
}
