package corejava;

import java.util.Scanner;

public class reversearray {
	
	public static void main(String[] args ) {
//		
//		 int arr [] = {2,4,6,8,10};
//		 
//		 System.out.println("Reverse Array : ");
//		 
//		 for(int i = arr.length-1; i>=0; i--){
//			System.out.print(arr[i] + " ");
//			
//		 }
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array : ");
		 int n = sc.nextInt();
		 
		 
		 int arr[] = new int[n];
		 
		 System.out.println("Enter " + n + "Element");
		 for(int i =0; i<n; i++) { 
			 arr[i] = sc.nextInt();
			 
		 }
		 System.out.println("Reverse array : ");
		 for(int i = arr.length-1; i>=0; i--) {
			 
			System.out.println( arr[i]+ " ");
			 sc.close();
		 }
		 
		 
	}

}
