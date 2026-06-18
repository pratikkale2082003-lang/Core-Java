package Question;

import java.util.Scanner;



public class MaxThreeInput {

	
	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner( System.in);
		   System.out.print("Enter Size : ");
				  int n = sc.nextInt();
				  
				  
		  int arr[] =  new int[n];
		  
		   System.out.println( "Enter The Elements : ");
		   
		    for ( int i = 0; i < arr.length; i++) {
		    	
		    	 arr[i] = sc.nextInt();
		    	 
		    }
		    
		    
		   int first  = Integer.MIN_VALUE;
		   int second = Integer.MIN_VALUE;
		    int third =  Integer.MIN_VALUE;
		    
		     for (int i = 0; i < arr.length; i++) {
		    	 
//		    	  first
		    	 if(arr[i] > first) {
		    		 
		    		  third = second;
		    		   second = first;
		    		   
		    		    first = arr[i];
		    		    
		    		    
		    		   
		    	 }
		    	  
		    	 else if( arr[i] > second ) {
		    		 third = second;
		    		 second = arr[i];
		    		 
		    	 }
		    	 else if ( arr[ i] >  third) {
		    		  third  = arr[i];
		    		  
		    		  
		    	 }
		    	  
		     }
		      int sum = first + second + third;
		      
		      
		     System.out.println("MAX Element Are : " + first + " " + second + " " + third);
		     
		     System.out.println("Max Sum of  Three Elemnent : " + sum);
		      sc.close();
	 }
}
