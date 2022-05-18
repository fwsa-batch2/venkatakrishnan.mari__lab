package com.exception;
public class except {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            int[] b = {1,2,3,4,5};
            System.out.println(a);
            System.out.println(b[6]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithemetic error");
            // e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException u){
            System.out.println("Array error");
            // u.printStackTrace();
        }
    }
}