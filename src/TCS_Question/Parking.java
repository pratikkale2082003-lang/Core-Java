package TCS_Question;
//👉 "Parking charges are calculated based on slabs:
//first 2 hours ₹100/hr,
//next 3 hours ₹50/hr,
//and remaining hours ₹20/hr."
import java.util.*;

public class Parking {

	 public static void main(String[] args) {
		
		  try {
			  
		  
		  Scanner sc = new Scanner(System.in);
		   System.out.println("Enter The Number : ");
		  int n  = sc.nextInt();
		  
		   if (n < 0) {
			   System.out.println("error");
			    return;
		   }
		   
		    int cost = 0;
		    
		     if (n <= 2) {
		    	  cost = n*100;
		    	  
		     }
		     else if ( n <= 5) {
		    	 
		    	  cost = (2 * 100) + (n - 2) * 50;
		    	  
		     }
		     else {
		    	  cost = (2 * 100)+ (3 * 50) + (n - 5) * 20;
		    	  
		     }
		      System.out.println(cost);
		       sc.close();
		  } catch(Exception e) {
			  
			   System.out.println(e + " error ");
		  }
//		       sc.close();
	}
}
