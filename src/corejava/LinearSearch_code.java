package corejava;

import java.util.Scanner;

public class LinearSearch_code {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		 int n = sc.nextInt();
		 
		 
		  int arr [] = new int [n];
		  
		  
		   System.out.println("Enter The Elements : ");
		     for (int  i = 0; i < arr.length; i++) {
		    	 arr[i] = sc.nextInt();
		    	 
		    	 
		    	  
		    	 
		     }
		     
		     
		      System.out.println("Enter key : ");
		      int key = sc.nextInt();
		      
		       for(int i = 0; i< arr.length; i++) {
		    	   
		       
		       if (arr[i] == key) {
		    	   
		    	    System.out.println(" linear serach : " + i);
		       }
		       }
	}
}
