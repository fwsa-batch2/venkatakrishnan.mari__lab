import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String name = "Venkat";
        char[] name1 = {'V','e','n','k','a','t'};
         int[] number ={20,34,56,10};
           

        String fx = String.valueOf(name1);
        String ex = Arrays.toString(number);
        System.out.println(name);
        System.out.println("My name is " + fx);
        System.out.println("The given number is: " + ex);
    }
}
