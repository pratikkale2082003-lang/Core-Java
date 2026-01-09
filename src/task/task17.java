package task;

// 2d array example
import java.util.*;
public class task17 {

	public static void main(String[] args) {
		
		 System.out.println("Enter the array size  of row and column");
		 
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][]= new int [row][col];
		
	System.out.println("Enter the array elements");
	for(int i = 0; i<row; i++) {
		 for(int j = 0; j<col; j++) {
			 arr[i][j] = sc.nextInt();
		 }
		
	}
	 System.out.println("matrix is : ");
	  for(int i =0; i<row; i++) {
		  for(int j = 0; j<col; j++) {
			  System.out.print(" " +arr[i][j]);
		  }
		  System.out.print("\n");
	  }

	}

}
