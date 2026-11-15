package FichaPratica06;
import static FichaPratica06.BibliotecaFP6.*;

public class Ex08 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3}, {4, 4, 4}, {7, 5, 5}};
        int[][] matriz2 = {{7, 5, 2}, {3, 4, 5}, {2, 5, 3}};

        System.out.println("Matriz da soma das matrizes: ");
        somarMatrizes(matriz1, matriz2);

        System.out.println("Somatorio: ");
        int somatorio = somatorioMatrizes(matriz1, matriz2);
        System.out.println(somatorio);

    }
}
