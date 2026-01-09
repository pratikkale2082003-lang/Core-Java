package task;

import java.util.Scanner;

//matrix method id name surname 
public class task18 {

	 public static void main(String[] args) {
		 
		  System.out.println("Enter the array size of row and columns ");
		  int row,col;
		  Scanner sc = new Scanner(System.in);
		  row= sc.nextInt();
		  col = sc.nextInt();
		  
		  String arr[][] = new String [row][col];
		  System.out.println("Enter the array elements ");
		   for(int i = 0; i<row; i++) {
			   for(int j =0; j<col; j++) {
				   arr[i][j]= sc.next();
			   }
		   }
		   
		   System.out.println("matrix is : ");
		   for(int i = 0; i<row; i++) {
			   for(int j = 0; j<col; j++) {
				   
				   System.out.print(arr[i] [j] + " ");
			   }
			   System.out.println();
		   }
	 }
	
	
}
