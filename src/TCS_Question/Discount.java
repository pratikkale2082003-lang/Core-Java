package TCS_Question;

import java.util.Scanner;

public class Discount {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Amount : ");
		   int amount = sc.nextInt();
		   
		   
		   double discount = 0;
		   
		     if ( amount <= 1000) {
		    	 discount =  0;
		    	  
		     } else if (amount <= 5000) {
		    	 discount = amount * 0.10;
		    	 
		     }
		     else {
		    	  discount = amount * 0.20;
		    	  
		     }
		      double  finalPrice = amount - discount;
		       System.out.println("Discount : " + discount);
		        System.out.println("Final Price : " + finalPrice);
		         sc.close();
	}
	 
}
