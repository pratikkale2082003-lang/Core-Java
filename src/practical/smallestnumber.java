package practical;

 import java.util.*;
 
public class smallestnumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   int c = sc.nextInt();
	   int d = sc.nextInt();
	   
	   if(a < b && a<c && a < d) {
		   System.out.println(" Smallest numbers is " + a);
	   }
	   else if(b < c && b < d && b < a) {
		   System.out.println("Smallest number is " + b );
	   }
	   else if( c < d && c < a && c < b) {
		   System.out.println("Smallest number is " + c);
		   
	   }
	   else {
		   System.out.println("Smallest number is " + d);
		    sc.close();
		   
	   }
	}

}
