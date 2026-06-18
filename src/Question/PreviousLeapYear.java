package Question;

import java.util.Scanner;

public class PreviousLeapYear {

	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Year : ");
		  int year = sc.nextInt();
		  

		   System.out.print("Enter Number of leap years : ");
		   int n = sc.nextInt();
		  
		    int count = 0;
		    
		  int prev = year-1;
		  
		   while(count < n) {
			    if ((prev % 4 == 0 && prev % 100 != 0) || (prev% 400 == 0)) {
			    	System.out.println("Previous Leap Year is : "+ prev);
			    	count++;
			    	
			    }
			    prev--;
		   }
	 }
}
