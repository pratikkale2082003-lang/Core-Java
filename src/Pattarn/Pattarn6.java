package Pattarn;
//@#@#
// @#@#
//  @#@#
//   @#@#

public class Pattarn6 {

	public static void main(String[] args) {
		for(int i = 1; i<=4; i++) {
			
			 for (int s =1; s<=i; s++) {
				 System.out.print(" ");
			 }
			  for ( int j = 1; j<=4; j++) {
				  
				    if ( j %2 == 1) {
				    	 System.out.print("@");
				    }
				    else {
				    	System.out.print("#");
				    }
			  }
			   System.out.println();
		}
	}
}
