package com.information;

public class Inform {

	public static void main(String[] args) {
		User userObj = new User();
		userObj.name = "Hello";
		userObj.password = "Pass";
		System.out.println(userObj.toString());
	}
	
}