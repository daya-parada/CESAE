package FichaPratica06;
import java.util.Scanner;
public class Biblioteca {
    static Scanner input = new Scanner(System.in);

    //  Exercicio 1 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * Solicita o nome de um animal
     * @return o barulho que o animal faz
     */
    static void fazerBarulho(String animal) {
        switch (animal) { // seria melhor (animal.toLowerCase())
            case "cao":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub Glub");
                break;
            case "vaca":
                System.out.println("Muuuu");
                break;
            case "porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Não conheço o barulho desse animal!");
        }
    }

    //  Exercicio 2 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * Solicita um número até que seja inteiro e positivo
     * @return o número positivo inserido
     */
    static int lerInteiroPositivo() {
        int numero;

        do {
            System.out.print("introduza um número: ");
            numero = input.nextInt();
        } while (numero <= 0);

        return numero; //só retorna quando é positivo!
    }

    /**
     * A partir de um numero i
     * @return imprime numa linha um número de asteriscos i
     */
    static void imprimirAsteriscos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //  Exercicio 3 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * Função booleana que descobre se num é par
     * @return true, quando num é um par
     */
    static boolean par(int num) {
        return num % 2 == 0;
    }

    /**
     * Função booleana que descobre se num é positivo
     * @return true, quando num é maior que 0
     */
    static boolean positivo(int num) {
        return num >= 0;
    }

    /**
     * Função booleana que descobre se num é primo
     * @return true quando num é primo
     */
    static boolean primo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Função booleana que determina se num é perfeito (igual a soma dos seus divisores)
     * @return true quando num é perfeito
     */
    static boolean perfeito(int num) {
        if (num <= 0) {
            return false;
        }
        int soma = 0; //um num perfeito = a soma dos seus divisores
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;  //num é perfeito se = a soma dos seus divisores
    }

    /**
     * Função booleana que determina se num é triangular (igual a uma soma de números inteiros consecutivos)
     * @return true quando num é triangular
     */
    static boolean triangular(int num) {
        if (num <= 0) {
            return false;
        }
        int soma = 0;
        int i = 1;
        while (soma < num) {
            soma += i;
            i++;
        }
        return soma == num;
    }

    //  Exercicio 4 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * @return  Imprime o menu de analise de números
     */
    static void menuAnalisedeNumero() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Escolha um caso para analisar: ");
        System.out.println("1. Par ou Impar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo");
        System.out.println("4. Perfeito");
        System.out.println("5. Triangular");
        System.out.println("6. Trocar de número");
        System.out.println("0. Sair");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    //  Exercicio 5 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    //  Exercicio 6 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    // no exercicio 5 criamos funcoes para o exercicio 6

    static void menuMaiorNumero() {
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Escolha um caso para analisar: ");
        System.out.println("1. Maior elemento");
        System.out.println("2. Menor elemento");
        System.out.println("0. Sair");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    /**
     * Função que define um vetor de tamanho tamanhoVetor e solicita os inputs dos seus elementos
     * @return um vetor preenchido com inputs
     */
    public static int[] lerVetorInteiros(int tamanhoVetor){
        // define um vetor de tamanho "tamanhoVetor"
        int[] vetor = new int[tamanhoVetor];

        // solicita elementos do vetor de tamanho "tamanhoVetor"
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    /**
     * Função que imprime um vetor de inteiros
     * @return imprime o vetor solicitado
     */
    public static void imprimirVetorInteiros(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" | ");
        }
    }

    static int maior(int[ ] vetor) {
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    static int menor(int[ ] vetor) {
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    static boolean crescente(int[ ] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }

}


