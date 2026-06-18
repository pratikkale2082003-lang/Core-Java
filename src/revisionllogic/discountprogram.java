package revisionllogic;

import java.util.Scanner;

public class discountprogram {

	
	  public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		     System.out.print("Enter Price : ");
		    int price = sc.nextInt();
		    
		    
		     if (price >= 10000) {
		    	 
		    	 System.out.println("10 % discount ");
		    	   double  discount = price * 0.10;
		    	   
		    	   price -= discount;
		    	    
		    	   System.out.println("i got a 10 percent  discount  : " + price);
		     }
		     else if ( price >= 7000) {
		    	 System.out.println("7 % discount ");
		    	  double discount =  price * 0.07;
		    	  
		    	   price -= discount;
		    	   
		    	    System.out.println( "i got a 7 percent discount  : "+ price );
		     }
		     else  if ( price >= 5000) {
		    	 System.out.println( "5 % discount");
		    	    double   discount  = price * 0.05;
		    	     price -= discount;
		    	     
		    	       System.out.println(" i got 5 percent discont : " + price);
		    	       
		     }
		     else  if (price >= 2000){
		    	 System.out.println("2 % discount ");
		    	 double discount = price * 0.02;
		    	 
		    	  price -= discount;
		    	  
		    	 System.out.println("i got 2 percent discount : " + price);
		     }
		     
		     else {
		    	 System.out.println("No Discount");
		    	 sc.close();
		     }
	}
}
