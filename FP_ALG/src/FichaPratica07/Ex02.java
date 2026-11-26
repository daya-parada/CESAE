package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca.*;

public class Ex02 {
//Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.
    public static void main(String[] args) throws FileNotFoundException { // cria se nao existir, reescreve caso já exista
        criaFicheiro("FichaPratica07/exercicio_02.txt");
    }
}
