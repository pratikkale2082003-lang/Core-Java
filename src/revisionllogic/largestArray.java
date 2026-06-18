package revisionllogic;

public class largestArray {

	
	 public static void main(String [] args) {
		 
		  int arr [] = {4,5,8,9,8,7};
		  
		   int largest = arr[0];
		    
		    for(int i = 0; i < arr.length; i++) {
		    	
		    	 if(arr[i] >  largest) {
		    		 
		    		  largest = arr[i];
		    		  
		    	 }
		    	
		    }
		    System.out.println("Largest Array : " + largest);
		    
		   
		   
		   
	 }
}
