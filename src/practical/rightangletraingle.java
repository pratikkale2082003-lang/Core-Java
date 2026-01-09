package practical;

import java.util.Scanner;

public class rightangletraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 row 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		 int n = sc.nextInt();
		 for ( int i = 1; i<=n; i++) {
			 
//			  column
			 
			  for( int j =1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
			   sc.close();
		 }
	}

}
