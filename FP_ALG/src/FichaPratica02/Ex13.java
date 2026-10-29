package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        int horas24, minutos, horas12;

        System.out.print("Introduza as horas utilizando o sistema 24hrs: ");
        horas24 = input.nextInt();
        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas24 < 12) {
            horas12 = horas24;
            System.out.print("Agora são: "+ horas12 + ":" + minutos + " AM");
        }
        else {
            horas12 = horas24 - 12;
            System.out.print("Agora são: " + horas12 + ":" + minutos + " PM");
        }
    }
}
