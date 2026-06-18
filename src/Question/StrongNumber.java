package Question;

public class StrongNumber {

	 public static  void main(String[] args) {
		 
		  int n = 145;
		   int num = n;
		   int sum = 0;
		   
		    while ( n > 0) {
		    	
		     int rem = n % 10;
		     
		      int f = 1;
		       for ( int i = 1; i<=rem; i++) {
		    	    f = f * i;
		    	    
		       }
		         sum = sum + f;
		         n = n / 10;
		    }
		    
		    
		     if (sum ==  num) {
		    	 System.out.println( num + " Strong Number ");
		     }
		     else {
		    	  System.out.println( num+" Not Strong Number ");
		     }
	 }
}
