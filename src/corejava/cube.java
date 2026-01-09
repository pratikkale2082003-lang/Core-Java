package corejava;

import java.util.Scanner;

public class cube {
 
//	 public static void main(String [] args) {
//		 
//		  int n = 5;
//		  
//		   int  cube = n * n * n;
//		   
//		 
//		   System.out.println( n + " cube is : " + cube);
//	 }
//}

	
	public static void main(String []args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			 int  cube = i*i*i;
			System.out.println(i + " cube is : " + cube);
			sc.close();
		}
	}
}