package FichaPratica03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        int num;
        num = 1;

        while (num <= 400) {
            if (num%2 == 0) {
                System.out.println(num);
            }
            num = num + 1; // atualiza a variavel
        }
    }
}
