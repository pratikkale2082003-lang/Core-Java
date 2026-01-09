package practical;
 import java.util.*;
public class prime1 {

	
	 public static boolean  prime(int n ){
		
		  
		 for(int i = 2 ;i<n; i++)   {
			  if ( n % i == 0) {
				   return false;
				
			  }
		 }	  
			  
			   return true; 
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n =  sc.nextInt();
		 System.out.println( prime(n));
		  sc.close();
		  
	}

}
