package task;


 import java.util.*;
 
//enter the city from user array input
public class task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter city :  ");
		
		
		
		
		int n = sc.nextInt();
		
		String arr [] = new String[n];
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = sc.next();
		}
		 System.out.println("city name is : ");
		 
		  for(int i=0; i<arr.length; i++) {
			  System.out.println(arr[i]);
		  }
		
	}
	
}
