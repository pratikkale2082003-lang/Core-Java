package corejava;

// Write a Program a remove the duplicate Elements of a given  Array.

public class TestBset_Q3 {

	public static void main(String[] args) {
		
		 int arr [ ]  = {12, 45,77,45,23};
		 
		  int remove[]  = new int [arr.length];
		  
		   int count;
		    System.out.println("After Removing Duplicate Elements ");
			  
		     for (int i = 0; i<arr.length; i++) {
		    	 
		    	  count = 0; 
		    	  
		    	  for ( int j = i+1;  j< arr.length; j++) {
		    		     if ( arr[i] == arr[j] ){
		    		    	  count++;
		    		    	  
		    		  
		    	  }
		     }
		    	  
		    	   if ( count == 0) {
		    		    remove [i] =  arr[i];
		    		    
		    		    
		    	   }
		    	     if (remove[i] != 0)
		    	    	 System.out.print(remove[i] + " ");
		  
	}
	}
}
