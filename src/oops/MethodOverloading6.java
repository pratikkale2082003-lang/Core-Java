package oops;


 class   cash {
	 
	  void payment() {
		  
		   System.out.println("The Payment is Cash");
	  }
	   void payment( String  a) {
		   
		    System.out.println("The Payment can show the ubnit");
	   }
	    void payment (String a , int n) {
	    	
	    	 System.out.println("The Payment is Know is ");
	    }
 }



public class MethodOverloading6 {

	 public static void main(String[] args) {
		 cash c = new cash();
		 
		 c.payment();
		 c.payment("Goolpay");
		 c.payment("debitcars", 10);
	}
}
