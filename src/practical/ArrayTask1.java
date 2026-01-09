package practical;
import java.util.*;
public class ArrayTask1 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
					Scanner sc = new Scanner(System.in);
					
					System.out.print("Enter Size arr1 : ");
					int n = sc.nextInt();
					
					int arr[]= new int[n];	
		
					System.out.print("Enter Size arr2 : ");
					int num = sc.nextInt();
					
					int arr2[] = new int[num];
					
					
						
					if (n == num) {
						System.out.println("Both are Equal size...");
						System.out.println("Enter the arr1 Element : ");
						 for(int i = 0; i<n; i++ ) {
							 arr[i]= sc.nextInt();
						 }
						 System.out.println("\n------------------------------------------------------");
						
						 System.out.println("Enter the arr2 Element : ");
						  for (int i = 0; i<num; i++) {
							  arr2[i] = sc.nextInt();
							  
						  }
					
						   if (Arrays.equals(arr, arr2)) {
							   System.out.println("Both are Equal ");
						   }
					
						   else {
							   System.out.println("not are equal...");
						   }
					
					}	else {
						System.out.println("Not Size Equal.........");
					}
						sc.close();	 
					}	 
								 
						 }
					
							 				 