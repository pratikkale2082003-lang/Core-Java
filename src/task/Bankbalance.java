package task;

import java.util.Scanner;

public class Bankbalance {

	  public static void main(String[] args) {
		
		  
		  
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter The Number : ");
		    int month = sc.nextInt();
		    if ( month <= 0) {
		    	
		    	 System.out.println("Invalid Input");
		    }
		    else if (month <= 1) {
		    	 System.out.println("2000");
		    }
		    else if( month <= 3) {
		    	 System.out.println("5000");
		    	 
		    	
		    }
		    else if (month <= 6) {
		    	System.out.println("9000");
		    }
		    else {
		    	System.out.println("15000");
		    }
		     sc.close();
	}
}
