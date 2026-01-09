package practical;

public class pattarn21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 3;
	
	
//		
//		 int count = 1;
//		 
		 for(int i = 1; i<=n; i++) {
			 
			  for (int s = n; s>=i; s--) {
				  System.out.print(" ");
			  }
			  for (int j = 1; j<= 2 *i -1; j++) {
				  System.out.print("*");
				   
			  }
			   System.out.println();
		 }
	
	 for (int i = n-1;  i>=1; i--) {
		 
		  for(int s = n ;s>=i; s--) {
			  System.out.print(" ");
		  }

		  for (int j = 1; j<=2 *i -1; j++) {
			  System.out.print("*");
	 }
		   System.out.println();
	}
	}
	}

