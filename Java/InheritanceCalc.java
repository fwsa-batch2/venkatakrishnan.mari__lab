import java.util.Scanner;

interface machine{
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}
class operation implements machine{
    public void add(int a, int b){
        System.out.println("The addition of two number: " + (a+b));
    }
    public void sub(int a, int b){
        System.out.println("The Subtraction of two number: " + (a-b));
    }
    public void mul(int a, int b){
        System.out.println("The Multiplication of two number: " + (a*b));
    }
    public void div(int a, int b){
        System.out.println("The division of two number: " + (a/b));
    }

}
public class InheritanceCalc {
    public static void main(String[] args) {
        operation total = new operation();


        System.out.println("Enter the number");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        System.out.println("Enter the number");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

          total.add(number1, number2);
          total.sub(number1, number2);
          total.mul(number1, number2);
          total.div(number1, number2);




        
    }
}
