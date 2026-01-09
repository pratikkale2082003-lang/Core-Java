package oops;

//hiearchicalinheritance1  : one parent and multiple child class
 

 class india1 {  //parent class
	 
	  void country () {
		   System.out.println(" india ");
	  }
 }
	   class ipl1 extends india1 { // child1
		  void team() {
			  System.out.println("CSK");
		  }
		   
	   }
	    class  captainq   extends india1{
	    	
	    
	    void   captain() {
	    	
	    	 System.out.println("ms dhoni");
 }

	    }






public class hiearchicalinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		captainq c = new captainq();
		c.country();
		c.captain();
		 System.out.println("\n-------------------------------------------------------------------");
		ipl1 i = new ipl1();
		i.country();
		i.team();
	}

}
