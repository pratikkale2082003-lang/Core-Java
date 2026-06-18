package Question;

import java.util.Scanner;

public class Decendingorder_Number {

	 public static void  printdec(int n) {
		 
		  if (n == 1) {
			  System.out.println(n);
			  return;
			  
		  }
		   System.out.print(n + " ");
		    printdec(n-1);
		    
		    
	 }
	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the Number : ");
		  int  n = sc.nextInt();
		  
		  
		   printdec(n);
		    sc.close();
		  
	}
}
