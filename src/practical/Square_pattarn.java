package practical;

import java.util.*;


//  solid_Square pattarn;
  
public class Square_pattarn {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
           int n = sc.nextInt();
           
//	        	row = i
		 for( int i = 1; i<=n; i++) {
			 
			 
//			  colum = j
			  for( int j = 1; j<=n; j++) {
				  System.out.print("*" + " ");
			  }
			 System.out.println();
			  sc.close();
		 }
	}
}
