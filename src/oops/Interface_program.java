package oops;


interface signal{
	
	 abstract void  color();
		 
	  default void location() {
		  System.out.println( " tcs ");
	  }
	  
	   static void city(){
		   
		   System.out.println("pune");
	   }
	 
}

 class signal_data implements signal{

	
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println(" red color is stopping ");
		System.out.println("green class ");
		System.out.println(" yellow  class ");
	}
	 
 }


public class Interface_program {

	public static void main(String[] args) {

		signal_data ob = new signal_data();
		ob.color();
		 ob.location();
		 signal.city();
		
	}

	
}
