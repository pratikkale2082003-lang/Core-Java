package revisionllogic;

public class secondlargest {

	 public static void main(String [] args) {
		 
		  int arr [] = {4,8,9,7,5,6};
		  
		   int largest = 0;
		   
		    for (int i = 0; i< arr.length; i++) {
		    	
		    	 if ( arr[i] > largest) {
		    		  largest = arr[i];
		    		  
		    	 }
		    }
		     System.out.println("Largest Array : ");
		     
		      int second = 0;
		      for(int i = 0; i < arr.length; i++) {
		    	  
		    	   if (arr[i] > second && arr[i] != largest) {
		    		   
		    		    second = arr[i];
		    		    
		    	   }
		      }
		       System.out.println("Sec7ond  Largest  : " + second);
		       
	 }
}
