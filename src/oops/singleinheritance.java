package oops;

// extends keyword child class inherits to parent class


// single inheritance : childs class aquires properties to another class

 class diwalidamakha { //parent class
	 
	  void fatake (){
		  System.out.println("sutali bomb");
		  System.out.println("susundri");
	  }
 }


  class  chakali extends diwalidamakha{ // child class
	 
	   void faral() {
		   System.out.println(" chivada");
		   System.out.println("ladu");
	   }
  }



public class singleinheritance {

	public static void main(String[] args) {
		chakali  c = new chakali();
		c.fatake();
		 System.out.println("\n");
		c.faral();
	}

}
