package secao05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracao;
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
