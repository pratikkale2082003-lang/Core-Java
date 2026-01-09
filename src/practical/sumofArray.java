package practical;
// Sum of Array number
 import java.util.*;
 
public class sumofArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Size Number : ");
		int n = sc.nextInt();
		
		 int arr [] =  new int[n];
		 
		 System.out.println("Enter the Element : ");
		   for (int i = 0; i<arr.length; i++) {
			   
			    arr[i]= sc.nextInt();
			    
			   
		   }
		 
		 int sum = 0;
		 
		 for(int i = 0; i<arr.length; i++) {
			 
			  sum += arr[i];
		 }
			  System.out.println("Sum of Array is : " +sum);
			   sc.close();
		 

	}

}
