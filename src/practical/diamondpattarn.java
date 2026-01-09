package practical;

import java.util.Scanner;

// diamond pattarn  
public class diamondpattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the Number : ");
             int n = sc.nextInt();
//             row 
		for(int i = 1; i<=n; i++) {
			
//			space
			 for( int s =n; s>=i; s--) {
				 System.out.print(" ");
			 }
			 
			 //column
			  for( int j =1 ; j<=i; j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
			
		}
//		 2nd half reverse   step 1
		
             for(int i = n-1; i>=1; i--) {
			
//			space
			 for( int s =n; s>=i; s--) {
				 System.out.print(" ");
			 }
			 
			 //column
			  for( int j =1 ; j<=i; j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
			
		}
		
	
		
////		third  half     step - 2
////		row
//		 for( int i=1; i<=n; i++) {
//			 
////			 space
//			  for(int s =1; s<=i; s++) {
//				  
//				  System.out.print(" ");
//			  }
////			  column
//			   for(int j=n; j>=i; j--) {
//				   System.out.print("* ");
//			   }
//			   System.out.println();
//
//}
             
             sc.close();
}

}
