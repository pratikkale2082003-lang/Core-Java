package corejava;

import java.util.Scanner;

public class hallowrectangle {
	
	 public static void main(String [] args) {
		
		 Scanner sc =  new Scanner(System.in);
		 
		 System.out.print("Enter the Row : ");
		 int row = sc.nextInt();
		 
		 System.out.print("Enter the colum :");
		 int col = sc.nextInt();
		 
//		 int row = 4;
//		 int col  = 5;
//		 
		 for(int i = 1; i<=row; i++) {
			 
	    for(int j = 1; j <= col; j++) {
		
	    	
	    if(i == 1|| i == row || j == 1 || j ==col) {
	    	
	    	System.out.print("*");
	    	
	    }
				
	    else {
	    	 System.out.print(" "); 
	    }	  	  
			  }
	    System.out.println();
		 }
	
}
	
	
	
	

}
//  public static  void hallowrecatangle(int totrow, int totcol) {
////	  outer loop
//	 for(int i = 1; i<=totrow; i++) {   // rows
//		 
////		 inner loop
//		  for(int j = 1; j<=totcol; j++) { //column
//			  
//			   if(i == 1 || i==totrow|| j==1|| j==totcol) {
//				    System.out.print("*");
//				   
//			   }
//			   else {
//				   System.out.print(" ");
//			   }
//		  }
//		  
//		  System.out.println();
//		  
//	 }
//	  
//  }
//	
//	
//	public static void main(String [] args) {
//		
//		 hallowrecatangle(4,5);
//	}
//}
