import java.util.Scanner;

public class fibonacci {
    
            public static void main(String[] args) {
                Scanner num = new Scanner(System.in);
                System.out.println("Enter your number");
             int fibNum = 10, firstNum = 0, secNum = 1;
             System.out.println("Fibonacci series of " + fibNum);
             for(int i=1; i<=fibNum; ++i){
                 System.out.print(firstNum + ",");
                 int addNum = firstNum + secNum;
                 firstNum = secNum;
                 secNum = addNum;
        
             }
             num.close();
        
            }
        
    }
    

