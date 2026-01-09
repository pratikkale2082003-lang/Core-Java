package practical;

public class halfbutterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 1 st half
		 int n = 4;
	       for( int i=1; i<=n; i++){
	           //stars -i
	           for( int j= 1; j<=i; j++){
	               System.out.print("*");
	           }
	           
	       
//	            part 2
	           
	           for (int j = 1; j<= 2*(n-i); j++) {
	               System.out.print(" ");
	           }
	               //stars 
	              for( int j=1; j<=i; j++){
	               System.out.print("*");
	   
	              }
	              System.out.println();
	           }
	}

}
