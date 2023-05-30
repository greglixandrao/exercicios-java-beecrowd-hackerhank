package secao04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {

        double largura, comprimento, area, preco, valorTerreno;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite a comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        preco = sc.nextDouble();

        area = largura * comprimento;
        valorTerreno = area * preco;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", valorTerreno);
//        **** Para ficar o aprendizado, diferença entre println e printf ****
//        System.out.println("AREA = " + area);
//        System.out.println("PRECO = " + valorTerreno);
        sc.close();
    }
}