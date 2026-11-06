package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int [10];  // matrix de 0 a 9

        for (int i = 0; i < 10 ; i++) { // solicita inputs do 0 ao 9
            System.out.print("Insira no Array: [" + i + "]: ");
            vetor [i] = input.nextInt();
        }
        // ao inves te i < 10 no campo while, posso colocar vetor.length!!!
    }
}


