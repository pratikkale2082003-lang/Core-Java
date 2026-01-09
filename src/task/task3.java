package task;

import java.util.*;

public class task3 {

	
	 public static void main(String [] args) {
             Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number :");
		 int  n = sc.nextInt();
		 
			
			if( n>0) {
				System.out.println("  positive number ");
			}
			else if(n==0) {
				
				System.out.println("zero number");
				
			}
			else {
				System.out.println("negative number");
			}
	 }
}
