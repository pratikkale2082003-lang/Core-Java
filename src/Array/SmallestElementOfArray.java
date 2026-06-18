package Array;

import java.util.Scanner;

public class SmallestElementOfArray {
	

		 public static void main(String[] args) {
			
			 
			  Scanner sc = new Scanner(System.in);
			  
			   System.out.print("Enter Size of Array : ");
			   int n = sc.nextInt();
			   
			  int arr [] = new int [n];
			  System.out.println("Enter The Element : ");
			  
			   for (int i = 0; i< arr.length; i++) {
				   arr[i]  = sc.nextInt();
				   
			   }
			   int smallest = arr[0];
			   
			    for( int i = 0; i< arr.length; i++) {
			    	
			    	 if ( arr[i]< smallest) {
			    		 
			    		 smallest = arr[i];
			    		 
			    	 }
			    }
			     System.out.println("Smallest Elements : " + smallest);
			     sc.close();
		}
		 
	

}
