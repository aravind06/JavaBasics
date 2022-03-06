package hackerrank;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Double amount = scan.nextDouble();
        scan.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(amount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);

        System.out.println("US "+us);
        System.out.println("India "+india);
        System.out.println("China "+china);
        System.out.println("France "+france);
    }
}
