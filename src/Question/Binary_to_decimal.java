package Question;

import java.util.Scanner;

public class Binary_to_decimal {

	
	public static void binTtodec(int n) {
		int mynum = n;
		int pow = 0;
		int decnum = 0;
		 while(n > 0) {
			  int lastdigit = n % 10;
			  decnum = decnum + lastdigit * (int)Math.pow(2, pow);
			  pow++;
			  n = n / 10;
			  
		 }
		  System.out.println("Decimal of " + mynum +  " = "+ decnum);
	}
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		binTtodec( n);
		sc.close();
	}
}
