package practical;

 import java.util.*;
 
public class reversenumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter  Number : ");
		  int n = sc.nextInt();
//		  
		  
		   int rev = 0;
		    while ( n > 0) {
		    	    int rem = n % 10;
		    	     rev = rev* 10 +rem;
		    	      n = n / 10;
		    }
		    	   
	   System.out.println( "the reverse number is  : " + rev);
 sc.close();
	}

	
}
