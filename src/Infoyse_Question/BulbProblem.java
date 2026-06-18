package Infoyse_Question;

import java.util.Scanner;

public class BulbProblem {

	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number of bulbs : ");
		  int n = sc.nextInt();
		  
		  
		   int onBulbs = (int) Math.sqrt(n);
		   
		  
		   System.out.println("Bulbs ON after all rounds : " + onBulbs);
		    System.out.println("Bulb Position that remain ON : ");
		    
		     for (int i = 1; i * i <=n; i++) {
		    	  System.out.print((i * i ) + " ");
		     }
	 }
}
