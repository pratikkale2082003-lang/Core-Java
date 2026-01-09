package corejava;
 import java.util.*;
public class fibnochiii {
  public static int fibnochii(int n) {
	   if(n == 0 || n == 1) {
		   return n;
	   }
	   
	    int fn1 = fibnochii(n-1);
	     int fn2 = fibnochii(n-2);
	     
	     int fn = fn1 + fn2;
	     
	     
	      return fn;
	  
  }
	
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		 int n = sc.nextInt();
		

		System.out.println( "Fibnochi number is : " + fibnochii(n));
		
	}

}
