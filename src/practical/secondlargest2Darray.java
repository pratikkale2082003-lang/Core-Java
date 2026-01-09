package practical;

import java.util.Scanner;

public class secondlargest2Darray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the row :");
		 int  r = sc.nextInt();
		 System.out.print("Enter the column :");
		 int c = sc.nextInt();
		 
		int arr[][]= new int[r][c];
		
		
		System.out.println("Enter the Element : ");

		 for (int i = 0; i<arr.length; i++) {
			  for(int j = 0; j<arr.length; j++) {
				   arr[i][j] = sc.nextInt();
			 
			  
			  }
		 }
		 for (int i = 0; i<arr.length; i++) {
			  for(int j = 0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
			 
			  }
			   System.out.println();
		 }
		 
		 
//		  largest number
		  int largest = 0;
		  
		
		  for (int i = 0; i<arr.length; i++) {
			  
			   for( int j = 0; j< arr.length; j++) {
				   if(arr[i][j] > largest) {
					   largest = arr[i][j];
					   
				   }
			   }
		  }
			   System.out.println("the 2d Array largest  is : " + largest);
			   
//			    second largest 
			   
			  int second = 0;
			  for(int i = 0; i<arr.length; i++) {
				  for(int j =0; j< arr.length; j++) {
					  if(arr[i][j] > second && arr[i][j] != largest) {
						  second = arr[i][j];
						  
					  }
				  }
			  }
			 System.out.println("2d Array  Second largest is  : "+ second);
			  
		  }
	}


