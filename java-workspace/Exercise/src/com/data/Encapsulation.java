package com.data;

    class userdata{
    	private long accountNumber;
    	private String password;
    	private String name;
    
    
    public long getAccountNumber() {
    	return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
    	this.accountNumber = accountNumber;
    }
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	if(password != " ") {
    	this.password = password;
    }
    	
      }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    }
public class Encapsulation {

	public static void main(String[] args) {
		
		
		userdata obj = new userdata();
		
		obj.setAccountNumber(1234567823232323l);
		obj.setPassword("venkat434");
		obj.setName("Venkata krishnan");
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Password: " + obj.getPassword());
		System.out.println("AccNo: " + obj.getAccountNumber());
		

	}

}
