package practical;
//1111
//0  0
//1  1
//0000

public class pattarn20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int row =4; 
		  int  col = 4;
		  
		   for(int i = 1; i<=row; i++ ) {
			   
			    for(int j =1; j<=col; j++) {
			    	
			    	 if( i == 1 || i == row || j ==1 || j == col) {
			    		  if ( (i )% 2  == 1) {
			    		  
			    		 System.out.print("1");
			    	 }
			    		  else {
			    			  System.out.print("0");
			    		  }
			    	 }
			    	 else {
			    		 System.out.print(" ");
			    	 }
			    }
			    System.out.println();
		   }
	}

}
