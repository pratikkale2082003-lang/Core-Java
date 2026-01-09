package practical;

import java.util.Scanner;

// Factorial series
public class factorial3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		 int n = sc.nextInt();
		
		 
		  int f = 1;
		  System.out.println("factorial series :");
		  for(int i =1; i <= n; i++) {
			   f= f *i;
			   System.out.println( i +" !:  = " + f);
			   
			   sc.close();
		  }
	}

}
