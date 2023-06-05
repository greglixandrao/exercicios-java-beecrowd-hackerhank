package hackerHank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/hackerHank/teste.txt"));
        int i = 1;
        while (scan.hasNext()) {
            String line = scan.nextLine();
            System.out.println(i + " " + line);
            i++;
        }

    }
}
