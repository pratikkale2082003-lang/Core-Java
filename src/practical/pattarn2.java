package practical;
//****
// ****
//  ****
//   ****


//Solid Rhombus pattarn  right angle ;
 import java.util.*;
 
public class pattarn2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
//		 row
		for( int i = 1; i <=n; i++) {
			
//			space
			 for( int s = 1; s<=i; s++ ) {
				 System.out.print(" ");
			 }
//			  colum
			   for( int j = 1; j<=n; j++) {
				   System.out.print("*");
			   }
			   System.out.println();
			    sc.close();
			    
		}

	}

}
