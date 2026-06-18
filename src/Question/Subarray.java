package Question;

public class Subarray {

	 public static void main(String[] args) {
		
		  int arr [] = { 1,2,3};
		  
		   int n = arr.length;
		   
		    for (int i = 1; i< n ; i++) {
		    	
		    	 for (int  j = i; j< n; j++) {
		    		 
		    		  for (int k  = i; k<=j; k++) {
		    			  
		    			   System.out.print( arr[k] + " ");
		    		  }
		    		   System.out.println();
		    	 }
		    	 
		    }
	}
	 
}
