package Exceptionhandling;

import java.util.*;

 class InvaildevenException extends Exception{
	 
	public InvaildevenException(String name) {
		 super(name);
		 
	}
 }

public class customizedException {
public static void main(String[] args) throws InvaildevenException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	 int n = sc.nextInt();
	 
	 if (n % 2 == 0) {
		 System.out.println("Even Number ");
	 }
	 else {
		throw new InvaildevenException("Odd Number ");
	 }
}
}
