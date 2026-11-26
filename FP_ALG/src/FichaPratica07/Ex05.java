package FichaPratica07;
import static FichaPratica07.Biblioteca.*;
import java.io.FileNotFoundException;

public class Ex05 {
// Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e calcule a soma desses números.
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A soma dos números inteiros do ficheiro é: " + somaColuna("FichaPratica07/exercicio_05_31.txt"));
    }
}
