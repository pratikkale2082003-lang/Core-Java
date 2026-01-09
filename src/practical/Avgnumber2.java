package practical;

import java.util.Scanner;

public class Avgnumber2 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
//	
		 
		System.out.println( "Enter the Element");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		 int sum = a+b+c+d;
		 
		 
		 double avg = sum / 4;
		 
		  System.out.print("averge number is : " + avg);
		 
	}
}