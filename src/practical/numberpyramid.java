package practical;

public class numberpyramid {

	public static void Number_pyaramid(int n ) {
		
		
//		  row
		 for ( int i = 1; i<=n; i++) {
			  
//			 space
			  for(int s = n; s>=i; s--) {
				  System.out.print(" ");
			  }
//			   colum
			   for(int j =1; j<=i; j++) {
				   System.out.print(i + " ");
			   }
			   
			   System.out.println();
		 }
	}
	
	
	public static void main(String[] args) {
		
Number_pyaramid(5);
	}

}
