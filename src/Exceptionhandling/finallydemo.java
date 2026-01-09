package Exceptionhandling;

public class finallydemo {

	public static void main(String[] args) {
	
		 try {
			  int num = 10;
			  
		 }

		  catch(Exception e) {
			  System.out.println(e);
		  }
		
		  finally {
			  System.out.println("finaly block is executed");
		  }
		
	}

}
