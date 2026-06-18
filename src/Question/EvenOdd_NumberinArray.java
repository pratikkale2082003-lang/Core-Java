package Question;

public class EvenOdd_NumberinArray {

	 public static void main(String[] args) {
		 int arr[] = {9,4,5,6,7};
		 
		  int even = 0;
		   int odd = 0;
		   
		    for ( int i = 0; i < arr.length; i++) {
		    	
		    	 System.out.print( arr[i] + " : ");
		    	  if ( arr[i] % 2 == 0) {
		    		   System.out.println("Even Number");
		    		    even++;
		    		    
		    	  }
		    	  
		    	  else {
		    		   System.out.println("Odd Number");
		    		     odd++;
		    		     
		    	  }
		    }
		    
		     System.out.println("Even Elements Count are : " + even);
	 System.out.println("Odd Elements Count are : " + odd );
	 }
}
