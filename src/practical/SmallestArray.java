package practical;

//Smallest number of Array 
import java.util.*;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int n = sc.nextInt();
		
		 int arr[] = new int [n];
		 System.out.print("Enter the Element : ");
		  for(int i =0; i<arr.length; i++) {
			  arr[i]= sc.nextInt();
		  }
		 
		 int Smallest = arr[0];
		  for (int i =0; i<arr.length; i++) {
			  if (arr[i] < Smallest) {
				  Smallest = arr[i];
				  
			  }
		  }
			   System.out.println( "Smallest Number  Array is : " +  Smallest);
			    sc.close();
			  
		  
		 
	}

}
