package Question;

import java.util.Scanner;

public class Decimal_to_binary {

	 public static  void  dectobin(int n) {
		 int mynum = n;
		  int pow = 0;
		  int binnum = 0;
		   while(n > 0) {
			    int rem = n % 2;
			    binnum = binnum + (rem * (int)Math.pow(10,pow));
			    pow++;
			    n = n / 2;
			    
		   }
		    System.out.println("Binary From of  " + mynum+ " = "+binnum);
		    
	 }
	 public static void main(String[] args) {
		 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the Number : ");
	 int n = sc.nextInt();
	 dectobin(n);
	 sc.close();
	}
}
