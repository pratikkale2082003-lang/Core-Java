package oops;


//Hiding all unncessary  detail and showing only important part to user


//Abstraction : Hiding implementation detail And Showing only the functionality....

//Abstract Class: can not created object with Abstract class..

//Can have abstract / non abstract methods
//can have constructors

  abstract class Animal07{// parent class
	  String color;
	  
	   Animal07(){ // constructor
		   System.out.println(" color is red");
	   }
	  void eats() {
		  System.out.println("Animal is eat non veg");
	  }
	  abstract void walks();
	   
 }

  
  class Horse extends Animal07 { //childclass1
	  Horse(){
		  System.out.println("yello");
	  }
	  void walks() {
		  System.out.println("Horse is  4 legs ");
	  }
  }

   class Chicken  extends Animal07{//childclass2
	   Chicken(){
		   
		   System.out.println("black");
	   }
	   
	   void walks() {
		   System.out.println("Chicken is  2 legs");
	   }
   }


public class Abstraction {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.eats();
		h.walks();
//		System.out.println(h.color);
		System.out.println("----------------------------------------------------------------------------------------------");
		
		
		Chicken  c = new Chicken();
		c.eats();
		c.walks();
	}

}
