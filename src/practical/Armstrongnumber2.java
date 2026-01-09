package practical;

import java.util.Scanner;

public class Armstrongnumber2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number  : ");
         int n = sc.nextInt();
 
	 int num = n;
	 int sum = 0;
	 int digits = String.valueOf(n).length();
		while(n > 0) {
			 int rem = n % 10;
			 sum =  sum +  (int)Math.pow( rem ,digits);
			 
			  n = n / 10;
		}  
			  
		
		
		 if ( sum == num) {
		 System.out.println( num + " its is armstrong number ");
	}
 else {
			 System.out.println(num + " its not  armstrong number");
		 
 }

sc.close();
 
	}

}
