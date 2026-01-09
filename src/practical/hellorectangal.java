package practical;

 import java.util.*;
 
public class hellorectangal {

	
	 public static void main(String[] args) {
		
		  Scanner sc =  new Scanner(System.in);
		  System.out.print("Enter the Row : ");
		    int row = sc.nextInt();
		    System.out.print("Enter the Col : ");
		    int col = sc.nextInt();
		    
//		    row
		     for( int i =1 ; i <=row; i++) {
		    	 
		    	  for(int j =1; j<=col; j++) {
		    		  
		    		   if( i == 1 || i==row|| j ==1 || j == col) {
		    			   System.out.print("*");
		    		   }
		    		   else {
		    			 System.out.print(" ");
		    		   }
		    	  }
		    	  
		    	  System.out.println();
		    	   sc.close();
		    	   
		    	  
		     }
	}
}
