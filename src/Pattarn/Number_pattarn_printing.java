package Pattarn;

//1 
//2 1 2 
//3 2 1 2 3 
//4 3 2 1 2 3 4

public class Number_pattarn_printing {

	public static void main(String[] args) {
		
		int n = 4;
		
	
	 for ( int i = 1; i<=n; i++ ) {
		 
		  for ( int k = i; k>1; k--) {
			  System.out.print(k+ " ");
		  }
		  
		  for (int j = 1; j<=i; j++) {
			   System.out.print(j+ " ");
			   
		  }
		   System.out.println();
	 }
}
}