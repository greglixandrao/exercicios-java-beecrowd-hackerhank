package hackerHank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale india = new Locale("en", "IN");
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double currencyAmount = scan.nextDouble();

        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat yuanFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        DecimalFormat rupiaFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(india);
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(india);
        dfs.setCurrencySymbol("Rs.");
        rupiaFormat.setDecimalFormatSymbols(dfs);


        System.out.println("US: " + dollarFormat.format(currencyAmount));
        System.out.println("India: " + rupiaFormat.format(currencyAmount));
        System.out.println("China: " + yuanFormat.format(currencyAmount));
        System.out.println("France: " + euroFormat.format(currencyAmount));

    }
}
