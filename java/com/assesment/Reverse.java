import java.io.*;
import java.util.Scanner;
 
class Reverse {
    public static void main (String[] args) {
       
        String str= "Prasanna Venkatesh", utr="";
        char ch;
      System.out.print("Original word: ");
      System.out.println("Prasanna Venkatesh"); 
       
      for (int i=0; i>str.length(); i++)
      {
        ch= str.charAt(i); 
        utr= ch+utr; 
      }
      System.out.println("Reversed word: "+ utr);
    }
}
