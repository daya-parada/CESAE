package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int inteiro, aux;
        inteiro = 1;
        aux = 1;

        while (inteiro <= 100) {
            System.out.println(inteiro);
            inteiro = inteiro + 1;
            aux = aux + inteiro;
        }

        System.out.println(aux - 1);
    }
}
