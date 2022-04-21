import java.util.Scanner;

public class calc{

    public static int add(int x, int y){
        int add = x + y;
        return add;
    }
    public static int sub(int x, int y){
        int sub = x - y;
        return sub;
    }
    public static int mul(int x, int y){
        int mul = x * y;
        return mul;
    }
    public static int div(int x, int y){
        int div = x / y;
        return div;
    }


    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        System.out.println("Enter the operator");
        Scanner oper = new Scanner(System.in);
        String operator = oper.nextLine();

        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();


       int output = 0;
       

       switch(operator) {
           case "+":
           output = add(number1,number2);
           break;
       
           case "-":
           output = sub(number1,number2);
           break;
           
           case "*":
           output = mul(number1,number2);
           break; 
            
           case "/":
           output = div(number1,number2);
           break;

       }
       System.out.println("Your answer is: " + output);
    }
}