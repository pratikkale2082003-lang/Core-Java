package Question;

import java.util.*;

// Duplicate Fraud Check Using Hashset
public class Duplicate_fraudCheck {

	 public static void main(String[] args) {
		 String[][] t = {{ "A","B", "10"},{"B", "C", "50"},{"A", "B", "55"}};
		 
				 
		  Set<String>  seen = new HashSet<>();
		  
		   int p  = -1;
		   
		    for (String[] x : t) {
		    	
		    	
		    	String key = x[0] + x[1];
		    	
		    	 int time = Integer.parseInt(x[2]);
		    	 
		    	  if (!seen.add(key)) {
		    		  
		    		   System.out.println("Duplicate ");
		    		    return;
		    		    
		    	  }
		    	   p =  time;
		    	
		    }
		     System.out.println("Valid");
		     System.out.println(p);
		 }
	}

