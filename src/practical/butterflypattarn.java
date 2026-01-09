package practical;

public class butterflypattarn {

	public static void main(String[] args) {
		
//		  i = row
//		  j =col		  
//		  s = space
		 int n = 8;

		 for ( int i =1; i<=n; i++) {
			  for (int j =1; j<=i; j++) {
				  System.out.print("*");
			  } 
			  

			   for(int s =1; s<= 2 * (n-i); s++) {
				   System.out.print(" ");
			   }
			  
			    for (int j =1; j<=i; j++) {
			    	System.out.print("*");
			    }
			  System.out.println();
		 }
		 
		 
//		  2 nd half
		 
		 
		  for( int i = n; i>=i; i--) {
			  
			   for( int j = 1; j<=i; j++) {
		 System.out.print("*");
		  }
			   
			 for ( int s =1; s<=2*(n-i); s++)  {
				 System.out.print(" ");
			 }
			 
			  for(int j = 1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
	}

}
