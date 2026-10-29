package FichaPratica03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int num;
        num = 531;

        while (num <= 750) {
            if (num%2 != 0) {
                System.out.println(num);
            }
            num = num + 1; // atualiza a variavel
        }
    }
}
