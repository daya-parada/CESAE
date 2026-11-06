package FichaPratica04;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //determina se o input é um numero triangular
        //um triangular cabe em: n+n+n+n+n+n. ex: input 6 6+6+6+6+6, 15 15+15+15+15 etc

        int num, triangular = 0;
        boolean numTriangular = false;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        for (int i = 1;  triangular < num; i++) {
            triangular += i;

            if (triangular == num) {
                numTriangular = true;
            }
        }

        if (numTriangular) { //true
            System.out.println(num + " é um número triangular");
        }
        else {
            System.out.println(num + " não é um número triangular");
        }
    }
}
