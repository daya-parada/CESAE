package FichaPratica01;
import java.util.Scanner;
public class EX08 {
    public static void main(String[] args) {

        //importa as ferramentas de leitura do codigo
        Scanner input = new Scanner(System.in);
        int minMus1, minMus2, minMus3, minMus4, minMus5,segMus1,segMus2,segMus3,segMus4,segMus5, aux, minutosT, segundosT, hr, min, seg;

        //solilcita os inputs
        System.out.print ("Minutos da Música 1: ");
        minMus1 = input.nextInt();
        System.out.print ("Segundos da Musica 1: ");
        segMus1 = input.nextInt();

        System.out.print ("Minutos da Música 2: ");
        minMus2 = input.nextInt();
        System.out.print ("Segundos da Musica 2: ");
        segMus2 = input.nextInt();

        System.out.print ("Minutos da Música 3: ");
        minMus3 = input.nextInt();
        System.out.print ("Segundos da Musica 3: ");
        segMus3 = input.nextInt();

        System.out.print ("Minutos da Música 4: ");
        minMus4 = input.nextInt();
        System.out.print ("Segundos da Musica 4: ");
        segMus4 = input.nextInt();

        System.out.print ("Minutos da Música 5: ");
        minMus5 = input.nextInt();
        System.out.print ("Segundos da Musica 5: ");
        segMus5 = input.nextInt();

        //soma e transforma tudo em segundos
        minutosT = (minMus1 + minMus2 + minMus3 + minMus4 + minMus5) * 60;
        segundosT = segMus1 + segMus2 + segMus3 + segMus4 + segMus5;

        //calcula horas, minutos e segundos
        hr = (minutosT + segundosT) / 3600; //converte de volta para hora
        aux = (minutosT + segundosT) % 3600; // sobram minutos que nao chegam a formar uma hora
        min = aux / 60; // converte de volta para minutos
        seg = aux % 60; // sobra segundos que nao chegam a formar um minuto

        //imprime o resultado
        System.out.println("Total do Album: " + hr + "hrs " + min + "min " + seg + "s ");
    }
}
