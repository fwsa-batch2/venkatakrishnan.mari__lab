package com.Calculator;

import java.util.Scanner;

interface machine{
	void add(int a, int b);
	void sub(int a, int b);
	void mul(int a, int b);
	void div(int a, int b);
}
class cal implements machine{
	public void add(int number1, int number2) {
		System.out.println("The addition of two number is: " + (number1 + number2));
	}
	public void sub(int number1, int number2) {
		System.out.println("The subtraction of two number is: " + (number1-number2));
	}
	public void mul(int number1, int number2) {
		System.out.println("The multiply of two number is: " + (number1*number2));
	}
	public void div(int number1, int number2) {
		System.out.println("The division of two number is: " + (number1/number2));
	}
}
public class InterCal {

	public static void main(String[] args) {
		cal ad = new cal();
		
		System.out.println("Enter the number1 ");
		Scanner num1 = new Scanner(System.in);
		int number1 = num1.nextInt();
      
		
        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();
		
		ad.add(number1,number2);
		ad.sub(number1,number2);
		ad.mul(number1,number2);
		ad.div(number1,number2);
		
	}
}