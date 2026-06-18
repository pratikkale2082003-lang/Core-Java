package Question;

import java.util.Scanner;

public class ReverseArray {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		   System.out.print("Enter Size of Array : ");
		   int size = sc.nextInt();
		   
		   int arr [] = new int[size];
		    System.out.println("Enter the Elements of Arrays : ");
		   
		 for(int i = 0; i<arr.length; i++) {
			   arr[i] = sc.nextInt();
			   
		 }
		 
//		  int arr[] = {5,4,3,8,9};
		
		System.out.print("Reverse Array is : ");
		 for (int i = arr.length-1; i>=0; i--) {
			 System.out.print(arr[i] + " ");
		 }
		  sc.close();
		  
	}
}
