package practical;
//Sum of index Array
import java.util.*;
public class sumofIndexArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int n = sc.nextInt();
		
		 int arr[] = new int [n];
		 System.out.print("Enter the Element : ");
		  for(int i =0; i<arr.length; i++) {
			  arr[i]= sc.nextInt();
		  }
		
		
 
 int sum = 0;
 for (int i =0; i<arr.length; i++) {
	 sum +=i;
	 
 }
 System.out.println(" Sum of index  is  : " + sum);
	}

}
