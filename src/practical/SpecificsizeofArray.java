package practical;

import java.util.Scanner;

public class SpecificsizeofArray {

	public static void main(String[] args) {

		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = sc.nextInt();
		
		int number [] = new int[n];
		
		System.out.println("Enter the Element : ");
		 for(int i = 0; i<number.length; i++) {
			 number[i]= sc.nextInt();
			 
		 }
		 
		 
		
		
		 System.out.print("Enter the specific  : ");
		 int key = sc.nextInt();
		  int i;
		 
		  for ( i =0; i<number.length; i++) {
			  if (  number[i] == key) {
				  key = number[i];
				  
				  System.out.println(key + " index is : " + i);
				  break;
			  }
		  }
		
		 
		 if( i == n) {
			 System.out.println(key+ " not found the  value");
			 
		 }
		 
	sc.close();
		 
		 
		 
	}
}