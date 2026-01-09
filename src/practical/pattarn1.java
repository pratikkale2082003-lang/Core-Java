
//101010
//101010
//101010
//101010
//101010
//101010

package practical;
 

 import java.util.*;
 
public class pattarn1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = sc.nextInt();
	
	
	  for( int r = 1; r<=n;  r++) {
		  
		   for ( int c = 1; c<=n; c++) {
			   
			    if ( c % 2 == 0) {
			    	System.out.print("0");
			    }
			    else {
			    	System.out.print("1");
			    }
		   }
		   System.out.println();
		    sc.close();
	  }
}
}
