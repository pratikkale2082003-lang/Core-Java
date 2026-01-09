package oops;
//multilevel inheritance= child class inherits from another class, it is called multilevel inheritance.
//child class form another class and multiple classes
//child class extends tom parent  class  
//mini class is 3 stores

class Cat {  // grantparent class
	 String color;
	 
	  void eat() {
		  System.out.println("The cat is moww");
	  }
	  
	   void breath() {
		   System.out.println("breaths");
	   }
}


 class Mammals extends Cat{ // parent
	 
	 
	 int legs;
 }
	 
  class Dog extends Mammals{       // child 
	  String breed;
	  
  }

public class multilevelinheritance {

	public static void main(String[] args) {
		
     Dog  d = new Dog();
     d.breed="Dogesh bhai";
     d.legs= 2;
     d.color="Black";
     
     System.out.println(d.breed);
     System.out.println(d.legs);
     System.out.println(d.color);
     d.eat();
     d.breath();
     
	}

}
