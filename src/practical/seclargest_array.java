package practical;

public class seclargest_array {
	
	   public static void main(String[] args) {
		
		   
		    int number[] = {5,7,4, 9,3};
		    
		     int largest = 0;
		      
		      
		      for ( int i = 0; i< number.length;  i++) {
		    	  
		    	   if (number[i] > largest ) {
		    		    
		    		    
		    		   largest = number[i];
		    		  

		    	   }
		    	   
		      }
		    	   System.out.println( "largest number is  : " + largest);
		    	   
	   
		    	   int second = 0;
		    	   for ( int i = 0; i< number.length;  i++) {
		    		    if (number[i] > second  && number[i] != largest) {
		    		    	second = number[i];
		    		    }
		    		   
		    	   }
		    	   System.out.println( "Second largest number is  : " +  second);
		       
	   }
	   
}

