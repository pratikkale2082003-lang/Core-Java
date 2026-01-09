package task;

import java.util.Arrays;
import java.util.Scanner;

public class arraytask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size arr1 : ");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		System.out.print("Enter the Element 1 array : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			
			
		}
		

		System.out.println("\nEnter Size arr2 : ");
		int num = sc.nextInt();
		
		int arr2[] = new int[num];
		
		System.out.println( "Enter the Element 2 array : ");
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
			
		}
		
		
		
		
		if (Arrays.equals(arr, arr2)) {
			
			System.out.println("both Are Equal");
		}
		else {
			System.out.println("both Are different ");
//			
		}
		 
	}

}
