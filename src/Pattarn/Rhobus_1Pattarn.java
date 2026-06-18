package Pattarn;
//     11111
//    11111
//   11111
//  11111
// 11111

public class Rhobus_1Pattarn {

	 public  static  void main(String [] args) {
		 
		  for ( int i = 1; i<=5; i++) {
			  
			   for ( int s = 5; s>= i; s--) {
				   System.out.print(" ");
			   }
			   
			    for ( int j = 1; j<=5; j++) {
			    	 System.out.print("1");
			    }
			     System.out.println();
		  }
	 }
}
