import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = num.nextLong();
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact = fact*i;

        }
        System.out.println(fact);

        num.close();
    }
}
