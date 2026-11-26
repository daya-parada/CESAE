package FichaPratica07;
import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca.*;
public class Ex03 {
//Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro
    public static void main(String[] args) throws FileNotFoundException {
        copiaFicheiro("FichaPratica07/exercicio_03.txt", "FichaPratica07/exercicio_03copia.txt");
    }

}
