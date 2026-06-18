package Question;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc  = new Scanner(System.in);
		  System.out.print("Enter the Number : ");
		 int n =  sc.nextInt();
		  int num = n;
		  
		 int rev = 0;
		  while ( n != 0) {
			  
			   int rem = n % 10;
			     rev = rev * 10 + rem;
			      n = n / 10;
		  }
		  
		   if ( num == rev) {
			    System.out.println("Palindrome Number");
		   }
		   else {
			   System.out.println("Non Palindrome Number");
		   }
		   
		    sc.close();
	}

}
