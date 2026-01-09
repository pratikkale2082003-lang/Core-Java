package oops;

// multilevel  inheritance:  chain of inheritance

 class   india { // grandparent class 
	 
	  void   country() {
		   System.out.println(" indian   team ");
	  }
 }

  class  ipl   extends india {
	  
	    void team() {
	    	System.out.println("Chennai Super Kings");
	    }
  }
 
   class player extends  ipl  {
	   
	    void captain() {
	    	System.out.println("Ms Dhoni ");
	    }
   }

public class program_multi_level {
	 public static void main(String[] args) {
		
	
	player p = new player();
	p.country();
	p.team();
	p.captain();
	
	 }
}
