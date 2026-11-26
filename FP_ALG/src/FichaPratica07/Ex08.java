package FichaPratica07;
import static FichaPratica07.Biblioteca.*;
import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca.*;
public class Ex08 {
//Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto, quantidade vendida, valor unitario) e calcule o valor total das vendas
    public static void main(String[] args) throws FileNotFoundException {
        double lucro = totalVendas("FichaPratica07/exercicio_08.csv");

        System.out.println("O lucro total foi igual a " + lucro + " euros");
    }
}
