package Recursion;

import java.util.Scanner;

public class Factorial_recursion {
 
	
	 public  static int fact(int n ) {
		 if  (n == 0) {
			 return 1;
		 }
		 
		  int f1 = fact(n-1);
		  int f2 = f1 * n;
		  
		return f2;
		 
	 }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number : ");
		   int n = sc.nextInt();
		   
		   
		   
		 System.out.println(fact(n));
		  sc.close();
	}
}
