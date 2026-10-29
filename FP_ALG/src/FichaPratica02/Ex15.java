package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int a, b, c;
        String opcao;

        System.out.print("Introduza um número: ");
        a = input.nextInt();
        System.out.print("Introduza um segundo número: ");
        b = input.nextInt();
        System.out.print("Introduza um terceiro número: ");
        c = input.nextInt();

        System.out.print("Escolha C para ordem crescente ou D para ordem decrescente: ");
        opcao = input.next();

        switch (opcao) {
            case "C": //crescente
                System.out.print("em construcao ... ");

                if (a < b && b < c && c > a){
                    System.out.println("abc");
                    System.out.print(a + " " + b + " " + c);
                }
                if (a < c && c < b && b > a){
                    System.out.println("acb");
                    System.out.print(a + " " + c + " " + b);
                }
                if (b < a && a < c && c > b){
                    System.out.println("bac");
                    System.out.print(b + " " + a + " " + c);
                }
                if (b < c && c < a && a > b){
                    System.out.println("bca");
                    System.out.print(b + " " + c + " " + a);
                }
                if (c < a && a < b && b > c){
                    System.out.println("cab");
                    System.out.print(c + " " + a + " " + b);
                }
                if (c < b && b < a && a > c){
                    System.out.println("cba");
                    System.out.print(c + " " + b + " " + a);
                }
                break;

            case "D": //decrescente
                if (a > b && b > a && c < a){
                    System.out.print(a + " " + b + " " + c);
                }
                if (a > c && c > a && b < a ){
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
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
