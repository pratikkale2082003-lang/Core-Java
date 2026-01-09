package practical;

import java.util.*;

public class largestnumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Number : ");
		int a =  sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if(a > b &&  a > c ) {  // if(a > b && a > c) {
			System.out.println("the largest number is a");
			
		}
		 if( b > c  & b > a) { //	 if( b > c  && b > a) {

			 System.out.println("the largest number is b");
		 }
		 else {
			 System.out.println("the largest number is c");
			 sc.close();
		 }

	}

}
