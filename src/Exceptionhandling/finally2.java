package Exceptionhandling;

public class finally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
 try {
		 int  a = 10 / 0;
 } 
		  catch (Exception e) {
			  System.out.println(" cath of the found bloack " + e);
		  }
// 
  finally {
	  System.out.println(" finnaly exception");
  }
  System.out.println("bye");
	}

}
