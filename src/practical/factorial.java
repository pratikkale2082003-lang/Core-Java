package practical;
import java.util.*;
public class factorial {

	 public static int fact(int n ) {
		  if( n== 1) {
			   return n;
			   
		  }
		   int fnm1 = fact(n-1);
		     int fn =  n * fnm1;
		      return fn;
		 
	 }
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		 int n = sc.nextInt();
		System.out.println( fact(n));
		 sc.close();
	}

}
