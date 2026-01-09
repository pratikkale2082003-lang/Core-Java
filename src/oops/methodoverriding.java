package oops;


//  parent and child both contain multiple method same name and same parameter but differen defination 


// super keywords to access the   parent  property , varaible , method 
  class diwali{
	  
	   void  festival() {
		   System.out.println("  chivada , faral ");
		   System.out.println(" fatake ");
	   }
	  
  }

 class holi  extends diwali{
	
	  void festival() {
		  
		  super.festival();
		  System.out.println(" color");
		   System.out.println("khir and  puranpoli");
	  }
 }

public class methodoverriding {
	
	 public static void main(String[] args) {
		
	
	 holi h = new  holi();
	 h.festival();
}
}
