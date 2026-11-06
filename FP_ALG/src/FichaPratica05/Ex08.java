package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[ ][ ] matriz = new int[3][3]; //define uma matrix 3*3
        
        //linha 0
        System.out.println("---- Matrix 3x3 ----");

        System.out.print("[0][0] "); // linha 0 coluna 0
        System.out.print("[0][1] "); // linha 0 coluna 1
        System.out.println("[0][2]"); // linha 0 coluna 2

        //linha 1
        System.out.print("[1][0] "); // linha 1 coluna 0
        System.out.print("[1][1] "); // linha 1 coluna 1
        System.out.println("[1][2]"); // linha 1 coluna 2

        //linha 2
        System.out.print("[2][0] "); // linha 2 coluna 0
        System.out.print("[2][1] "); // linha 2 coluna 1
        System.out.println("[2][2]"); // linha 2 coluna 2

        System.out.println("--------------------");

        //linha 0
        System.out.print("Elemento [00]: ");
        matriz [0][0] = input.nextInt();
        System.out.print("Elemento [01]: ");
        matriz [0][1] = input.nextInt();
        System.out.print("Elemento [02]: ");
        matriz [0][2] = input.nextInt();

        //linha 1
        System.out.print("Elemento [10]: ");
        matriz [1][0] = input.nextInt();
        System.out.print("Elemento [11]: ");
        matriz [1][1] = input.nextInt();
        System.out.print("Elemento [12]: ");
        matriz [1][2] = input.nextInt();

        //linha 2
        System.out.print("Elemento [20]: ");
        matriz [2][0] = input.nextInt();
        System.out.print("Elemento [21]: ");
        matriz [2][1] = input.nextInt();
        System.out.print("Elemento [22]: ");
        matriz [2][2] = input.nextInt();


        System.out.println("------");
        //linha 0
        System.out.print(matriz[0][0] + " "); // linha 0 coluna 0
        System.out.print(matriz[0][1] + " "); // linha 0 coluna 1
        System.out.println(matriz[0][2] + " "); // linha 0 coluna 2

        //linha 1
        System.out.print(matriz[1][0] + " "); // linha 1 coluna 0
        System.out.print(matriz[1][1] + " "); // linha 1 coluna 1
        System.out.println(matriz[1][2] + " "); // linha 1 coluna 2

        //linha 2
        System.out.print(matriz[2][0] + " "); // linha 2 coluna 0
        System.out.print(matriz[2][1] + " "); // linha 2 coluna 1
        System.out.println(matriz[2][2] + " "); // linha 2 coluna 2
        System.out.println("------");
    }
}
