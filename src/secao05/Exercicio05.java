package secao05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidadeProduto = sc.nextInt();
        double total = 0;

        if (codigo == 1) {
            total = quantidadeProduto * 4;
        } else if (codigo == 2) {
            total = quantidadeProduto * 4.5;}
        else if (codigo == 3) {
            total = quantidadeProduto * 5;
        } else if (codigo == 4) {
            total = quantidadeProduto * 2;
        } else if (codigo == 5) {
            total = quantidadeProduto * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
