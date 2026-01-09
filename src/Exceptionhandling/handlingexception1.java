package Exceptionhandling;

// nullpointer exception 
public class handlingexception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try   /// hole the exceptin 
		 {
			 String str = null;
			  System.out.println(str.length());

		 }
		  catch(Exception c){  // handling
			  System.out.println(c);
		  }
		
	}

}
