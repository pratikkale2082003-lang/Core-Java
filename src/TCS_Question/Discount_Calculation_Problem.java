package TCS_Question;

import java.util.Scanner;

public class Discount_Calculation_Problem {

	
	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		   System.out.print("Enter The Amount :  ");
		   int amount = sc.nextInt();
		   
		   
		    double discount = 0;
		    
		     if ( amount < 1000) {
		    	  discount =  amount * 0.05;
		    	  
		     }
		     else if (amount <= 5000) {
		    	 
		    	  discount =  amount * 0.10;
		    	  
		     }
		     else {
		    	 
		    	  discount = amount * 0.15;
		     }
		      double finalamount = amount - discount;
		      
		       System.out.println(finalamount);
		        sc.close();
	}
}
