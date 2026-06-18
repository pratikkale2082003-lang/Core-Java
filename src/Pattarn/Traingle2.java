package Pattarn;
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 

public class Traingle2 {

	 public static void main(String[] args) {
		 
		  int  n= 5;
		  
		   for ( int i = 1; i<=n; i++) {
			    for (int s = n; s>=i; s--) {
			    	System.out.print(" ");
			    }
			     for ( int j =1; j<=i; j++) {
			    	
			    	  if (  i % 2 == 0) {
			    	  System.out.print("1 ");
			     }
			     else {
			    	  System.out.print("0 ");
			     }
			     }
			     System.out.println();
		   }
		   
		   
		    for ( int i = n+1; i>=1; i--) {
		    	 for ( int  s = n; s>=i; s--) {
		    		 
		    		  System.out.print(" ");
		    	 }
		    	 
		    	  for ( int j = 1; j<=i; j++) {
		    		   if (i % 2 == 0) {
		    		   System.out.print("1 ");
		    	  }
		    		   else {
		    			   System.out.print("0 ");
		    		   }
		    	  }
		    	   System.out.println();
		    }
	}
	 
	 
}
