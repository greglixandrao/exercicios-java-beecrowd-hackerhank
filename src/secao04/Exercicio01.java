package secao04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número");
        int n2 = sc.nextInt();

        sc.close();

        int soma = n1 + n2;
        System.out.printf("A soma de %d com %d é igual à %d", n1, n2, soma);
    }




}
