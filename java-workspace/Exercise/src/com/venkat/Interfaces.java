package com.venkat;

 interface Animal{
	final int num = 5;
	void bro(); 
}
class dog implements Animal{
	public void bro() {
		System.out.println("Name is shree");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		dog s = new dog();
		System.out.println(s.num);
		s.bro();
	}
}
