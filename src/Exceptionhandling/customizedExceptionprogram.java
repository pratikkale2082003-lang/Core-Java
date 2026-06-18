package Exceptionhandling;

import java.util.Scanner;

class AgeExecption extends Exception{
	 
	  public  AgeExecption(String age) {
		  super(age);
		  
	  }
 }
 
public class customizedExceptionprogram {
	
public static void main(String[] args) throws AgeExecption {
	
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter Age : ");
	 int n = sc.nextInt();
	 
	 
	  if ( n >= 18) {
		  System.out.println("Eligible For Voting");
	  }
	  else {
		  throw new  AgeExecption ("Not ELigible For Voting");
		  
	  }
}
}