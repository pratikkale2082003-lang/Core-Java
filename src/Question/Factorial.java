package Question;

import java.util.Scanner;

public class Factorial {
public  static int fact(int n ) {
	 if ( n == 1) {
		 return n ;
		 
	 }
	 
	  int f1 = fact(n-1);
	  int fn = n * f1;
	  return fn;
}
	
	
	
public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter The Number :");
	  int n = sc.nextInt();
	  
	   System.out.println(fact(n));
	 
}
	 
}
