package revisionllogic;

import java.util.Scanner;

public class Fibnochi {

	
	 public static int fib(int n) {
		 
		  if ( n == 0 || n == 1){
			
			   return n;
			   
		  }
		  
		   int f1 = fib(n-1);
		   int  f2 = fib(n-2);
		    int fn = f1+ f2;
		    return fn;
		        
	 }
	public static void main(String [] args) {
		
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the Numeber : ");
		  
		 int n = sc.nextInt();
		  System.out.println(fib(n));
		  
		   sc.close();
		  
	}
}
