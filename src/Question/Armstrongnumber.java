package Question;

import java.util.Scanner;

public class Armstrongnumber {

	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  
		   System.out.println("Enter The Number : ");
		    int n = sc.nextInt();
		    
		    int num = n;
		    int sum = 0;
		    
		     while (n > 0) {
		    	 
		    	  int rem = n % 10;
		    	  sum = sum + rem * rem * rem;
		    	  n = n / 10;
		    	  
		     }
		      if (sum == num) {
		    	  System.out.println(num + " its is Armstrong Number");
		      }
		      else {
		    	  System.out.println(num + " its not Armstrong Number");
		    	   sc.close();
		      }
	 }
}
