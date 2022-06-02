import java.util.*;
import java.text.NumberFormat;
public class numberFormat {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        double d = 12345.445;
        System.out.println("English representation of " + d + nf.format(d));
    }
}
