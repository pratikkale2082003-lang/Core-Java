package oops;

public class person2 {

	 void walk() {
		 System.out.println(" walking.......");
	 }
	
	  void run() {
		  
		   this.walk();
		  System.out.println(" running.....");
	  }
	
	
	
	public static void main(String[] args) {
		

		person2 p = new person2();
		p.run();
		
		
		
	}

}
