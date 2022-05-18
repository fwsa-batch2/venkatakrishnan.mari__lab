import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = number.nextInt();
        int result = 0;
        for(int i=1;i<num;++i){
            if(num % i == 0){
                result += i;
            }
            
        }
        System.out.println(result +" is a perfect number");
        number.close();
    }
}
