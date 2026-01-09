package practical;

public class RATAnglepascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 4;
	       for( int i=1; i<=n; i++){
	           //stars -i
	           for( int j= 1; j<=i; j++){
	               System.out.print("@");
	           }
	           System.out.println();
	       }
	           
	           for ( int i =1; i<=n; i++) {
	 			  
	 			  
				   for( int j = n; j>=i; j--) {

					   System.out.print("@");
				   }
				   System.out.println();
	       }
	}

}
