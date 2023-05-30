/*
link do desafio no HackerHank: https://www.hackerrank.com/challenges/java-output-formatting?isFullScreen=true
 aprendi a usar uma formatação do printf "%-15s" onde a flag -15 preenche os espaços posterior a palavra com whitespaces até o limite de 15 (exemplo java + 11 whitespace = 15)
 */

package hackerHank;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            if (x < 10) {
                System.out.printf("%-15s00%d%n", s1, x);
            } else if (x < 100) {
                System.out.printf("%-15s0%d%n", s1, x);
            } else {
                System.out.printf("%-15s%d%n", s1, x);
            }
        }
        System.out.println("================================");

    }
}
