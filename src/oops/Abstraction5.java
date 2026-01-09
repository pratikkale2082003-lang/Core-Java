package oops;
abstract class Vehicle{ // parent class
	 
	  
	  
	    abstract void start();
	 
}

class car  extends Vehicle{  // child class 1
	 
	  void start() {
	
		  System.out.println(" start with key ");
	  }
	 
	  
	   class scooty  extends  Vehicle{ //child class2
		    void start() {
		    	 
		    	System.out.println("start with kick");
		    }
	   }
}
public class Abstraction5 {

	public static void main(String[] args) {
	
		car  c = new car();
		c.start();
		
		
		
		

		
	}

}
