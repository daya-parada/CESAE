package FichaPratica02;

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //importa ferramentas scanner

        double saldo, movimentacao, saldoAtual;

        System.out.print("Insira o seu saldo: ");
        saldo = input.nextDouble();

        System.out.print("Insira o valor a movimentar: ");
        movimentacao = input.nextDouble();

        if (saldo > movimentacao) {
            saldoAtual = saldo + movimentacao;
            if (saldoAtual < 0) {
            System.out.print("O seu saldo é insuficiente para concluir a operação");}
            else {
                System.out.print("O seu saldo agora é " + saldoAtual);}
        }
        else {
            saldoAtual = saldo - movimentacao;
            System.out.print("O seu saldo agora é " + saldoAtual);
        }
    }
}
