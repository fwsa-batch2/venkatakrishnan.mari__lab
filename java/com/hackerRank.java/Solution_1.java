import java.util.*;
import java.text.NumberFormat;

public class Solution_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        // Locale indiaLocale = new Locale("en", "IN");
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance( new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("C:hina " + china);
        System.out.println("France: " + france);
    }
}
