package hackerHank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int height = scan.nextInt();
        scan.close();

        try {
            if (base > 0 && height > 0) {
                System.out.println(base * height);
            } else throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
