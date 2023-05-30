package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Digite o valor do raio de um círculo:");
        double raio = sc.nextDouble();
        sc.close();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);

    }
}
