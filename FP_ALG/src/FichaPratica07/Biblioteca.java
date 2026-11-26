package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Biblioteca {

    //  Exercicio 1 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    /**
     * Função que le o contedo de um ficheiro e o imprime na consola
     * @param parametro
     * @throws FileNotFoundException
     */
    public static void leFicheiros(String parametro) throws FileNotFoundException {
        File file = new File(parametro);
        PrintWriter printWriter= new PrintWriter(file);

        while (printWriter.hasNextLine()) {
            System.out.println(printWriter.nextLine());
        }

        printWriter.close();
    }

    public static void
}
