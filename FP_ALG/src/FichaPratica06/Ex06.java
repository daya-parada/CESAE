package FichaPratica06;
import java.util.Scanner;
import static FichaPratica06.Biblioteca.*;

public class Ex06 {
    public static void main(String[] args) {
        int opcao, tamanho;

        System.out.print("Para o tamanho do vetor, ");
        tamanho = lerInteiroPositivo();

        int[] vetorUtilizador = lerVetorInteiros(tamanho);

        do {

            //imprime o vetor
            System.out.print("Vetor: ");
            imprimirVetorInteiros(vetorUtilizador);

            menuMaiorNumero();
            System.out.print("Escolha a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Maior elemento
                    System.out.println("Escolheu opção 1");
                    System.out.println("O maior elemento é: " + maior(vetorUtilizador));
                    break;

                case 2: // Menor elemento
                    System.out.println("Escolheu opção 2");
                    System.out.println("O menor elemento é: " + menor(vetorUtilizador));
                    break;

                case 3: // Crescente ou não
                    System.out.println("Escolheu opção 3");

                    if (crescente(vetorUtilizador)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não crescente");
                    }
                    break;

                case 0: // Sair
                    System.out.println("Escolheu sair...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}
