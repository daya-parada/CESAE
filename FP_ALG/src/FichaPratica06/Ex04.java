package FichaPratica06;
import java.util.Scanner;
import static FichaPratica06.Biblioteca.*;
public class Ex04 {
    public static void main(String[] args) {
        int opcao;

        int numero = lerInteiroPositivo(); //solicita um numero
        System.out.println("Voce escolheu " + numero);

        do {
            menuAnalisedeNumero(); //solicita uma caso para analisar

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: //par ou impar
                    if (par(numero)) {
                        System.out.println(numero + " é par");
                    } else {
                        System.out.println(numero + " é impar");
                    }
                    break;

                case 2: //positivo?
                    if (positivo(numero)) {
                        System.out.println(numero + " é positivo");
                    } else {
                        System.out.println(numero + " não é positivo");
                    }
                    break;

                case 3: // primo?
                    if (primo(numero)) {
                        System.out.println(numero + " é perfeito");
                    } else {
                        System.out.println(numero + " não é perfeito");
                    }
                    break;

                case 4: // perfeito?
                    if (perfeito(numero)) {
                        System.out.println(numero + " é perfeito");
                    } else {
                        System.out.println(numero + " não é perfeito");
                    }
                    break;

                case 5: //triangular?
                    if (triangular(numero)) {
                        System.out.println(numero + " é triangular!");
                    } else {
                        System.out.println(numero + " não é triangular");
                    }
                    break;

                case 6: // troca de número
                    System.out.println("Escolheu trocar de número");
                    System.out.print("Introduza um novo número: ");
                    numero = input.nextInt();
                    System.out.println("Voce escolheu " + numero);
                    break;

                case 0:
                    System.out.println("Escolheu sair");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0); // se == 0 entra no case 0 (Sair)
    }
}
