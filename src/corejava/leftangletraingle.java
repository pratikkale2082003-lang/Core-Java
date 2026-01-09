package corejava;

public class leftangletraingle {

public static void main(String []args) {
	 //row
	  for(int i = 1; i<=5; i ++) {
		   
//		  space
		  for(int s = i; s<5; s++) {
			  System.out.print(" ");
		  }
			  
			 // colum 
			  for(int j = 1; j<=i; j++) {
				  System.out.print("*");
				  
			  }
			  
			  System.out.println();
	  }
}
}

	
//row
//	 for(int i =1; i<=5; i++) {
//		 
////		 space
//		  for(int s =5; s>i; s--) {
//			  System.out.print(" ");
//			  
//		  }
//		  for(int j = 1; j<=i; j++) {
//			  System.out.print("*");
//		  }
//		  System.out.println();
//	 }
//	
//}
//}