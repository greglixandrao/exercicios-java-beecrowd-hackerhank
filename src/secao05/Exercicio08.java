package secao05;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double renda = scan.nextDouble();
        scan.close();

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda > 2000.00 && renda <= 3000.00) {
            renda -= 2000.00;
            double imposto = renda * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (renda > 3000.00 && renda <= 4500.00) {
            double imposto = 80;
            renda -= 3000.00;
            imposto += renda * 0.18;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (renda > 4500.00) {
            double imposto = 350;
            renda -= 4500.00;
            imposto += renda * 0.28;
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
