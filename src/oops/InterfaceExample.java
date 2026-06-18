package oops;


 interface Chess{
	 
	  abstract   void King();
	  
	  
	   default  void Queen() {
		   
		    System.out.println("Most Imporatant Player Of Queen");
	   }
	   
	    static  void horse() {
	    	
	    	 System.out.println("Powerful Of Horse");
	    }
 }

  class ChessPlayer1  implements Chess{

	@Override
	public void King() {
	
		 System.out.println("The King OF Empire");
		
	}
	  
  }


public class InterfaceExample {

	public static void main(String[] args) {
		
		ChessPlayer1  c = new ChessPlayer1();
		c.King();
		c.Queen();
		System.out.println("-----------------------------------------------------------");
		Chess.horse();
	}
}
