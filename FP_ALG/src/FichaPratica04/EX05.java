package FichaPratica04;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("-----> Por favor, escolha uma opção: ");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Insira o numero da sua opção: ");
            opcao=input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolheu criar!");
                    break;
                case 2:
                    System.out.println("Escolheu atualizar!");
                    break;
                case 3:
                    System.out.println("Escolheu eliminar!");
                    break;
                case 4:
                    System.out.println("Escolheu sair!");
                    break;
                default:
                    System.out.println("Opção invalida...");
            }
        } while (opcao !=4);

        System.out.println("Obrigado e volte sempre!");
    }
}
