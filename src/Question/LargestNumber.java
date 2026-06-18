package Question;

import java.util.Scanner;

public class LargestNumber {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		   System.out.print("Enter A :");
		   int a = sc.nextInt();
		   
		   System.out.print("Enter B : ");
		   int b = sc.nextInt();
		   
		   System.out.print("Enter C : ");
		   int c = sc.nextInt();
		    
		   
		    if (a > b && a > c ) {
		    	
		    	System.out.println(a + " is largest number A");
		    	
		    }  else if ( b > c && b > a) {
		    	System.out.println(b + " is largest number B");
		    }
		     
		    else {
		    	System.out.println(c + " is largest number C");
		    }
		    sc.close();
		     
	}
}
