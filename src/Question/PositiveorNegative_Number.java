package Question;

import java.util.Scanner;

public class PositiveorNegative_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Number : ");
	 
	  
	 int n =  sc.nextInt();
	  if ( n > 0) {
		  System.out.println("Positive Number");
	  }
	  else if (n==0) {
		  System.out.println("Zero Number");
	  }
	  else {
		  System.out.println("Negative Number");
	  }
	  sc.close();
}
}
