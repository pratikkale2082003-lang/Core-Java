package practical;

// using  function factorial method 
import java.util.Scanner;

public class factorialusingfunction {
	public static int fact(int n ) {
		 int f = 1;
		 for(int i =1; i<=n; i++) {
			 f = f * i;
		 }
		  return f;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		 int n = sc.nextInt();
		  for( int i = 1; i<=n; i++ ) {
			  System.out.println(i + " != " + fact(i));
			  
			  sc.close();
			            
		  }
		
		 
	}
	}


