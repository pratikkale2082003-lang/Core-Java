package Exceptionhandling;
import java.util.*;

class InvalidadharException extends Exception{
	 
	  public InvalidadharException(String pratik) {
		  super(pratik);
	}
	  
}

public class invaildadharcard {

	public static void main(String[] args) throws InvalidadharException {
	 

		  Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the Adharno : ");
		  String adhar = sc.nextLine();
		  
	
	   
	    if (adhar.length() == 12) {
	    	 System.out.println( " valid Adhar succefully");
	    	
	    }
	    else {
	    	 throw new InvalidadharException( " Invalid Adharno");

	    }

	}

}

 



