package oops;
 
//single level inheritance :  one class extends to parent class


 class vehicle {
	 
	  void start() {
		  
		   System.out.println("  use  the key");
	  }
	  
 }

   class car3 extends vehicle{
	   void kick() {
			 System.out.println(" start the keick");
		}
		
   }
  



public class singlelevelinheritance1 {
	
	
	 public static void main(String[] args) {
		
	
		 car3 c = new car3();
		 
		 
 c.start();
 c.kick();
}
}