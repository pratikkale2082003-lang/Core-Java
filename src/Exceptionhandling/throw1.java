package Exceptionhandling;
//invalidAgeException
import java.util.Scanner;

public class throw1 {

	public static void main(String[] args) throws invalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		 if (age >= 18) { 
			 System.out.println("eligible  for voting ");
		 }
		 else {
			 throw new invalidAgeException("not eligible for voting");
		 }

	}

}
