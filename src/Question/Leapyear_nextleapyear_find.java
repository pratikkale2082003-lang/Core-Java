package Question;

import java.util.Scanner;

public class Leapyear_nextleapyear_find {

	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Start Year : ");
		   int  startyear = sc.nextInt();
		   
		   
		   System.out.print("Enter Number of leap years : ");
		   int n = sc.nextInt();
		   
		    int year = startyear +1;
		    int count = 0;
		    
		     while(count < n) {
		    	 
//		    	  leap year condition
		    	  if ((year % 4 == 0 && year % 100 !=  0)|| (year % 400 == 0)) {
		    		  
		    		   System.out.println(year);
		    		    count++;
		    		    
		    	  }
		    	  
		    	   year++;
		    	   
		     }
		      sc.close();
		      
	 }
}
