package oops;



 class Bank { // parent class 
	 
	  void Money() {
		  
		   System.out.println("The Main Branche of the reserve BAnko of india");
	  }
	 
	  
 }

  class SBIBank extends Bank {
	  
	  
	  void Money() {
		  
		  super.Money();
		   System.out.println("The Branch  of State Bank OF India ");
	  }
  }

 








public class Method_Overriding {

	public static void main(String[] args) {
		SBIBank s = new SBIBank();
		s.Money();
	}
	
	
}
