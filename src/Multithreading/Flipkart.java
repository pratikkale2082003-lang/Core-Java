package Multithreading;

public class Flipkart extends Thread {

	void Search() {
		 System.out.println("  you can Search..");
	}
	
	 void order() {
		 System.out.println("   you can order " );
	 }
	
	  void Account() {
		  System.out.println( " show your acc details ");
	  }
	
	
	   public void run() {
		  
		   Search();
		   order();
		   Account();
		   System.out.println("\n Flikart shopping is sucessfully");
	   }
	
	
	
	
	public static void main(String[] args) {
	
		Flipkart f =  new Flipkart();
		f.start();
	}

}
