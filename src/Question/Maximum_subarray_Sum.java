package Question;
//Kadane’s Algorithm
import java.util.*;

public class Maximum_subarray_Sum {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter  size of Subarray : ");
	      int n = sc.nextInt();
	      
	       int arr[] = new int[n];
	       
	         System.out.println("Enter the Elements : ");
	  for ( int i = 0; i<arr.length; i++) {
		   arr[i] = sc.nextInt();
	  }
	    
	  
	  
	   int currentsum = arr[0];
	    int maxsum = arr[0];
	    
	     for ( int i  = 1; i< arr.length; i++) {
	    	 
	     currentsum = Math.max(arr[i],  currentsum +  arr[i]);
	      maxsum = Math.max(maxsum, currentsum);
	      
	 }
	      System.out.println("Maximum Subarray Sum : " + maxsum);
	      sc.close();
     }
	 }
