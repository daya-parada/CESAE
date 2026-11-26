package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Biblioteca.*;
public class Ex09 {
// Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género, duração) para uma matriz.
    public static void main(String[] args) throws FileNotFoundException {
    //menu com opções, sendo que cada uma delas albergará as seguintes alíneas.

        imprimirColunaFicheiro("FichaPratica07/exercicio_09.csv", 0);
        imprimirColunaFicheiro("FichaPratica07/exercicio_09.csv", 1);
        imprimirColunaFicheiro("FichaPratica07/exercicio_09.csv", 2);
        imprimirColunaFicheiro("FichaPratica07/exercicio_09.csv", 3);

        Scanner input = new Scanner(System.in); //
        int opcao = 0;

        System.out.println("xx==xx==xx==xx==xx==xx==xx");
        System.out.println("xx======== MENU ========xx");
        System.out.println("[1] pesquisar por genero");
        System.out.println("[2] pesquisar por artista");
        System.out.println("[3] pesquisar por duração");
        System.out.println("[4] pesquisar por duração maior que x");
        System.out.println("[5] mostrar numero de músicas no ficheiro");
        System.out.println("[0] sair");
        System.out.println("xx==xx==xx==xx==xx==xx==xx");
        System.out.println("xx==xx==xx==xx==xx==xx==xx");
        System.out.print("xx == Insira a sua opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1: // pesquisa por genero
                int genero = 0;
                System.out.println("xx== menu ==xx");
                System.out.println("(1) Rock");
                System.out.println("(2) Rock and Roll");
                System.out.println("(3) Heavy Metal");
                System.out.println("(4) Pop");
                System.out.println("(5) Folk");
                System.out.print("Digite a sua opção: ");
                genero = input.nextInt();

                switch (genero) {
                    case 1: //imprime true rock
                        break;
                    case 2: //imprime true rock and roll
                        break;
                    case 3:  //imprime true rock heavy metal
                        break;
                    case 4: //imprime true pop
                        break;
                    case 5: //imprime true folk
                        break;
                }
                break;

            case 2: // pesquisa por artista
                break;

            case 3: // pesquisa por duração
                break;

            case 4: // pesquisa por duração maior que x
                break;

            case 5: // imprime o número de músicas no ficheiro
                System.out.println("Este ficheiro contem " + contaLinha("FichaPratica07/exercicio_09.csv") + " músicas");
                break;

            case 0: // sair
                System.out.println("Escolheu sair! Obrigado!");

                break;

            default: System.out.println("Opção inválida");
        }
    }

}
