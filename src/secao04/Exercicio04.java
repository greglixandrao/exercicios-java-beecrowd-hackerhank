package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas pelo funcionário:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor da hora do funcionário:");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
        sc.close();
    }
}
