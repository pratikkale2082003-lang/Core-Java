package practical;

import java.util.Scanner;

public class midsizeofarray {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int size = sc.nextInt();
		
		 int arr[]= new int[size];
		 
		  System.out.println("Enter the element : ");
		  for (int i = 0; i< arr.length; i++) {
			  arr[i] = sc.nextInt();
			  
			  
		  }
			   int mid  = size  / 2;
			   
			    if (size % 2 == 0) {
			    	System.out.println("Enter  are mid " + arr[mid-1] + " and " + arr[mid]);
			    }
			    else {
		            System.out.println("Array middle element is: " + arr[mid]);
			    }
		  }
	}

