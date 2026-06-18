package Question;

import java.util.Scanner;

public class DuplicateArray {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Size of Array : ");
		 int  n = sc.nextInt(); 
		 
		 
		 
		  int arr []  = new int[n];
		  System.out.println("Enter The Elements : ");
		 
		   for (int i = 0; i< arr.length; i++) {
			   
			    arr[i] = sc.nextInt();
		   }
		  int count  = 0;
		  
		    for ( int i = 0; i < arr.length; i++) {
		    	
		    	 for (int j = i+1; j< arr.length; j++) {
		    	   if (arr[i] == arr[j]) {
		    		     System.out.println("Duplicate array is : " + arr[i]);
		    		      count++;
		    		      
		    	   }
		    	   }
		    }
		    
		     if ( count != 0) {
		    	 
		    	  System.out.println("present Duplicate Array ");
		     }
		     else {
		    	  System.out.println(" Not present Duplicate Array");
		     }
		      sc.close();
	}
}
