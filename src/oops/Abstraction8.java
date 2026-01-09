package oops;



 abstract class amazon{
	
	
	  
	  
	  
	   void search() {
		   System.out.println(" serach the menu");
	   }
	   abstract  void logo();
	   
 }

 
  class  flipcart extends amazon {

	@Override
	void logo() {
		 System.out.println(" mangul zanaka  is compulsary");
	}
	  
  }
 

public class Abstraction8 extends  flipcart {

	
	@Override
	void logo() {
		 System.out.println(" pratik kale ");
		
	}
	 public static void main(String[] args) {
		
		   flipcart d = new flipcart();
		d.search();   
	 d.logo();
	 
	System.out.println("\n-------------------------------------------------------------------------------------------");
	 
	Abstraction8  ab = new Abstraction8();
	ab.search();
	ab.logo();

	}

}
