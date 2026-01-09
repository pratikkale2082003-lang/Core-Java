package Question;

public class DuplicateArray {

	 public static void main(String[] args) {
		 int arr [] = {4,8,9,5,2,5,7};
		 
		  int count  = 0;
		  
		    for ( int i = 0; i < arr.length; i++) {
		    	
		    	 for (int j = i+1; j< arr.length; j++) {
		    	   if (arr[i] == arr[j]) {
		    		     System.out.println("Duplicate array is : " + arr[i]);
		    		      count++;
		    		      
		    	   }
		    	   }
		    }
		    
		     if ( count != 0) {
		    	 
		    	  System.out.println("present Duplicate Array ");
		     }
		     else {
		    	  System.out.println(" Not present Duplicate Array");
		     }
	}
}
