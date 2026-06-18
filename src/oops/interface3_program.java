package oops;


 interface Car4 {
	 
	  abstract void  color();
	  
	    default  void   model () {
	    	System.out.println("TATA");
	    }
	   
	    
	    static void  name () {
	    	 System.out.println("THAR");
	    }
 } 
 
   class  company4 implements Car4 {

	@Override
	public void color() {
		System.out.println("red Color is Stopping");
		 System.out.println("Green Class ");
		  System.out.println("Yellow ");
	}
	   
   }
 
public class interface3_program{

	  public static void main(String[] args) {
		  Car4.name();
System.out.println("-------------------------------------------------------------------------------------------------------------------");
		   company4  c = new  company4();
		   c.color();
		   
		   
		   c.model();
		  
	}
}
