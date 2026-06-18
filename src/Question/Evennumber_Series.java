package Question;

import java.util.Scanner;

public class Evennumber_Series {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter The Number : ");
		   int n = sc.nextInt();
		   
		    for (int i = 1; i <= n; i++) {
		    	
		    	 if ( i % 2 == 0) {
		    		 
		    		  System.out.print(i + " ");
		    	 }
		    }
	}
}
