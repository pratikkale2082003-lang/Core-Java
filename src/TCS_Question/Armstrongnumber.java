package TCS_Question;

import java.util.Scanner;

public class Armstrongnumber {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the number : ");
		    int n  = sc.nextInt();
		    
		    
		     int num = n;
		     
		      int sum = 0;
		      
		       while(n > 0) {
		    	   
		    	   int rem = n % 10;
		    	   sum = sum + rem * rem * rem;
		    	   n = n / 10;
		    	   
		       }
		        if (sum == num ) {
		        	System.out.println( num + " its ArmSTrong number");
		        }
		        else {
		        	System.out.println(num + " its not Armstrong number");
		        	 sc.close();
		        }
	}
}
