package com.venkat;

  abstract class mobile{
	  abstract void display();
	  abstract void charger();
  } 
  class redmi extends mobile{
	  public void display() {
		  System.out.println("Redmi display is super");
	  }
	  public void charger() {
		  System.out.println("Redmi charger is powerful");
	  }
	  
  }
  class samsung extends mobile{
	  public void display() {
		  System.out.println("Samsung display is Ok");
	  }
	  public void charger() {
		  System.out.println("Samsung charger is bad");
	  }
  }
public class abstracts {

	public static void main(String[] args) {
		redmi v = new redmi();
		samsung s = new samsung();
		v.display();
		v.charger();
		s.display();
		s.charger();

	}

}
