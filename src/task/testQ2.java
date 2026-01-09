package task;

import java.util.Scanner;

//Write a progran to find the factorial of a number.
public class testQ2 {

	public static int fact(int n) {
		int f = 1;
		for(int i = 1; i<=n; i++) {
		 f= f *i;
		 
		}
		 return f;
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
	
System.out.println(fact(n));
 sc.close();
		  }
		
		
	}


