import java.util.*;  
public class Swap {  
    public static void main(String[] args) {  
       int a, b, t;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of A and B");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("before swapping numbers: "+a +"  "+ b);  
        
       t = a;  
       a = b;  
       b = t;  
       System.out.println("After swapping numbers: "+a +"   " + b);  
       System.out.println( );  
       sc.close();
    }    
}  