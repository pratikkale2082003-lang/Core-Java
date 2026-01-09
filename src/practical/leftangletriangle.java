package practical;

public class leftangletriangle {

	public static void main(String[] args) {
		 int n= 5;
//		  int row
		 for ( int i = 1; i<=n; i++) {
			 
//			  space
			  for( int s = n; s>i; s--) {     
				  System.out.print(" ");
				  
			  }
//                 col
			   for(int j =1; j <=i; j++) {
				   System.out.print("*");
			   }
			   System.out.println();
		 }

	}

}

//for( int s = n; s>i; s--) 
//    for (int s = 1; s<=n-i; s++) {