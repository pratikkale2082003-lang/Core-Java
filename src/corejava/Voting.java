package corejava;

import java.util.Scanner;

public class Voting {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		   System.out.print("Enter the Number :  ");
		  int n = sc.nextInt() ;
		  
		   if( n > 18) {
			   
			    System.out.println("Eligible For Voting");
			    
		   }
		   else {
			   
			    System.out.println("Not Eligible For Voting");
		   }
		    sc.close();
	}
}
