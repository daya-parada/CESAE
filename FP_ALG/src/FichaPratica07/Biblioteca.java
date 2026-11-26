package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

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
    public static void contaLinhas(String caminho) throws FileNotFoundException{
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int contadorLinhas = 0;
        int contadorColunas = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine(); // le linha no file origem
        }

    }


    //  Exercicio 9 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    /**
     * Função que conta o número de músicas (linhas) no ficheiro CSV (ignorando a primeira linha)
     * @param caminho
     * @return numero de musicas (linhas) num ficheiro CSV
     * @throws FileNotFoundException
     */
    public static int contarMusicasFicheiro(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        int contador = 0;
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        while (sc.hasNextLine()) {
            contador = contador + 1;
            sc.nextLine();
        }

        sc.close();
        return contador;
    }

    /**
     * Le um ficheiro CSV e escreve-os em uma matriz
     * @param caminho
     * @return matriz com nome, artista, genero
     * @throws FileNotFoundException
     */
    public static String[][] lerMusicas(String caminho) throws FileNotFoundException {
        int numMusicas = contarMusicasFicheiro(caminho);
        String [][] matriz = new String[numMusicas][14];

        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) { //pula o cabecalho
            sc.nextLine();
        }

        int i = 0;
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String [] itensDaLinha = linha.split(",");

            matriz[i] = itensDaLinha;
            matriz[i][15] = itensDaLinha[15];
            matriz[i][16] = itensDaLinha[16];
            matriz[i][17] = itensDaLinha[17];

            i = i+ 1;
        }

        sc.close();
        return matriz;
    }


}
