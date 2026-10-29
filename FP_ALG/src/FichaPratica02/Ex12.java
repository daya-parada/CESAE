package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        String menu, criar, atualizar, eliminar, sair;

        System.out.print("Insira uma das opções: criar, atualizar, eliminar ou sair: ");
        menu = input.next();

        switch (menu) {
            case "criar":
                System.out.print("Você optou por: " + menu);
                break;
            case "atualizar":
                System.out.print("Você optou por: " + menu);
                break;
            case "eliminar":
                System.out.print("Você optou por: " + menu);
                break;
            case "sair":
                break;
            default:
                System.out.println("Opção inválida");
        }


    }
}
