package oops;

//   abstract class : Can not create Object With Abstract Class.

//can have abstraction/ non - abstract methods
// can have use  constructor  

 abstract class fan{
	
	  
	 
	
	  abstract  void  Air();
	  
	
}

class Person extends fan {

	@Override
	void Air() {
		 System.out.println("Yes I Know That fereling Goes ");
		
	}
	
}


public class Abstraction9 {

	 public static void main(String[] args) {
		
		 Person p = new Person();
		 p.Air();
	}
}
