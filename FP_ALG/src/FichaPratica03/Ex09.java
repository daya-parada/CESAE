package FichaPratica03;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a media será o somatório dos valores inseridos a cada ciclo / numero de ciclos

        int num, goal, som, tentativas, media;
        goal = -1;
        num = som = tentativas = 0; // inicia o ciclo com valores nulos

        while (num != goal) {
            System.out.print("Introduza um número: ");
            num = input.nextInt(); // atualiza o num a cada novo ciclo
            som = som + num; // atualiza o somatorio
            // System.out.println("somatorio = "+ som); //imprime pra que eu cheque se esta correto
            tentativas = tentativas + 1; //cada ciclo é mais uma tentativa
        }

        tentativas = tentativas -1; //exclui o ultimo ciclo, onde foi inserido o valor correto -1
        som = som + 1; //elimina o ultimo ciclo, onde foi inserido o valor correto -1

        media = som / tentativas; // a media é o somatorio / numero de tentativas
        System.out.println("Media = " + media + ", Tentativas: " + tentativas);

    }
}
