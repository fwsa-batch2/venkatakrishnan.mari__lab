import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = no.nextInt();
        if(num % 2 ==0){
            System.out.println(num+ " is even");

        }
        else{
            System.out.println(num+ " is odd");
        }
        no.close();
    }
}
