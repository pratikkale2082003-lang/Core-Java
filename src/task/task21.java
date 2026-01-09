package task;

import java.util.*;

// string palindrome
public class task21 {

	 public static void main(String [] args) {
		 
		  Scanner sc  = new Scanner(System.in);
			  
			System.out.println("Enter String : ");
			 String str = sc.nextLine();
			 
		  
			   String  rev = "";
			   
			    for(int i= str.length()-1; i>=0; i-- ){
			    	   
//			    		
					   rev = rev + str.charAt(i);		
					   }	  
			    	
			    		 if(str.equals(rev)) {
			    			 System.out.println("is palindrome");
			    		 }
			    		
			    		 else {
			    			 System.out.println("not palindrome");
			    		 }
			    }
			   
			   
	 }

