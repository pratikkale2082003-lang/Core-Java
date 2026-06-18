package revisionllogic;

import java.util.Scanner;

public class PalindromeNumber {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number : ");
		   int n = sc.nextInt();
//		  int n = 1232551;
		  
		   int num = n;
		   
		   int rev = 0;
		   
		    while( n > 0) {
		    	int rem = n % 10;
		    	
		    	rev = rev * 10 + rem;
		    	 n = n / 10;
		    	 
		    }
		    
		    
		    
		     if (num == rev) {
		    	  System.out.println("PAlindrome NUmber ");
		    	  
		    	 
		     }
		     else {
		     System.out.println("Its Not Palindrome Number " );
		      sc.close();
	}
}
}
	 
