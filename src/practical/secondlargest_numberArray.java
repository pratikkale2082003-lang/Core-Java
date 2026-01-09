package practical;

public class secondlargest_numberArray {
   public static void main(String[] args) {
	
	   
	    int number[] = {5,7,4, 9,3};
	    
	     int largest = 0;
	      int second = 0;
	      
	
	      
	      for ( int i = 0; i< number.length;  i++) {
	    	  
	    	   if (number[i] > largest ) {
	    		    second = largest;
	    		    
	    		   largest = number[i];
	    		  

	    	   }
	    	   else  if( number[i] > second  && number[i]  != largest){
	    		   
	    	   }
	      }
	    	   System.out.println( "largest number is  : " + largest);
	    	   System.out.println( "Second largest number is  : " +  second);
	       
}
}
