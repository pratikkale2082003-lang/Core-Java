

package oops;

// multilevel inheritance= child class inherits from another class, it is called multilevel inheritance.
//                            child class form another class and multiple classes
//child class extends tom parent  class  
//mini class is 3 stores

class Animal {  //parent class
	 
	 String color;
	 
	  void eat() {
		  System.out.println("eat");
	  }
	  
	   void breath() {
		   System.out.println("breath");
	   }
	  
}

 class Fish extends Animal{ //child class
	  
	   int fin;
	    void swim() {
	    	System.out.println("Swim in water");
	    }
 }
 
 

public class inheritance {

	public static void main(String[] args) {
		
		Fish f = new Fish();
		f.eat();
		f.swim();
		f.breath();

	}

}


 