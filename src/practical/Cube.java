package practical;

import java.util.Scanner;

public class Cube {

	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Number : ");
		 int n = sc.nextInt();
		 
		 
		 int cube = n * n* n;
		 
		  System.out.println("Cube of  " + n + " = " + cube );
	}
}
