package Pattarn;

//1
//22
//333
//4444
//55555


public class TestBset_Q6 {

public static void main(String[] args) {

	 int n = 5;
	 

	 for ( int i = 1; i<=n; i++) {
		 
		  for (int s = n; s >= i; s--) {
			  
			   System.out.print(" ");
		  }
		   for ( int j = 1; j<=i; j++) {
			    System.out.print(i);
		   }
		   System.out.println();
	 }

}

}
