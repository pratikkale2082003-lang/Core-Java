package Question;

import java.util.Scanner;

public class Find_LeapYear {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		   System.out.print("Enter Year : ");
		   int n = sc.nextInt();
		   
		   
		    if ( n % 4 == 0) {
		    	System.out.println(n + " Leap year");
		    }
		   
		  
		    else {
		    	
		    	 System.out.println(n + " Normal Year");
		    }
		     sc.close();
		     
	}
	 
}
