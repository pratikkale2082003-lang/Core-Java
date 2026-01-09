package oops;

//super:super  keyword  is used to refer immidiate parent class  object..
//   to access the parent class properties & method & constructo
    

 class Animal2{  // parent class
	 
	  void eat() {
		  System.out.println("Eat anything");
	  }
 }

   class Deer extends Animal2{
	   
	    void eat() {
	    	 super.eat();
	    	System.out.println(" eat grass");
	    }
   }


public class methodoverridding2 {

	public static void main(String[] args) {
	
		
		 Deer d = new Deer();
		 
		 d.eat();
	}

}
