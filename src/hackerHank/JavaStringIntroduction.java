package hackerHank;

import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int totalLength = str1.length() + str2.length();
        int isLexicographically = str1.compareTo(str2);

        System.out.println(totalLength);
        if (isLexicographically > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) + " " + str2.substring(0, 1).toUpperCase() + str2.substring(1));
    }
}
