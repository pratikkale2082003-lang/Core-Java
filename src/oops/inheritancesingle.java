package oops;

//Single Inheritance  child class inherits Property to parent Class.

 class  Upsc {
	 
	  void exam() {
		  System.out.println("The Crack exam IAS");
	  }
	  
	  
 }
  class mpsc extends Upsc {
	  
	   void Fruits() {
		   System.out.println("the Crack Exam PSI");
	   }
  }
public class inheritancesingle {

	public static void main(String[] args) {
		mpsc m = new mpsc();
		m.exam();
		m.Fruits();
	}
}
