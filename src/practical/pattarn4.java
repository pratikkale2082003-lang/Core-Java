package practical;
//11111
//0   0
//1   1
//0   0
//11111

public class pattarn4 {

	public static void main(String[] args) {
		
		 int row = 5;
		 int col = 5;
//		   row
		  for(int i =1; i<=row; i++) {
			  
			  
			   for(int j =1; j<=col; j++) {
				   
				   
				    if (i==1 || i ==row|| j==1|| j==col) {
				    	
				    	 if ( i  % 2 != 0) {
				    System.out.print("1");
				    	 }
				    	 else {
				    	System.out.print("0");
				    }
			   }else{
				    	System.out.print(" ");
				    }
			   }
			   System.out.println();
		  }
		
	}
}
	
