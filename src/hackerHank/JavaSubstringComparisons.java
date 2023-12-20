package hackerHank;

import java.util.*;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        int size = scan.nextInt();
        List<String> strlist = new ArrayList<String>();

        for (int i = 0; i < string.length() - size + 1; i++) {
            strlist.add(string.substring(i, i + size));
        }
        Collections.sort(strlist);

        System.out.println(strlist.get(0));
        System.out.println(strlist.get(strlist.size() - 1));
    }
}
