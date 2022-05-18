import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = number.nextInt();
        if(num % 2 ==0){
            System.out.println(num +" "+"is not a prime number");
        }
        else{
            System.out.println(num +" "+"is a prime number");
        }
        number.close();
       }
        
    }

