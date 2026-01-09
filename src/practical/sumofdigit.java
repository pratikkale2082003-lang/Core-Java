package practical;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number :" );
		 int n = sc.nextInt();
		  int sum = 0;
		  
		   while(n > 0) {
			    int temp = n % 10; 
			     sum = sum + temp;
			     
			      n = n / 10;
			      
		   }
		    System.out.println("Sum of  digit : " + sum);
		    sc.close();

	}

}

// find the smallest number