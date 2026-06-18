package Pattarn;
//0 0 0 0 0 
// 1 1 1 1 
//  0 0 0 
//   1 1 
//    0 

public class Pattarn8 {

	 public static void main(String[] args) {
		
	int n = 5;
	
	 for ( int i = 1; i<=n;  i++ ) {
		   for(int s = 1;  s<=i; s++) {
			    System.out.print(" ");
		   }
		    for (int j = n; j>=i; j--) {
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