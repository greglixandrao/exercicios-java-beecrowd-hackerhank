package secao04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int codigo1  = sc.nextInt();
        int numero1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int codigo2  = sc.nextInt();
        int numero2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        sc.close();

        double total = (numero1 * valor1) + (numero2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


    }
}
