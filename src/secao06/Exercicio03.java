package secao06;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4) {
            if (opcao == 1)
                alcool++;
            else if (opcao == 2)
                gasolina++;
            else if (opcao == 3)
                diesel++;
            opcao = scan.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scan.close();
    }
}
