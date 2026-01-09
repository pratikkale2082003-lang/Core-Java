package Exceptionhandling;

 class InvalidAgeException extends Exception{
	 
	 InvalidAgeException(String name){
		 
		  super(name);
		  
	 }
 }

public class AgeException {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub

		 int n = 17;
		 
		  if (n >= 18) {
			  System.out.println("Eligible for voting ...");
		  }
		  else {
			  throw new InvalidAgeException("not eligible for voting");
		  }
	}

}
