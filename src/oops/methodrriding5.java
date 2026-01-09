package oops;


 class  pubg {
	 
	  void  animation  () {
		  
		   System.out.println("The Pubg Is brillint animation");
	  }
	  
	   
 }
 
   class Game extends pubg{
	   
	    void animation() {
	    	
	    	 super.animation();
	    	 System.out.println(" the 3Rd graphic ");
	    	  System.out.println("no game extends are theis");
	    }
	     
   }
public class methodrriding5 {
	 public static void main(String[] args) {
		
	
	Game d  = new Game();
	
	d.animation();
}
}