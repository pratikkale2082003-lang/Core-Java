package Question;

import java.util.Scanner;

public class LinearSearch {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		 int  n = sc.nextInt();
		 
		  int arr [] = new int[n];
		  
		   System.out.println("Enter the Elements : ");
		   
		    for (int i = 0; i<arr.length; i++) {
		    	
		    	 arr[i] = sc.nextInt();
		    }
		    
		    
		     System.out.println("Enter The Key : ");
		      int key = sc.nextInt();
		      
		       for (int i = 0; i< arr.length; i++) {
		    	   
		    	    if (arr[i] == key) {
		    	    	
		    	    	System.out.println("The Index Value  is : " + i);
		    	    }
		    	     sc.close();
		    	     
		    	   
		       }
	}
}
