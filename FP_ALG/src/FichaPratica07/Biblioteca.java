package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica06.BibliotecaFP6.*;

public class Biblioteca {

    //  Exercicio 1 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * Scanner! Função que le ficheiro e imprime seu conteudo na consola)
     * @throws FileNotFoundException
     */
    public static void leFicheirosnaConsola(String caminho) throws FileNotFoundException {
        File file = new File(caminho); //cria ou acessa o file
        Scanner sc = new Scanner(file); //cria o scanner e o associa ao file

        while (sc.hasNextLine()) { // le e imprime linha a linha, enquanto houver conteudo
            String linha = sc.nextLine(); // le linha no file
            System.out.println(linha); // imprime linha na consola
        }
        sc.close(); //fecha o file
    }

    //  Exercicio 2 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * PrintWrite! Cria um arquivo e imprime uma mensagem padrão dentro dele
     * @param caminho
     * @throws FileNotFoundException
     */
    public static void criaFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Esse ficheiro foi criado a partir de uma função!");
        printWriter.println("Parabéns!");

        printWriter.close(); //salva e fecha o ficheiro
        System.out.println("Ficheiro criado e salvo com sucesso!");
    }

    //  Exercicio 3 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    /**
     * Le um file, cria um novo file com a cópia do conteudo do file original
     * @param caminhoOrigem
     * @param caminhoDestino
     * @throws FileNotFoundException
     */
    public static void copiaFicheiro(String caminhoOrigem, String caminhoDestino) throws FileNotFoundException {
        File fileOrigem = new File(caminhoOrigem);
        File fileDestino = new File(caminhoDestino);

        Scanner sc = new Scanner(fileOrigem); //instancia scanner no file origem
        PrintWriter printWritter = new PrintWriter(fileDestino); //instancia o printWriter no file destino

        while (sc.hasNextLine()){ // le fileOrigem e escreve fileDestino linha a linha
            String linha = sc.nextLine(); // le linha file origem
            printWritter.println(linha); //escreve linha no file destino
        }

        sc.close(); //salva e fecha o ficheiro
        printWritter.close();

        System.out.println("Ficheiro copiado com sucesso!");
    }

    /**
     * Le ficheiro CVS separado por virgulas e imprime seu conteúdo na consola
     * @param caminho
     * @throws FileNotFoundException
     */
    //  Exercicio 4 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    public static void imprimeFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) { //enquanto houver linhas em file
            String linha = sc.nextLine(); // le linha no file origem
            String[] colunas = linha.split(";"); // encontra o fim da coluna

            for (int i = 0; i< colunas.length; i++) {
                if (i < colunas.length - 1) {  // o -1 serve para ignorar o comando na ultima coluna
                    System.out.print(colunas[i] + " | ");
                }
                else { System.out.print(colunas[i]); // print da última coluna
                }
            }
            System.out.println(); //quebra de linha
        }
        sc.close();
    }

    //  Exercicio 5 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    public static int somaColuna(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);
        int soma = 0;

        while (sc.hasNextLine()) { //enquanto houver linhas em file
                soma = soma + sc.nextInt(); //sc.nextInt le ate o proximo numero inteiro
        }

        sc.close();
        return soma;
    }

    //  Exercicio 6 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    public static void imprimeNomedoMaisVelho(String caminho) throws FileNotFoundException{
        File file = new File(caminho);
        Scanner sc = new Scanner(file);
        int maiorIdade = 0;
        String nomeMaisVelho = ""; //inicia nomeMaisVelho antes do ciclo


        while (sc.hasNextLine()) { //enquanto houver linhas em file
            String linha = sc.nextLine(); // le linha no file origem
            String[] colunas = linha.split(","); // cria um array e define "," como o fim de cada index

           String nome = colunas[0]; //indice 0 tem os nomes
           int idade = Integer.parseInt(colunas[1]); //indice 1 tem as idades

            if (idade > maiorIdade){
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }
        }

        sc.close();
        System.out.println("O nome do mais velho é " + nomeMaisVelho + " que tem " + maiorIdade + " anos.");
    }

    //  Exercicio 7 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    public static void contarLinhasEpalavras(String caminho) throws FileNotFoundException{
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int contadorLinhas = 0;
        int contadorPalavras = 0;

        while (sc.hasNextLine()) { //enquanto houver linhas em file
            String linha = sc.nextLine(); // le linha no file
            contadorLinhas = contadorLinhas + 1; //incrementa o contador a cada ciclo

            String[] palavras = linha.split(" "); // cria um array palavras[] e define " " como separador
            contadorPalavras = contadorPalavras + palavras.length; // total acumulado + tamanho total do array
        }
        sc.close();

        System.out.println("Total de Linhas: " + contadorLinhas);
        System.out.println("Total de Palavras: " + contadorPalavras);
    }

    //  Exercicio 8 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    /**
     * Le um ficheiro e calcula o lucro a partir do valor unitario de produtos e numero de vendas
     * @param caminho
     * @return Lucro (total de vendas * preço)
     * @throws FileNotFoundException
     */
    public static double totalVendas(String caminho) throws FileNotFoundException {
        File file = new File(caminho); //cria ou acessa o file
        Scanner sc = new Scanner(file); //cria o scanner e o associa ao file
        double lucro = 0;

        if (sc.hasNextLine()) { //salta o cabeçalho
            sc.nextLine();
        }

        while (sc.hasNextLine()) { //enquanto houver linhas em file
            String linha = sc.nextLine(); // le linha no file
            String[] colunas = linha.split(","); // cria um array colunas e separa por ","

            int quantidadeVendida = Integer.parseInt(colunas[2]); //converte quantidade para int
            double preco = Double.parseDouble(colunas[3]); //converte preço para double

            lucro = lucro + quantidadeVendida * preco; //acumula o lucro do ciclo anterior, ao novo quantidade*preço
        }
        sc.close();
        return lucro;
    }


    //  Exercicio 9 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    /**
     * Função que conta o número de linhas no ficheiro CSV (ignorando um cabeçalho)
     * @param caminho
     * @return numero de linhas num ficheiro CSV
     * @throws FileNotFoundException
     */
    public static int contaLinha(String caminho) throws FileNotFoundException {
        File file = new File(caminho); //cria ou acessa o file
        Scanner sc = new Scanner(file); //cria o scanner e o associa ao file
        int contador = 0;

        if (sc.hasNextLine()) { //ignora a primeira linha
            sc.nextLine();
        }

        while (sc.hasNextLine()) { //enquanto houver linhas em file
            contador = contador + 1; // soma uma linha a cada ciclo
            sc.nextLine(); // pula para a proxima linha
        }

        sc.close();
        return contador;
    }

    /**
     * Imprime elementos de uma determinada coluna.
     * @param caminho
     * @throws FileNotFoundException
     */

    public static void imprimirColunaFicheiro(String caminho, int coluna) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) { //ignora a primeira linha
            sc.nextLine();
        }

        while (sc.hasNextLine()) { //enquanto houver linhas em file
            String linha = sc.nextLine(); //pula para a proxima linha
            String[] elementos = linha.split(",");

            if (coluna < elementos.length) {
                System.out.println("Opção 1: "elementos[coluna]);
            }
        }

        sc.close();
    }
}
