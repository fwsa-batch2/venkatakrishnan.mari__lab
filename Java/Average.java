import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = num.nextInt();
            int avg = (number/2);
            System.out.println("Average of the Number is " +avg);

            num.close();
            }
        
        
    }
    

