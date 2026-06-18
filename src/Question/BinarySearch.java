package Question;

import java.util.Scanner;

public class BinarySearch {

	
	  public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Size of Array : ");
		   int n = sc.nextInt();
		   
		   int arr[] =  new int[n];
		   
		   
		   System.out.println("Enter the Elements : ");
		   
		    for ( int i = 0; i < arr.length; i++) {
		    	arr[i] = sc.nextInt();
		    }
		    
		     System.out.print("Enter target : ");
		    int target =  sc.nextInt();
		    sc.close();
		     int low = 0; 
		      int high = arr.length-1;
		      
		       while(low <= high) {
		    	   
		    	    int mid = (low + high) /2;
		    	    
		    	     if (arr[mid] == target) {
		    	    	 
		    	    	  System.out.println("Found at the index : " + mid);
		    	    	   return;
		    	    	   
		    	     }
		    	     else if (target < arr[mid]) {
		    	    	 
		    	    	  high = mid -1;
		    	    	  
		    	     }
		    	     else {
		    	    	 low = mid +1;
		    	    	 
		    	     }
		       }
		        System.out.println("Not Found ");
		         
	}
}
