package com.venkat;

   class human {
	String name = "This is human";
}
 class male extends human{
	String name = "He is male";
	public void fun() {
		System.out.println(super.name);
	}
}
 class venkat extends male {
	 String name = "Name is venkat";
 }
public class Poly {
	public static void main(String[] args) {
		male s = new male();
		venkat v = new venkat();
		
		s.fun();
		System.out.println(s.name);
		System.out.println(v.name);
		
	}
}

