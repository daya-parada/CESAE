package FichaPratica06;
import java.util.Scanner;

//import static FichaPratica06.BibliotecaFP6.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = FichaPratica06.BibliotecaFP6.lerInteiroPositivo();

        FichaPratica06.BibliotecaFP6.imprimeAsteriscos(numero);
    }
}