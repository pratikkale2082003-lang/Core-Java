package practical;

// largest number of Array
 import java.util.*;
 
public class largestofArraynumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		 int n = sc.nextInt();
		 
		int arr [] = new int[n];
		
		System.out.println("Enter the Element : ");
		for (int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			
		}
		
//		  code
		 int largest = 0;
		  for(int i =0; i <arr.length; i++) {
			  if(arr[i] > largest) {
				  largest = arr[i];
				  
			  }
		  }
			  System.out.println("largest array number is : " + largest);
			  sc.close();
		  }

	}


