package Question;


//  Lcm Find
import java.util.Scanner;

public class Using_Gcd_farmula {

	
	public static int findGCD(int a , int b) {
		while (b != 0) {
			int temp = b;
			 b = a % b;
			 a = temp;
			 
		}
		 return a ;
	}
	 public static void main(String[] args) {
		 
		  Scanner sc = new Scanner( System.in);
		  System.out.print("Enter Number1 :");
		 int num1 =  sc.nextInt();
		 System.out.print("Enter Number2 :");
		 int num2 =  sc.nextInt();
		  int gcd = findGCD(num1, num2);
		  int lcm = (num1 * num2) / gcd;
		  
		   System.out.println("gcd = " + gcd);
		   System.out.println("Lcm is : "+ lcm);
	}
//	 LCM=GCDnum1×num2/gcd​
}
