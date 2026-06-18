package oops;
 
// Abstraction  :  Hiding all unneccassary detail and Showing only 
//                       the important part  to the user


// Example  : 1) fan : cannot knowing internally working 

//            2) car :  driving  a car without   konwing how engine  work



//abstract alass :   abstract  class does not  create  the object.

// can have  abstract / non abstract method 
 
// can have  constructor 
 
 abstract class laptop {
	 
	 
	  laptop(){
		   System.out.println("hey");
	  }
	  abstract  void feature();
	  
 }


   class victus  extends laptop{
	   
	   
	    public void feature() {
	    	 System.out.print(" Java Vs Code I%");
	    }
   }


public class abstractclass_Example {

	 public static void main (String [] args) {
		 
	 victus  a = new victus();
	 
		 a.feature();
	 }
}
