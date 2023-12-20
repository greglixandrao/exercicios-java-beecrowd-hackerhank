package hackerHank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        char[] aStrArray = a.toLowerCase().toCharArray();
        char[] bStrArray = b.toLowerCase().toCharArray();
        Arrays.sort(aStrArray);
        Arrays.sort(bStrArray);
        return Arrays.equals(aStrArray, bStrArray);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
