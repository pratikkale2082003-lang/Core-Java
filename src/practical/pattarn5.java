package practical;

public class pattarn5 {

	public static void main(String[] args) {
		
		 int n = 4;
//		  row
		 for( int i = 1; i <=n; i++) {
			 
//			 space
			  for(int s= 1; s<=i; s++) {
				  
				  System.out.print(" ");
			  }
//			  column
			   for(int j =1; j<=n; j++) {
				    if ( j %  2 == 0) {
				    	
				    
				   System.out.print("#");
			   }
				  
			   else {
				    	System.out.print("@");
				    }
			   
			   }System.out.println();
		 }

	}

}
