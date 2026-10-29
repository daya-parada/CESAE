package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int a, b, c;

        System.out.print("Introduza um número: ");
        a = input.nextInt();
        System.out.print("Introduza mais um número: ");
        b = input.nextInt();
        System.out.print("Introduza mais um número: ");
        c = input.nextInt();

        // casos possiveis -----> a b c ,  a c b,  b a c,  b c a,  c a b,  c b a

        if (c > b && b > a && c > a){
            System.out.print(a + " " + b + " " + c);
        }
        if (b > c && c > a && b > a){
            System.out.print(a + " " + c + " " + b);
        }
        if (c > a && a > b && c > b){
            System.out.print(b + " " + a + " " + c);
        }
        if (a > c && c > b && a > b){
            System.out.print(b + " " + c + " " + a);
        }
        if (b > a && a > c && b > c){
            System.out.print(c + " " + a + " " + b);
        }
        if (a > b && b > c && a > c){
            System.out.print(c + " " + b + " " + a);
        }

    }

}
