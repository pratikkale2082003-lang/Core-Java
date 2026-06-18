package revisionllogic;

import java.util.Scanner;

public class FibnochiSeries {

	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Number : ");
		 int n = sc.nextInt();
		 
		  int a = 0;
		  int b = 1;
		  
		   int c;
		   
		    for (int i = 0; i < n; i++) {
		    	 System.out.println("Fibnochi Number " + i + " : " + a);
		    	  c  = a + b; 
		    	   a = b;
		    	    b = c;
		    	    
		    	    sc.close();
		    }
	 }
}
