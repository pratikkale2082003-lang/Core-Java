package Question;

public class CountofArray_Number{

	
	 public static void main(String[] args) {
		
		  int arr[] = {4,8,9,4,7,5,8,7,9,4};
		  
		    boolean  arr1[] = new  boolean [arr.length];
		    
		     for ( int i = 0; i < arr.length; i++) {
		    	 
		    	  int  count = 1;
		    	  
		    	   if (arr1[i] == true) {
		    		 continue;
		    		 
		    		   
		    	   }
		    	    for ( int  j = i+1; j <  arr.length; j++) {
		    	    	
		    	      if ( arr[i] == arr[j]) {
		    	    	  arr1[j] = true; 
		    	    	  count++;
		    	    	  
		    	      }
		    	    }
		    	       System.out.println(arr[i] + " -> " + count);
		    	    
		     }
	}
}
