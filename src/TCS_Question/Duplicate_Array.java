package TCS_Question;

import java.util.Scanner;

public class Duplicate_Array {

	
	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Size of Array : ");
		  int n = sc.nextInt();
		  
		  
		   int arr [] = new int[n];
		   System.out.println("Enter The Elements : ");
		    for (int i = 0; i<arr.length;  i++) {
		    	
		    	 arr[i] = sc.nextInt();
		    	 
		    }
		    
		     int count = 0;
		     
		      for (int  i = 0; i< arr.length; i++) {
		    	  
		    	   for (int j = i+1; j<arr.length;  i++) {
		    		  
		    		     if (arr[i] == arr[j]) {
		    		    	
		    		    	 System.out.println("Duplicate Array is : " + arr[i]);
		    		    	 
		    		    	  count++;
		    		    	  
		    		    }
		    	   }
		      }
		      
		       if (count != 0) {
		    	     System.out.println("Present Duplicate Array");
		    	     
		       }
		       else {
		    	   System.out.println("Not Present Duplicate Array");
		       }
		       
		        sc.close();
		        
	 }
}
