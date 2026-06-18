package Question;

import java.util.Scanner;

public class Ascendingorder_Number {

	
	 public static void printinc(int n ) {
		 
		  if (n == 1) {
		  System.out.print(n + " ");
		  
		   return ; 
		   
		   
	 }
	 
	  printinc(n-1);
	  System.out.print( n + " ");
	 }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter NUmber : ");
		  int n = sc.nextInt();
		  
		   printinc(n);
		   sc.close();
	}
	
}
